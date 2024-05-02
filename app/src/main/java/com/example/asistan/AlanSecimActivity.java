package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlanSecimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alan_secim);
    }

    public void sayisal(View view) {

        Intent intent = new Intent(AlanSecimActivity.this, SayisalActivity.class);
        startActivity(intent);

    }

    public void sözel(View view) {

        Intent intent = new Intent(AlanSecimActivity.this, SozelActivity.class);
        startActivity(intent);

    }

    public void esitAgirlik(View view) {

        Intent intent = new Intent(AlanSecimActivity.this, EsitAgirlikActivity.class);
        startActivity(intent);

    }
}