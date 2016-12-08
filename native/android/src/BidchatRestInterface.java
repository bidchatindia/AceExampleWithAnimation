package com.rahulverlekar.nativelist;


import com.google.gson.JsonElement;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by abhik on 05-10-2016.
 */
public interface BidchatRestInterface {

    @Headers("Authorization:Basic YmlkY2hhdF9hZG1pbl9zdTp1ZiZLOVlWdSVFJEo5bnco")
    @GET("broadcasterListQuery")
    Call<HashMap<String, JsonElement>> listBroadcast();

    @Headers("Authorization:Basic YmlkY2hhdF9hZG1pbl9zdTp1ZiZLOVlWdSVFJEo5bnco")
    @GET("broadcasterListQuery")
    Call<HashMap<String, JsonElement>> listBroadcast(@Query("limit") int limit,
                                        @Query("start") int offset);

}
