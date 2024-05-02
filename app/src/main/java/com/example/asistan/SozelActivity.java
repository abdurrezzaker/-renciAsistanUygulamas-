package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SozelActivity extends AppCompatActivity {
    EditText TYTMatetmatikDogruText2,TYTMatematikYanlisText2,TYTTurkceDogruText2,TYTTurkceYanlisText2,TYTFenDogruText2,TYTFenYanlisText2,TYTSosyalDogruText2,TYTSosyalYanlisText2;
    EditText EdebiyatDogruText,EdebiyatYanlisText,Tarih_1YanlisText,Tarih_1DogruText,Tarih_2YanlisText,Tarih_2DogruText,Cografya_1YanlisText,Cografya_1DogruText,Cografya_2YanlisText,Cografya_2DogruText,FelsefeYanlisText,FelsefeDogruText,DkabYanlisText,DkabDogruText;
    EditText diplomaPuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sozel);

        TYTMatetmatikDogruText2 = findViewById(R.id.tytMatematikDogruText2);
        TYTMatematikYanlisText2 = findViewById(R.id.tytMatematikYanlisText2);
        TYTTurkceDogruText2 = findViewById(R.id.tytTurkceDogruText2);
        TYTTurkceYanlisText2 = findViewById(R.id.tytTurkceYanlisText2);
        TYTFenDogruText2 = findViewById(R.id.tytFenDogruText2);
        TYTFenYanlisText2 = findViewById(R.id.tytFenYanlisText2);
        TYTSosyalDogruText2 = findViewById(R.id.tytSosyalDogruText2);
        TYTSosyalYanlisText2 = findViewById(R.id.tytSosyalYanlisText2);
        EdebiyatDogruText = findViewById(R.id.edebiyatDogruText);
        EdebiyatYanlisText = findViewById(R.id.edebiyatYanlisText);
        Tarih_1DogruText = findViewById(R.id.tarih1DogruText);
        Tarih_1YanlisText = findViewById(R.id.tarih1YanlisText);
        Tarih_2DogruText = findViewById(R.id.tarih2DogruText);
        Tarih_2YanlisText = findViewById(R.id.tarih2YanlisText);
        Cografya_1DogruText = findViewById(R.id.cografya1DogruText);
        Cografya_1YanlisText = findViewById(R.id.cografya1YanlisText);
        Cografya_2DogruText = findViewById(R.id.cografya2DogruText);
        Cografya_2YanlisText = findViewById(R.id.cografya2YanlisText);
        FelsefeDogruText = findViewById(R.id.felsefeDogruText);
        FelsefeYanlisText = findViewById(R.id.felsefeYanlisText);
        DkabDogruText = findViewById(R.id.dkabDogruText);
        DkabYanlisText = findViewById(R.id.dkabYanlisText);
        diplomaPuan = findViewById(R.id.diplomaText);

    }

    public void asd(View view){

        Double tytTurkceDogru = Double.parseDouble(TYTTurkceDogruText2.getText().toString());
        Double tytTurkceYanlis = Double.parseDouble(TYTTurkceYanlisText2.getText().toString());
        Double tytMatematikDogru = Double.parseDouble(TYTMatetmatikDogruText2.getText().toString());
        Double tytMatematikYanlis = Double.parseDouble(TYTMatematikYanlisText2.getText().toString());
        Double tytFenDogru = Double.parseDouble(TYTFenDogruText2.getText().toString());
        Double tytFenYanlis = Double.parseDouble(TYTFenYanlisText2.getText().toString());
        Double tytSosyalDogru = Double.parseDouble(TYTSosyalDogruText2.getText().toString());
        Double tytSosyalYanlis = Double.parseDouble(TYTSosyalYanlisText2.getText().toString());

        Double EdebiyatDogru = Double.parseDouble(EdebiyatDogruText.getText().toString());
        Double EdebiyatYanlis = Double.parseDouble(EdebiyatYanlisText.getText().toString());
        Double Tarih_1Dogru = Double.parseDouble(Tarih_1DogruText.getText().toString());
        Double Tarih_1Yanlis = Double.parseDouble(Tarih_1YanlisText.getText().toString());
        Double Cografya_1Dogru = Double.parseDouble(Cografya_1DogruText.getText().toString());
        Double Cografya_1Yanlis = Double.parseDouble(Cografya_1YanlisText.getText().toString());
        Double Tarih_2Dogru = Double.parseDouble(Tarih_2DogruText.getText().toString());
        Double Tarih_2Yanlis = Double.parseDouble(Tarih_2YanlisText.getText().toString());
        Double Cografya_2Dogru = Double.parseDouble(Cografya_2DogruText.getText().toString());
        Double Cografya_2Yanlis = Double.parseDouble(Cografya_2YanlisText.getText().toString());
        Double FelsefeDogru = Double.parseDouble(FelsefeDogruText.getText().toString());
        Double FelsefeYanlis = Double.parseDouble(FelsefeYanlisText.getText().toString());
        Double DkabDogru = Double.parseDouble(DkabDogruText.getText().toString());
        Double DkabYanlis = Double.parseDouble(DkabYanlisText.getText().toString());

        Double DiplomaPuani = Double.parseDouble(diplomaPuan.getText().toString());

        if ((tytTurkceDogru + tytTurkceYanlis) <= 40 && (tytMatematikDogru + tytMatematikYanlis) <= 40 && (tytFenDogru + tytFenYanlis) <= 20 && (tytSosyalDogru + tytSosyalYanlis) <= 20 && (EdebiyatDogru + EdebiyatYanlis) <= 24 && (Tarih_1Dogru + Tarih_1Yanlis) <= 10 && (Tarih_2Dogru + Tarih_2Yanlis) <= 11 && (Cografya_1Dogru + Cografya_1Yanlis) <= 6 && (Cografya_2Dogru + Cografya_2Yanlis) <= 11 && (FelsefeDogru + FelsefeYanlis) <= 12 && (DkabDogru + DkabYanlis) <= 6) {


            Double tytTurkceNet = tytTurkceDogru - (tytTurkceYanlis/4);
            Double tytMatematikNet = tytMatematikDogru - (tytMatematikYanlis/4);
            Double tytFenNet = tytFenDogru - (tytFenYanlis/4);
            Double tytSosyalNet = tytSosyalDogru - (tytSosyalYanlis/4);

            Double EdebiyatNet = EdebiyatDogru - (EdebiyatYanlis/4);
            Double Tarih_1Net = Tarih_1Dogru - (Tarih_2Yanlis/4);
            Double Tarih_2Net = Tarih_2Dogru - (Tarih_2Yanlis/4);
            Double Cografya_1Net = Cografya_1Dogru - (Cografya_2Yanlis/4);
            Double Cografya_2Net = Cografya_2Dogru - (Cografya_2Yanlis/4);
            Double FelsefeNet = FelsefeDogru - (FelsefeYanlis/4);
            Double DkabNet = DkabDogru - (DkabYanlis/4);

            Double DiplomaPuan = DiplomaPuani * 0.6;


            Double tytTurkceP = tytTurkceNet * 1.39;
            Double tytMatematikP = tytMatematikNet * 1.67;
            Double tytFenP = tytFenNet * 1.56;
            Double tytSosyalP = tytSosyalNet * 1.36;

            Double EdebiyatP = EdebiyatNet * 3.19;
            Double Tarih_1P = Tarih_1Net * 3.17;
            Double Tarih_2P = Tarih_2Net * 3.34;
            Double Cografya_1P = Cografya_1Net * 2.54;
            Double Cografya_2P = Cografya_2Net * 2.75;
            Double FelsefeP = FelsefeNet * 3.14;
            Double DkabP = DkabNet * 3.32;

            Double SozelYerlestirmeP = tytTurkceP + tytMatematikP + tytFenP + tytSosyalP + EdebiyatP + Tarih_1P + Tarih_2P + Cografya_1P + Cografya_2P + FelsefeP + DkabP + DiplomaPuan + 100;

            String TYTTurkceNet =  String.valueOf(String.format( "%.2f",tytTurkceNet));
            String TYTMatematikNet = String.valueOf(String.format("%.2f",tytMatematikNet));
            String TYTFenNet = String.valueOf(String.format("%.2f",tytFenNet));
            String TYTSosyalNet = String.valueOf(String.format("%.2f",tytSosyalNet));

            String edebiyatNet = String.valueOf(String.format("%.2f",EdebiyatNet));
            String tarih_1Net = String.valueOf(String.format("%.2f",Tarih_1Net));
            String tarih_2Net = String.valueOf(String.format("%.2f",Tarih_2Net));
            String cografya_1Net = String.valueOf(String.format("%.2f",Cografya_1Net));
            String cografya_2Net = String.valueOf(String.format("%.2f",Cografya_2Net));
            String felsefeNet = String.valueOf(String.format("%.2f",FelsefeNet));
            String dkabNet = String.valueOf(String.format("%.2f",DkabNet));

            String sozelYerlestirmeP =String.valueOf(String.format("%.2f",SozelYerlestirmeP));

            Intent intent = new Intent(SozelActivity.this,AytSozelSonucActivity.class);
            intent.putExtra("TYTTurkceNet",TYTTurkceNet);
            intent.putExtra("TYTMatematikNet",TYTMatematikNet);
            intent.putExtra("TYTFenNet",TYTFenNet);
            intent.putExtra("TYTSosyalNet",TYTSosyalNet);

            intent.putExtra("edebiyatNet",edebiyatNet);
            intent.putExtra("tarih_1Net",tarih_1Net);
            intent.putExtra("tarih_2Net",tarih_2Net);
            intent.putExtra("cografya_1Net",cografya_1Net);
            intent.putExtra("cografya_2Net",cografya_2Net);
            intent.putExtra("felsefeNet",felsefeNet);
            intent.putExtra("dkabNet",dkabNet);

            intent.putExtra("sozelYerlestirmeP",sozelYerlestirmeP);

            startActivity(intent);




        }else {

            Toast.makeText(SozelActivity.this,"Girilen değerler geçersizdir.",Toast.LENGTH_LONG).show();

        }


        }
}