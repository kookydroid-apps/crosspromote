package com.kookydroidapps.api;

import com.kookydroidapps.modelclasses.Apps;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface AppsClient {
    @GET
    Call<Apps> getApps(@Url String url);
}
