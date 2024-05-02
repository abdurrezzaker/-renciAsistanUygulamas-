package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VizeFinalHesaplaActivity extends AppCompatActivity {

    EditText vizeText,finalText,vizeYuzdelikText,finalYuzdelikText;

    TextView Sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vize_final_hesapla);

        vizeText = findViewById(R.id.VizeText);
        finalText = findViewById(R.id.FinalText);
        vizeYuzdelikText = findViewById(R.id.VizeYuzdelikText);
        finalYuzdelikText = findViewById(R.id.FinalYuzdelikText);
        Sonuc = findViewById(R.id.sonucText);

    }

    public void VizeFinalHesapla(View view){




        Double VizeYuzdelik = Double.parseDouble(vizeYuzdelikText.getText().toString());
        Double FinalYuzdelik = Double.parseDouble(finalYuzdelikText.getText().toString());
        Double Vize = Double.parseDouble(vizeText.getText().toString());
        Double Final = Double.parseDouble(finalText.getText().toString());







       if (VizeYuzdelik + FinalYuzdelik == 100){

            Double vizeSonuc = Vize*(VizeYuzdelik/100);
            Double finalSonuc = Final*(FinalYuzdelik/100);
            Double sonuc = vizeSonuc + finalSonuc;
            String FinalSonuc = String.valueOf(String.format("%.2f",sonuc));
            Sonuc.setText("Ortalama Puan: " + FinalSonuc);




        }else{
           Toast.makeText(VizeFinalHesaplaActivity.this,"Eksik veya geçersiz değer girdiniz.",Toast.LENGTH_LONG).show();

        }


    }
}