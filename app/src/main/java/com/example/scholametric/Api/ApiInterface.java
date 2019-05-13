package com.example.scholametric.Api;

import com.example.scholametric.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("android_login_api/")
    Call <List<Users>> getUsersDetails();
}
