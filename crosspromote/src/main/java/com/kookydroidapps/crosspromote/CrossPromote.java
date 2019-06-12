package com.kookydroidapps.crosspromote;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kookydroidapps.api.AppsClient;
import com.kookydroidapps.modelclasses.App;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CrossPromote extends AppCompatActivity {
    String url;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        if (extras!= null)
        {
            url = extras.getString("url");
        }

        AppsClient appsClient = new Retrofit.Builder()
                .baseUrl("https://crosspromote.firebaseio.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(AppsClient.class);

        Call<List<App>> call = appsClient.getApps(url);
        call.enqueue(new Callback<List<App>>() {
            @Override
            public void onResponse(Call<List<App>> call, Response<List<App>> response) {
                Log.d("Apps", response.body().toString());
            }

            @Override
            public void onFailure(Call<List<App>> call, Throwable t) {
                Log.e("Crosspromote","Apps", t);
            }
        });
    }
}
