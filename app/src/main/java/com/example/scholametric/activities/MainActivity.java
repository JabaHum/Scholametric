package com.example.scholametric.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.scholametric.Api.ApiInterface;
import com.example.scholametric.R;
import com.example.scholametric.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText usr = findViewById(R.id.username);
        final EditText pwd = findViewById(R.id.password);
        final Button login_btn = findViewById(R.id.login_button);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.137.1/android_login_api")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usr.getText().toString();
                String password = pwd.getText().toString();

                if(validateLogin(username, password)){
                    //do login
                    doLogin(username, password);
                }

            }
        });
    }
    private boolean validateLogin(String username, String password){
        if(username == null || username.trim().length() == 0){
            Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(password == null || password.trim().length() == 0){
            Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void doLogin(final String username,final String password){

        Call <List<Users>> call = apiInterface.getUsersDetails();
        call.enqueue(new Callback<List<Users>>() {
            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                if(response.isSuccessful()){
                    Users users = (Users) response.body();
                    if(users!=null){
                        if(users.getUsername().equals(username)&& users.getPassword().equals(password)){
                            //login start main activity
                            Intent intent = new Intent(MainActivity.this, SecondActvity.class);
                            startActivity(intent);

                        } else {
                            Toast.makeText(MainActivity.this, "The username or password is incorrect", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }

            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed to make connection to server", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
