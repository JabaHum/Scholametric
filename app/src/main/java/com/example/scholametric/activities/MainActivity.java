package com.example.scholametric.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.scholametric.Api.ApiInterface;
import com.example.scholametric.R;
import com.example.scholametric.model.Users;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.scholametric.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {
    EditText usr;
    EditText pwd;
    Button login_btn;
    ApiInterface apiInterface;
    private static final String TAG = "Response Data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        usr = findViewById(R.id.username);
        pwd = findViewById(R.id.password);
        login_btn = findViewById(R.id.login_button);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.137.1/android_login_api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiInterface = retrofit.create(ApiInterface.class);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usr.getText().toString();
                String password = pwd.getText().toString();

                if (validateLogin(username, password)) {
                    //do login
                    //doLogin(username, password);
                    //doLogin();
                    intentlogin();
                }

            }
        });
    }

    private boolean validateLogin(String username, String password) {
        if (username == null || username.trim().length() == 0&& username.equals("jaba")) {
            Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (password == null || password.trim().length() == 0&&password.equals("1234")) {
            Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    //TODO retrofit call section
    private void doLogin(final String username, final String password) {
        //final String username,final String password

  Call <List<Users>> call = apiInterface.getUsersDetails();
        call.enqueue(new Callback<List<Users>>() {

            @Override
            public void onResponse(@NonNull Call <List<Users>> call, @NonNull Response<List<Users>> response) {



                if(response.isSuccessful()){

                    Log.e("Success", new Gson().toJson(response.body()));

                    Users users = (Users) response.body();


                    if(users!= null) {

                        Log.i(TAG,users.getUsername());
                        Log.i(TAG,users.getPassword());


                        if (users.getUsername().equals(username)) {
                            if (users.getPassword().equals(password)) {
                                //login start main activity
                                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                                startActivity(intent);

                            } else {
                                Toast.makeText(MainActivity.this, "The Password is incorrect", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "The Username is incorrect", Toast.LENGTH_SHORT).show();
                        }

                    }
                    Toast.makeText(MainActivity.this,"No Data Has been retrieved",Toast.LENGTH_SHORT).show();



                }
                Log.e("unSuccess", new Gson().toJson(response.errorBody()));
            }

            @Override
            public void onFailure(@NonNull Call<List<Users>> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity.this, "Failed to make connection to server", Toast.LENGTH_SHORT).show();
                Log.e("onFailure", t.toString());
            }
        });
    }

    private void intentlogin(){
       Intent intent = new Intent(MainActivity.this,DashboardActivity.class);
       startActivity(intent);
    }
}