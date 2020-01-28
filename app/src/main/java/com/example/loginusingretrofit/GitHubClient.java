package com.example.loginusingretrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GitHubClient {


    @POST("/erp_login?")
    @FormUrlEncoded
    Call<ResponseBody> login(@Field("org") String org, @Field("username") String username, @Field("password") String password, @Field("syskey") String syskey);

   /* @GET("erp_login?")
    Call<ResponseBody> getUserDetails(
    @Query("org") String org,
    @Query("username") String username,
    @Query("password") String password,
    @Query("syskey") String key);*/

}
