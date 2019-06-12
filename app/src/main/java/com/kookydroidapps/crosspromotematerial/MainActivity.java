package com.kookydroidapps.crosspromotematerial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.kookydroidapps.crosspromote.CrossPromote;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, CrossPromote.class);
        intent.putExtra("url", "https://crosspromote.firebaseio.com/recipe.json");
        startActivity(intent);
    }
}
