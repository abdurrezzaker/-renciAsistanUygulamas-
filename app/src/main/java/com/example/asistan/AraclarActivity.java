package com.example.asistan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class AraclarActivity extends AppCompatActivity {

     FirebaseAuth firebaseAuth;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.opions_menu,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.cıkıs_Id){
            firebaseAuth.signOut();
            Intent intentToCikıs = new Intent(AraclarActivity.this,GirisActivity.class);
            startActivity(intentToCikıs);
            finish();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_araclar);

        firebaseAuth = FirebaseAuth.getInstance();



    }

    public void NotDefteri(View view){

        Intent intent = new Intent(AraclarActivity.this,NotDefteriActivity.class);
        startActivity(intent);


    }
    public void DersNotuHesapla(View view){

        Intent intent = new Intent(AraclarActivity.this,DersNotuHesaplaActivity.class);
        startActivity(intent);

    }
    public void lgsPuanHesapla(View view){

        Intent intent = new Intent(AraclarActivity.this,lgsPuanHesaplaActivity.class);
        startActivity(intent);

    }

    public void VizeFinalHesapla(View view){

        Intent intent = new Intent(AraclarActivity.this,VizeFinalHesaplaActivity.class);
        startActivity(intent);

    }
    public void TytPuanHesapla(View view){

        Intent intent = new Intent(AraclarActivity.this, TytPuanHesaplaActivity.class);
        startActivity(intent);

    }
    public void AytPuanHesapla(View view){

        Intent intent = new Intent(AraclarActivity.this, AlanSecimActivity.class);
        startActivity(intent);

    }



}