package com.example.asistan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DersNotuHesaplaActivity extends AppCompatActivity {

    EditText sinav01Text,sinav02Text,sinav03Text;
    TextView ortalamaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ders_notu_hesapla);

        sinav01Text = findViewById(R.id.sinav01Text);
        sinav02Text = findViewById(R.id.sinav02Text);
        sinav03Text = findViewById(R.id.sinav03Text);

        ortalamaText = findViewById(R.id.ortalamaText);




    }

    public void dersNotuHesapla(View view){

        if (sinav01Text.getText().toString().matches("") || sinav02Text.getText().toString().matches("") || sinav03Text.getText().toString().matches("")){

            Toast.makeText(DersNotuHesaplaActivity.this,"Değer Giriniz.".toString(),Toast.LENGTH_LONG).show();

        }
        else{

            Double sinav01 = Double.parseDouble(sinav01Text.getText().toString());
            Double sinav02 = Double.parseDouble(sinav02Text.getText().toString());
            Double sinav03 = Double.parseDouble(sinav03Text.getText().toString());

            Double ortalama = (sinav01 + sinav02 + sinav03)/3;


            ortalamaText.setText("Ders Ortalaması: " + String.format("%.2f", ortalama ));
        }









    }

}