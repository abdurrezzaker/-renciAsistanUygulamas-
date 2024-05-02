package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AytEsitAgirlikSonucActivity extends AppCompatActivity {

    TextView tytMatematik,tytTurkce,tytFen,tytSosyal,Matematik,Edebiyat,Tarih,Cografya,YerleştirmeP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esit_agirlik_sonuc);

        tytMatematik = findViewById(R.id.tytMatematikText);
        tytTurkce = findViewById(R.id.tytTurkceText);
        tytFen = findViewById(R.id.tytFenText);
        tytSosyal = findViewById(R.id.tytSosyalText);
        Matematik = findViewById(R.id.MatematikText);
        Edebiyat = findViewById(R.id.EdebiyatText);
        Tarih = findViewById(R.id.Tarih_1Text);
        Cografya = findViewById(R.id.Cografya_1Text);
        YerleştirmeP = findViewById(R.id.YerleştimeText);

        Intent intent = getIntent();


        String tytTurkcePuan = intent.getStringExtra("TYTTurkceNet1");
        String tytMatematikPuan = intent.getStringExtra("TYTMatematikNet1");
        String tytFenPuan = intent.getStringExtra("TYTFenNet1");
        String tytSosyalPuan = intent.getStringExtra("TYTSosyalNet1");
        String MateNet = intent.getStringExtra("MateNet");
        String EdebNet = intent.getStringExtra("EdebNet");
        String TarhNet = intent.getStringExtra("TarhNet");
        String CografNet = intent.getStringExtra("CografNet");
        String esitAgirliklYerlestirmeP = intent.getStringExtra("esitAgirliklYerlestirmeP");


        tytMatematik.setText("TYT Matematik Net: " + tytMatematikPuan);
        tytTurkce.setText("TYT Türkçe Net: " + tytTurkcePuan);
        tytFen.setText("TYT Fen Net: " + tytFenPuan);
        tytSosyal.setText("TYT Sosyal Net: " + tytSosyalPuan);
        Matematik.setText("Matematik Net: " + MateNet);
        Edebiyat.setText("Edebiyat Net: " + EdebNet);
        Tarih.setText("Tarih-1 Net: " + TarhNet);
        Cografya.setText("Cografya-1 Net: " + CografNet);
        YerleştirmeP.setText("Eşit Ağırlık Yerleştirme Puan: " + esitAgirliklYerlestirmeP);
    }
}