package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.*;
import android.os.Bundle;
import android.view.*;


public class Activity2 extends AppCompatActivity{

        private Button exit;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);

            Log.i("PRACTICA 00", "Estoy onCreate (Pantalla2)");


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
            Log.i("PRACTICA 00", "Estoy onStart (Pantalla2)");
        }

        @Override
        protected void onPause(){
            super.onPause();
            Log.i("PRACTICA 00", "Estoy onPause (Pantalla2)");
        }

        @Override
        protected void onRestart(){
            super.onRestart();
            Log.i("PRACTICA 00", "Estoy onRestart (Pantalla2)");
        }

        @Override
        protected void onDestroy(){
            super.onDestroy();
            Log.i("PRACTICA 00", "Estoy onDestroy (Pantalla2)");

            Intent pantalla3 = new Intent(this, Contacts.class);
            startActivity(pantalla3);
            //Intent google = new Intent(Intent.ACTION_VIEW);
            //google.setData(Uri.parse("http://www.google.es"));
            //startActivity(google);
        }

}
