package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class lgsPuanHesaplaActivity extends AppCompatActivity {

    EditText TurkceYanlisText,TurkceDogruText,MatematikDogruText,MatematikYanlisText,FenYanlisText,FenDogruText,DinDogruText,DinYanlisText,InklapDogruText,InklapYanlisText,YabnaciDogruText,YabanciYanlisText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgs_puan_hesapla);

        TurkceDogruText = findViewById(R.id.TurkceDogruText);
        TurkceYanlisText = findViewById(R.id.TurkceYanlisText);
        MatematikDogruText = findViewById(R.id.MatematikDogruText);
        MatematikYanlisText = findViewById(R.id.MatematikYanlisText);
        FenDogruText = findViewById(R.id.FenDogruText);
        FenYanlisText = findViewById(R.id.FenYanlisText);
        DinDogruText = findViewById(R.id.SosyalDogruText);
        DinYanlisText = findViewById(R.id.SosyalYanlisText);
        YabanciYanlisText = findViewById(R.id.YabanciYanlisText);
        YabnaciDogruText = findViewById(R.id.YabanciDogruText);
        InklapDogruText = findViewById(R.id.DiplomaNotuText);
        InklapYanlisText = findViewById(R.id.InklapYanlisText);

    }


    public void lgsHesapla(View view){

        Double TurkceDogru = Double.parseDouble(TurkceDogruText.getText().toString());
        Double TurkceYanlis = Double.parseDouble(TurkceYanlisText.getText().toString());
        Double MatematikDogru = Double.parseDouble(MatematikDogruText.getText().toString());
        Double MatematikYanlis = Double.parseDouble(MatematikYanlisText.getText().toString());
        Double FenDogru = Double.parseDouble(FenDogruText.getText().toString());
        Double FenYanlis = Double.parseDouble(FenYanlisText.getText().toString());
        Double DinDogru = Double.parseDouble(DinDogruText.getText().toString());
        Double DinYanlsi = Double.parseDouble(DinYanlisText.getText().toString());
        Double YabanciDogru = Double.parseDouble(YabnaciDogruText.getText().toString());
        Double YabanciYanlis = Double.parseDouble(YabanciYanlisText.getText().toString());
        Double InklapDogru = Double.parseDouble(InklapDogruText.getText().toString());
        Double InklapYanlis = Double.parseDouble(InklapYanlisText.getText().toString());

        if ((TurkceDogru + TurkceYanlis) <= 20 && (MatematikDogru + MatematikYanlis) <= 20 && (FenDogru + FenYanlis) <= 20 && (YabanciDogru + YabanciYanlis) <= 10 && (DinDogru + DinYanlsi) <=10 && (InklapDogru + InklapYanlis) <=10 ){

            Double TurkceNet = TurkceDogru - (TurkceYanlis/3);
            Double MatematikNet = MatematikDogru - (MatematikYanlis/3);
            Double FenNet = FenDogru - (FenYanlis/3);
            Double YabniNet = YabanciDogru -(YabanciYanlis/3);
            Double DinNet = DinDogru - (DinYanlsi/3);
            Double InklapNet = InklapDogru - (InklapYanlis/3);


            Double TurkceP = (TurkceNet) * 3.67;
            Double MatematikP = (MatematikNet) * 4.95;
            Double FenP = (FenNet) * 4.07;
            Double YabanciP = (YabniNet) * 1.63;
            Double DinP = (DinNet) * 1.94;
            Double InklapP = (InklapNet) * 1.68;
            Double YerlestirmeP = TurkceP + MatematikP + FenP + YabanciP + DinP + InklapP + 195;



            String YerleştirmePuan =  String.valueOf(String.format( "%.2f",YerlestirmeP));
            String TürkçeNet = String.valueOf(String.format("%.2f",TurkceNet));
            String MatematıkNet = String.valueOf(String.format("%.2f",MatematikNet));
            String FennNet = String.valueOf(String.format("%.2f",FenNet));
            String YabanciNet = String.valueOf(String.format("%.2f",YabniNet));
            String DınNet = String.valueOf(String.format("%.2f",DinNet));
            String İnklapNet = String.valueOf(String.format("%.2f",InklapNet));

            Intent intent = new Intent(lgsPuanHesaplaActivity.this,LgsNotSonucActivity.class);
            intent.putExtra("YerleştirmePuani", YerleştirmePuan);
            intent.putExtra("TurkceNet",TürkçeNet);
            intent.putExtra("MatematikNet",MatematıkNet);
            intent.putExtra("FenNet",FennNet);
            intent.putExtra("YabanciNet",YabanciNet);
            intent.putExtra("InklapNet",İnklapNet);
            intent.putExtra("DinNet",DınNet);
            startActivity(intent);


        } else{
            Toast.makeText(lgsPuanHesaplaActivity.this,"Girilen değerler geçersizdir.",Toast.LENGTH_LONG).show();
        }






    }

}