package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AytSayisalSonucActivity extends AppCompatActivity {

    TextView tytMatematik,tytTurkce,tytFen,tytSosyal,Matematik,Fizik,Kimya,Biyoloji,YerleştirmeP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayt_sayisal_sonuc);

        tytMatematik = findViewById(R.id.tytMatematikText);
        tytTurkce = findViewById(R.id.tytTurkceText);
        tytFen = findViewById(R.id.tytFenText);
        tytSosyal = findViewById(R.id.tytSosyalText);
        Matematik = findViewById(R.id.MatematikText);
        Fizik = findViewById(R.id.EdebiyatText);
        Kimya = findViewById(R.id.MatematikText);
        Biyoloji = findViewById(R.id.Cografya_1Text);
        YerleştirmeP = findViewById(R.id.YerleştimeText);

        Intent intent = getIntent();


        String tytTurkcePuan1 = intent.getStringExtra("TYTTurkceNet1");
        String tytMatematikPuan1 = intent.getStringExtra("TYTMatematikNet1");
        String tytFenPuan1 = intent.getStringExtra("TYTFenNet1");
        String tytSosyalPuan1 = intent.getStringExtra("TYTSosyalNet1");
        String MateNet = intent.getStringExtra("MateNet");
        String FizNet = intent.getStringExtra("FizNet");
        String KimNet = intent.getStringExtra("KimNet");
        String BiyoNet = intent.getStringExtra("BiyoNet");
        String sayisalYerlestirmeP = intent.getStringExtra("sayisalYerlestirmeP");


        tytMatematik.setText("TYT Matematik Net: " + tytMatematikPuan1);
        tytTurkce.setText("TYT Türkçe Net: " + tytTurkcePuan1);
        tytFen.setText("TYT Fen Net: " + tytFenPuan1);
        tytSosyal.setText("TYT Sosyal Net: " + tytSosyalPuan1);
        Matematik.setText("Matematik Net: " + MateNet);
        Fizik.setText("Fizik Net: " + FizNet);
        Kimya.setText("Kimya Net: " + KimNet);
        Biyoloji.setText("Biyoloji Net: " + BiyoNet);
        YerleştirmeP.setText("Sayısal Yerleştirme Puan: " + sayisalYerlestirmeP);




    }
}