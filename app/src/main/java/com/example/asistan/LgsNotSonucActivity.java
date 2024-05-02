package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LgsNotSonucActivity extends AppCompatActivity {

    TextView Matematik,Turkce,Fen,Din,Inklap,Yabnaci,Yerlestirme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgs_not_sonuc);

        Matematik = findViewById(R.id.matText);
        Turkce = findViewById(R.id.turkText);
        Fen = findViewById(R.id.fenText);
        Din = findViewById(R.id.dinText);
        Inklap = findViewById(R.id.inklapText);
        Yabnaci = findViewById(R.id.yabnaciText);
        Yerlestirme = findViewById(R.id.yerlestirmeText);

        Intent intent = getIntent();
        String YerleştirmePuani = intent.getStringExtra("YerleştirmePuani");
        String MatNet = intent.getStringExtra("TurkceNet");
        String TurkNet = intent.getStringExtra("MatematikNet");
        String FenNet = intent.getStringExtra("FenNet");
        String YabanNet = intent.getStringExtra("YabanciNet");
        String InklapNet = intent.getStringExtra("InklapNet");
        String DinNet = intent.getStringExtra("DinNet");



        Yerlestirme.setText("Yerleştirme Puanı: " + YerleştirmePuani);
        Matematik.setText("Matematik Net: " + MatNet);
        Turkce.setText("Türkçe Net: " + TurkNet);
        Fen.setText("Fen Bilimler Net: " + FenNet);
        Yabnaci.setText("Yabancı Dil Net: " + YabanNet);
        Inklap.setText("İnklap Tarihi Net: " + InklapNet);
        Din.setText("Din Kültürü Net: " + DinNet);

    }
}