package com.example.asistan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.UUID;

public class GirisActivity extends AppCompatActivity {


    EditText emailText,passwordText;
    private FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailText = findViewById(R.id.emailTextId);
        passwordText = findViewById(R.id.passwordTextId);

        firebaseAuth =FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

        if (firebaseUser != null){

            Intent intent = new Intent(GirisActivity.this,AraclarActivity.class);
            startActivity(intent);
            finish();

        }
    }


     public void giris(View view){


         String email = emailText.getText().toString();
         String password = passwordText.getText().toString();

        firebaseAuth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {


                Intent intent = new Intent(GirisActivity.this,AraclarActivity.class);
                startActivity(intent);
                finish();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                Toast.makeText(GirisActivity.this,"Böyle bir email yoktur.",Toast.LENGTH_LONG).show();

            }
        });

    }

    public void kayit(View view){

        String email = emailText.getText().toString();
        String password = passwordText.getText().toString();



        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {

                Toast.makeText(GirisActivity.this,"Kayıt Başarıyla Gerçekleşti.",Toast.LENGTH_LONG).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

                Toast.makeText(GirisActivity.this,"Email veya Passwordda yazım yanlışı var.",Toast.LENGTH_LONG).show();

            }
        });


    }
}