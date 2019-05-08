package com.example.scholametric.Api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

    @GET("android_login_api/")
    Call login(@Path("username") String username, @Path("password") String password);
}
