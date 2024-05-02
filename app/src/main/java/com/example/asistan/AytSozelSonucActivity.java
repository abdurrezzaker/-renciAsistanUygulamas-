package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AytSozelSonucActivity extends AppCompatActivity {

    TextView tytMatematik,tytTurkce,tytFen,tytSosyal,Edebiyat,Tarih_1,Tarih_2,Cografya_1,Cografya_2,Felsefe,Dkab,YerleştirmeP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayt_sozel_sonuc);


        tytMatematik = findViewById(R.id.tytMatematikText);
        tytTurkce = findViewById(R.id.tytTurkceText);
        tytFen = findViewById(R.id.tytFenText);
        tytSosyal = findViewById(R.id.tytSosyalText);
        Edebiyat = findViewById(R.id.EdebiyatText);
        Tarih_1 = findViewById(R.id.MatematikText);
        Tarih_2 = findViewById(R.id.Tarih_1Text);
        Cografya_1 = findViewById(R.id.Cografya_1Text);
        Cografya_2 = findViewById(R.id.Cografya_2Text);
        Felsefe = findViewById(R.id.FelsefeText);
        Dkab = findViewById(R.id.DkabText);
        YerleştirmeP = findViewById(R.id.YerleştimeText);


        Intent intent = getIntent();

        String tytTurkcePuan2 = intent.getStringExtra("TYTTurkceNet");
        String tytMatematikPuan2 = intent.getStringExtra("TYTMatematikNet");
        String tytFenPuan2 = intent.getStringExtra("TYTFenNet");
        String tytSosyalPuan2 = intent.getStringExtra("TYTSosyalNet");


        String edebiyatNet = intent.getStringExtra("edebiyatNet");
        String tarih_1Net = intent.getStringExtra("tarih_1Net");
        String tarih_2Net = intent.getStringExtra("tarih_2Net");
        String cografya_1Net = intent.getStringExtra("cografya_1Net");
        String cografya_2Net = intent.getStringExtra("cografya_2Net");
        String felsefeNet = intent.getStringExtra("felsefeNet");
        String dkabNet = intent.getStringExtra("dkabNet");

        String sozelYerlestirmeP = intent.getStringExtra("sozelYerlestirmeP");

        tytMatematik.setText("TYT Matematik Net: " + tytMatematikPuan2);
        tytTurkce.setText("TYT Türkçe Net: " + tytTurkcePuan2);
        tytFen.setText("TYT Fen Net: " + tytFenPuan2);
        tytSosyal.setText("TYT Sosyal Net: " + tytSosyalPuan2);
        Edebiyat.setText("Edebiyat Net: " + edebiyatNet);
        Tarih_1.setText("Tarih-1 Net: " + tarih_1Net);
        Tarih_2.setText("Tarih-2 Net: " + tarih_2Net);
        Cografya_1.setText("Coğrafya-1 Net: " + cografya_1Net);
        Cografya_2.setText("Coğrafya-2 Net: " + cografya_2Net);
        Felsefe.setText("Felsefe Net: " + felsefeNet);
        Dkab.setText("Dkab Net: " + dkabNet);
        YerleştirmeP.setText("Sözel Yerleştirme Puan: " + sozelYerlestirmeP);
    }
}