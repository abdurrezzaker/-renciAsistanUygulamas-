package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class tytPuanSonucActivity extends AppCompatActivity {

    TextView Matematik,Turkce,Fen,Sosyal,Yerlestirme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyt_puan_sonuc);

        Matematik = findViewById(R.id.matText);
        Turkce = findViewById(R.id.turkText);
        Fen = findViewById(R.id.fenText);
        Sosyal = findViewById(R.id.sosyalText);
        Yerlestirme = findViewById(R.id.yerlestirmeText);

        Intent intent = getIntent();
        String YerleştirmePuani = intent.getStringExtra("YerleştirmePuani");
        String MatNet = intent.getStringExtra("TurkceNet");
        String TurkNet = intent.getStringExtra("MatematikNet");
        String FenNet = intent.getStringExtra("FenNet");
        String SosyalNet = intent.getStringExtra("SosyalNet");

        Matematik.setText("Matematik Net: " + MatNet);
        Turkce.setText("Türkçe Net: " + TurkNet);
        Fen.setText("Fen Bilimler Net: " + FenNet);
        Sosyal.setText("Sosyal Bilimler Net: " + SosyalNet);
        Yerlestirme.setText("Yerleştime Puanı: " + YerleştirmePuani);



    }
}