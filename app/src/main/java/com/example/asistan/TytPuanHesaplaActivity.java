package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TytPuanHesaplaActivity extends AppCompatActivity {

    EditText turkceYanlisText,turkceDogruText,matematikDogruText,matematikYanlisText,fenYanlisText,fenDogruText,sosyalDogruText,sosyalYanlisText,diplomaNotuText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tyt_puan_hesapla);

        turkceDogruText = findViewById(R.id.TurkceDogruText);
        turkceYanlisText = findViewById(R.id.TurkceYanlisText);
        matematikDogruText = findViewById(R.id.MatematikDogruText);
        matematikYanlisText = findViewById(R.id.MatematikYanlisText);
        fenDogruText = findViewById(R.id.FenDogruText);
        fenYanlisText = findViewById(R.id.FenYanlisText);
        sosyalDogruText = findViewById(R.id.SosyalDogruText);
        sosyalYanlisText = findViewById(R.id.SosyalYanlisText);
        diplomaNotuText = findViewById(R.id.DiplomaNotuText);
    }

    public void tytHesapla(View view){

        Double TurkceDogru = Double.parseDouble(turkceDogruText.getText().toString());
        Double TurkceYanlis = Double.parseDouble(turkceYanlisText.getText().toString());
        Double MatematikDogru = Double.parseDouble(matematikDogruText.getText().toString());
        Double MatematikYanlis = Double.parseDouble(matematikYanlisText.getText().toString());
        Double FenDogru = Double.parseDouble(fenDogruText.getText().toString());
        Double FenYanlis = Double.parseDouble(fenYanlisText.getText().toString());
        Double SosyalDogru = Double.parseDouble(sosyalDogruText.getText().toString());
        Double SosyalYanlsi = Double.parseDouble(sosyalYanlisText.getText().toString());
        Double DiplomaNotu = Double.parseDouble(diplomaNotuText.getText().toString());

        if ((TurkceDogru + TurkceYanlis) <= 40 && (MatematikDogru + MatematikYanlis) <= 40 && (FenDogru + FenYanlis) <= 20 && (SosyalDogru + SosyalYanlsi) <= 20 ){

            Double TurkceNet = TurkceDogru - (TurkceYanlis/4);
            Double MatematikNet = MatematikDogru - (MatematikYanlis/4);
            Double FenNet = FenDogru - (FenYanlis/4);
            Double SosyalNet = SosyalDogru -(SosyalYanlsi/4);

            Double TurkceP = (TurkceNet) * 3.14;
            Double MatematikP = (MatematikNet) * 3.72;
            Double FenP = (FenNet) * 3.03;
            Double SosyalP = (SosyalNet) * 3.49;
            Double DiplomaP = (DiplomaNotu) * 0.6;
            Double YerlestirmeP = TurkceP + MatematikP + FenP + SosyalP + DiplomaP + 100;


            String YerleştirmePuan =  String.valueOf(String.format( "%.2f",YerlestirmeP));
            String TürkçeNet = String.valueOf(String.format("%.2f",TurkceNet));
            String MatematıkNet = String.valueOf(String.format("%.2f",MatematikNet));
            String FennNet = String.valueOf(String.format("%.2f",FenNet));
            String SosyallNet = String.valueOf(String.format("%.2f",SosyalNet));

            Intent intent = new Intent(TytPuanHesaplaActivity.this,tytPuanSonucActivity.class);
            intent.putExtra("YerleştirmePuani", YerleştirmePuan);
            intent.putExtra("TurkceNet",TürkçeNet);
            intent.putExtra("MatematikNet",MatematıkNet);
            intent.putExtra("FenNet",FennNet);
            intent.putExtra("SosyalNet",SosyallNet);
            intent.putExtra("YerleştirmePuani", YerleştirmePuan);
            startActivity(intent);
            

        }
        else{
            Toast.makeText(TytPuanHesaplaActivity.this,"Girilen değerler geçersizdir.",Toast.LENGTH_LONG).show();
        }


    }
}