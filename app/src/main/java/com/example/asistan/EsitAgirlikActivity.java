package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EsitAgirlikActivity extends AppCompatActivity {

    EditText TYTMatetmatikDogruText,TYTMatematikYanlisText,TYTTurkceDogruText,TYTTurkceYanlisText,TYTFenDogruText,TYTFenYanlisText,TYTSosyalDogruText,TYTSosyalYanlisText;
    EditText MatematikDogruText,MatematikYanlisText,EdebiyatYanlisText,EdebiyatDogruText,Tarih1YanlisText,Tarih1DogruText,Cografya1YanlisText,Cografya1DogruText;
    EditText diplomaPuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayt_esit_agirlik);

        TYTMatetmatikDogruText = findViewById(R.id.tytMatematikDogruText);
        TYTMatematikYanlisText = findViewById(R.id.tytMatematikYanlisText);
        TYTTurkceDogruText = findViewById(R.id.tytTurkceDogruText);
        TYTTurkceYanlisText = findViewById(R.id.tytTurkceYanlisText);
        TYTFenDogruText = findViewById(R.id.tytFenDogruText);
        TYTFenYanlisText = findViewById(R.id.tytFenYanlisText);
        TYTSosyalDogruText = findViewById(R.id.tytSosyalDogruText);
        TYTSosyalYanlisText = findViewById(R.id.tytSosyalYanlisText);
        MatematikDogruText = findViewById(R.id.MatematikDogruText);
        MatematikYanlisText = findViewById(R.id.MatematikYanlisText);
        EdebiyatDogruText = findViewById(R.id.edebiyatDogruText);
        EdebiyatYanlisText = findViewById(R.id.edebiyatYanlisText);
        Tarih1DogruText = findViewById(R.id.tarih1DogruText);
        Tarih1YanlisText = findViewById(R.id.tarih1YanlisText);
        Cografya1DogruText = findViewById(R.id.cografya1YanlisText);
        Cografya1YanlisText = findViewById(R.id.cografya1YanlisText);
        diplomaPuan = findViewById(R.id.diplomaText);
    }

    public  void EsitAgirlikHesapla(View view){

        Double tytTurkceDogru = Double.parseDouble(TYTTurkceDogruText.getText().toString());
        Double tytTurkceYanlis = Double.parseDouble(TYTTurkceYanlisText.getText().toString());
        Double tytMatematikDogru = Double.parseDouble(TYTMatetmatikDogruText.getText().toString());
        Double tytMatematikYanlis = Double.parseDouble(TYTMatematikYanlisText.getText().toString());
        Double tytFenDogru = Double.parseDouble(TYTFenDogruText.getText().toString());
        Double tytFenYanlis = Double.parseDouble(TYTFenYanlisText.getText().toString());
        Double tytSosyalDogru = Double.parseDouble(TYTSosyalDogruText.getText().toString());
        Double tytSosyalYanlis = Double.parseDouble(TYTSosyalYanlisText.getText().toString());

        Double MatematikDogru = Double.parseDouble(MatematikDogruText.getText().toString());
        Double MatematikYanlis = Double.parseDouble(MatematikYanlisText.getText().toString());
        Double EebiyatDogru = Double.parseDouble(EdebiyatDogruText.getText().toString());
        Double EdebiyatYanlis = Double.parseDouble(EdebiyatYanlisText.getText().toString());
        Double TarihDogru = Double.parseDouble(Tarih1DogruText.getText().toString());
        Double TarihYanlis = Double.parseDouble(Tarih1YanlisText.getText().toString());
        Double CografyaDogru = Double.parseDouble(Cografya1DogruText.getText().toString());
        Double CografyaYanlis = Double.parseDouble(Cografya1YanlisText.getText().toString());

        Double DiplomaPuan = Double.parseDouble(diplomaPuan.getText().toString());

        if ((tytTurkceDogru + tytTurkceYanlis) <= 40 && (tytMatematikDogru + tytMatematikYanlis) <= 40 && (tytFenDogru + tytFenYanlis) <= 20 && (tytSosyalDogru + tytSosyalYanlis) <= 20 && (MatematikDogru + MatematikYanlis) <= 40 && (EebiyatDogru + EdebiyatYanlis) <= 24 && (TarihDogru + TarihYanlis) <= 10 && (CografyaDogru + CografyaYanlis) <= 6) {

            Double tytTurkceNet = tytTurkceDogru - (tytTurkceYanlis/4);
            Double tytMatematikNet = tytMatematikDogru - (tytMatematikYanlis/4);
            Double tytFenNet = tytFenDogru - (tytFenYanlis/4);
            Double tytSosyalNet = tytSosyalDogru - (tytSosyalYanlis/4);

            Double MatematikNet = MatematikDogru - (MatematikYanlis/4);
            Double EdebiyatNet = EebiyatDogru - (EdebiyatYanlis/4);
            Double TarihNet = TarihDogru - (TarihYanlis/4);
            Double CografyaNet = CografyaDogru - (CografyaYanlis/4);

            Double DiplomaPuani = DiplomaPuan * 0.6;


            Double tytTurkceP = tytTurkceNet * 1.31;
            Double tytMatematikP = tytMatematikNet * 1.57;
            Double tytFenP = tytFenNet * 1.47;
            Double tytSosyalP = tytSosyalNet * 1.28;
            Double MatematikP = MatematikNet * 3.17;
            Double TarihP = TarihNet * 2.99;
            Double CografyaP = CografyaNet * 2.40;
            Double EdebiyatP = EdebiyatNet * 3.00;
            Double EsitAgirliklYerlestirmeP = tytTurkceP + tytMatematikP + tytFenP + tytSosyalP + MatematikP + EdebiyatP + TarihP + CografyaP + DiplomaPuani + 100 ;

            String TYTTurkceNet =  String.valueOf(String.format( "%.2f",tytTurkceNet));
            String TYTMatematikNet = String.valueOf(String.format("%.2f",tytMatematikNet));
            String TYTFenNet = String.valueOf(String.format("%.2f",tytFenNet));
            String TYTSosyalNet = String.valueOf(String.format("%.2f",tytSosyalNet));

            String MateNet = String.valueOf(String.format("%.2f",MatematikNet));
            String EdebNet = String.valueOf(String.format("%.2f",EdebiyatNet));
            String TarhNet = String.valueOf(String.format("%.2f",TarihNet));
            String CografNet = String.valueOf(String.format("%.2f",CografyaNet));

            String esitAgirliklYerlestirmeP =String.valueOf(String.format("%.2f",EsitAgirliklYerlestirmeP));

            Intent intent = new Intent(EsitAgirlikActivity.this, AytEsitAgirlikSonucActivity.class);
            intent.putExtra("TYTTurkceNet1",TYTTurkceNet);
            intent.putExtra("TYTMatematikNet1",TYTMatematikNet);
            intent.putExtra("TYTFenNet1",TYTFenNet);
            intent.putExtra("TYTSosyalNet1",TYTSosyalNet);

            intent.putExtra("MateNet",MateNet);
            intent.putExtra("EdebNet",EdebNet);
            intent.putExtra("TarhNet",TarhNet);
            intent.putExtra("CografNet",CografNet);

            intent.putExtra("esitAgirliklYerlestirmeP",esitAgirliklYerlestirmeP);
            startActivity(intent);


        }else{
            Toast.makeText(EsitAgirlikActivity.this,"Girilen değerler geçersizdir.",Toast.LENGTH_LONG).show();
        }
    }


}