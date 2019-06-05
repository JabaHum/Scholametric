package com.example.scholametric.Api;

import com.example.scholametric.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiInterface {
    @Headers({
            "Accept: application/json; charset=UTF-8",
            "Content-Type: application/json"
    })

    @GET("android_login_api/v1/index.php")
    Call <List<Users>> getUsersDetails();
}