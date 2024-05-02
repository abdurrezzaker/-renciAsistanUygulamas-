package com.example.asistan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.Map;

public class  NotDefteriActivity extends AppCompatActivity {

    ListView listView;
    private FirebaseFirestore firebaseFirestore;
    private FirebaseAuth firebaseAuth;
    private FirebaseStorage  firebaseStorage;
    ArrayList<String> titleList;
    ArrayAdapter<String> arrayAdapter;
    RecyclerRowAdapder recyclerRowAdapder;
    
   



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.not_detay_options_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.note_ekle){

            Intent intent = new Intent(NotDefteriActivity.this,NotEkleActivity.class);
            startActivity(intent);




        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_defteri);

        titleList = new ArrayList<>();
        firebaseStorage = FirebaseStorage.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();
        getDataFirestore();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerRowAdapder = new RecyclerRowAdapder(titleList);
        recyclerView.setAdapter(recyclerRowAdapder);

/*
        String notID = firebaseAuth.getCurrentUser().getUid().toString();




        CollectionReference collectionReference = firebaseFirestore.collection(notID);
        collectionReference.orderBy("date", Query.Direction.DESCENDING).addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                if (value != null){
                    for (DocumentSnapshot snapshot : value.getDocuments()){

                        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                        Map<String,Object> data = snapshot.getData();


                        String title = (String) data.get("title");

                        ArrayList<String> titleAL = new ArrayList<>();
                        titleAL.add(title.toString());

                        arrayAdapter = new ArrayAdapter<String>(NotDefteriActivity.this, android.R.layout.simple_list_item_1,titleAL);
                        listView.setAdapter(arrayAdapter);
                        arrayAdapter.notifyDataSetChanged();


                    }
                }
            }
        });*/



    }


    public  void getDataFirestore(){
        String notID = firebaseAuth.getCurrentUser().getUid().toString();

        CollectionReference collectionReference = firebaseFirestore.collection(notID);
        collectionReference.orderBy("date", Query.Direction.DESCENDING).addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {

                if (value != null ){
                    for (DocumentSnapshot snapshot : value.getDocuments()){
                        Map<String,Object> data = snapshot.getData();

                        String title = (String) data.get("title");


                        titleList.add(title);
                        recyclerRowAdapder.notifyDataSetChanged();


                    }
                }

            }
        });


    }









}