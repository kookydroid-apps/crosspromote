package com.kookydroidapps.api;

import com.kookydroidapps.modelclasses.App;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface AppsClient {
    @GET
    Call<List<App>> getApps(@Url String url);
}
