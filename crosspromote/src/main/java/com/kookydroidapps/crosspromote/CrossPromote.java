package com.kookydroidapps.crosspromote;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kookydroidapps.api.AppsClient;
import com.kookydroidapps.modelclasses.Apps;

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
            url = extras.getString("URL");
        }

        AppsClient appsClient = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(AppsClient.class);

        Call<Apps> call = appsClient.getApps(url);
        call.enqueue(new Callback<Apps>() {
            @Override
            public void onResponse(Call<Apps> call, Response<Apps> response) {
                Log.d("Apps", response.body().getApps().toString());
            }

            @Override
            public void onFailure(Call<Apps> call, Throwable t) {
                Log.e("Crosspromote","Apps", t);
            }
        });
    }
}
