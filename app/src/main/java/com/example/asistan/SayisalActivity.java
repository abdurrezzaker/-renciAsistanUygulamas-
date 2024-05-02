package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SayisalActivity extends AppCompatActivity {
    EditText TYTMatetmatikDogruText,TYTMatematikYanlisText,TYTTurkceDogruText,TYTTurkceYanlisText,TYTFenDogruText,TYTFenYanlisText,TYTSosyalDogruText,TYTSosyalYanlisText;
    EditText MatematikDogruText,MatematikYanlisText,FizikYanlisText,FizikDogruText,KimyaYanlisText,KimyaDogruText,BiyolojiYanlisText,BiyolojiDogruText;
    EditText diplomaPuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayisal);

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
        FizikDogruText = findViewById(R.id.fizikDogruText);
        FizikYanlisText = findViewById(R.id.fizikYanlisText);
        KimyaDogruText = findViewById(R.id.kimyaDogruText);
        KimyaYanlisText = findViewById(R.id.kimyaYanlisText);
        BiyolojiDogruText = findViewById(R.id.biyolojiDogruText);
        BiyolojiYanlisText = findViewById(R.id.biyolojiYanlisText);
        diplomaPuan = findViewById(R.id.diplomaText);

    }

    public void AytSaisalPuanHesapla(View view){

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
        Double FizikDogru = Double.parseDouble(FizikDogruText.getText().toString());
        Double FizikYanlis = Double.parseDouble(FizikYanlisText.getText().toString());
        Double KimyaDogru = Double.parseDouble(KimyaDogruText.getText().toString());
        Double KimyaYanlis = Double.parseDouble(KimyaYanlisText.getText().toString());
        Double BiyolojiDogru = Double.parseDouble(BiyolojiDogruText.getText().toString());
        Double BiyolojiYanlis = Double.parseDouble(BiyolojiYanlisText.getText().toString());

        Double DiplomaPuani = Double.parseDouble(diplomaPuan.getText().toString());

        if ((tytTurkceDogru + tytTurkceYanlis) <= 40 && (tytMatematikDogru + tytMatematikYanlis) <= 40 && (tytFenDogru + tytFenYanlis) <= 20 && (tytSosyalDogru + tytSosyalYanlis) <= 20 && (MatematikDogru + MatematikYanlis) <= 40 && (FizikDogru + FizikYanlis) <= 14 && (KimyaDogru + KimyaYanlis) <= 13 && (BiyolojiDogru + BiyolojiYanlis) <= 13) {

            Double tytTurkceNet = tytTurkceDogru - (tytTurkceYanlis/4);
            Double tytMatematikNet = tytMatematikDogru - (tytMatematikYanlis/4);
            Double tytFenNet = tytFenDogru - (tytFenYanlis/4);
            Double tytSosyalNet = tytSosyalDogru - (tytSosyalYanlis/4);

            Double MatematikNet = MatematikDogru - (MatematikYanlis/4);
            Double FizikNet = FizikDogru - (FizikYanlis/4);
            Double KimyaNet = KimyaDogru - (KimyaYanlis/4);
            Double BiyolojiNet = BiyolojiDogru - (BiyolojiYanlis/4);

            Double DiplomaPuani01 = DiplomaPuani * 0.6;


            Double tytTurkceP = tytTurkceNet * 1.23;
            Double tytMatematikP = tytMatematikNet * 1.48;
            Double tytFenP = tytFenNet * 1.38;
            Double tytSosyalP = tytSosyalNet * 1.20;
            Double MatematikP = MatematikNet * 2.98;
            Double FizikP = FizikNet * 3.11;
            Double KimyaP = KimyaNet * 3.13;
            Double BiyolojiP = BiyolojiNet * 3.08;
            Double SayisalYerlestirmeP = tytTurkceP + tytMatematikP + tytFenP + tytSosyalP + MatematikP + FizikP + KimyaP + BiyolojiP  + DiplomaPuani01 + 100 ;

            String TYTTurkceNet =  String.valueOf(String.format( "%.2f",tytTurkceNet));
            String TYTMatematikNet = String.valueOf(String.format("%.2f",tytMatematikNet));
            String TYTFenNet = String.valueOf(String.format("%.2f",tytFenNet));
            String TYTSosyalNet = String.valueOf(String.format("%.2f",tytSosyalNet));

            String MateNet = String.valueOf(String.format("%.2f",MatematikNet));
            String FizNet = String.valueOf(String.format("%.2f",FizikNet));
            String KimNet = String.valueOf(String.format("%.2f",KimyaNet));
            String BiyoNet = String.valueOf(String.format("%.2f",BiyolojiNet));

            String sayisalYerlestirmeP =String.valueOf(String.format("%.2f",SayisalYerlestirmeP));

            Intent intent = new Intent(SayisalActivity.this, AytSayisalSonucActivity.class);
            intent.putExtra("TYTTurkceNet1",TYTTurkceNet);
            intent.putExtra("TYTMatematikNet1",TYTMatematikNet);
            intent.putExtra("TYTFenNet1",TYTFenNet);
            intent.putExtra("TYTSosyalNet1",TYTSosyalNet);

            intent.putExtra("MateNet",MateNet);
            intent.putExtra("FizNet",FizNet);
            intent.putExtra("KimNet",KimNet);
            intent.putExtra("BiyoNet",BiyoNet);

            intent.putExtra("sayisalYerlestirmeP",sayisalYerlestirmeP);
            startActivity(intent);


        }else{
            Toast.makeText(SayisalActivity.this,"Girilen değerler geçersizdir.",Toast.LENGTH_LONG).show();
        }
        }
}