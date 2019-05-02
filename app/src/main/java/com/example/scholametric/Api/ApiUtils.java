package com.example.scholametric.Api;

public class ApiUtils {

    public static final String BASE_URL = "http://192.168.137.1/android_login_api/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}