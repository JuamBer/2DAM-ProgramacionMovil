package com.example.practica;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.*;
import android.os.Bundle;
import android.view.*;

import android.provider.ContactsContract;

import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;


public class Contacts extends AppCompatActivity {

    private Button exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);

        Log.i("PRACTICA 00", "Estoy onCreate (Pantalla3)");


        exit = findViewById(R.id.btnexit);


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("PRACTICA 00", "Estoy onStart (Pantalla3)");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("PRACTICA 00", "Estoy onPause (Pantalla3)");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("PRACTICA 00", "Estoy onRestart (Pantalla3)");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("PRACTICA 00", "Estoy onDestroy (Pantalla3)");
    }

}
