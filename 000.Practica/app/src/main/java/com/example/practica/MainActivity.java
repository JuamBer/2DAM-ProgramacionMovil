package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.widget.*;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    private TextView msg;
    private EditText usu;
    private Button next, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("PRACTICA 00", "Estoy onCreate (Pantalla1)");

        msg = findViewById(R.id.tv1);
        usu = findViewById(R.id.input);
        next = findViewById(R.id.btnaction);
        exit = findViewById(R.id.btnexit);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saludo = "Bienvenid@ a nuestra APP \n";
                msg.setText (saludo+usu.getText().toString());
            }
        });
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
        Log.i("PRACTICA 00", "Estoy onStart (Pantalla1)");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("PRACTICA 00", "Estoy onPause (Pantalla1)");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("PRACTICA 00", "Estoy onRestart (Pantalla1)");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("PRACTICA 00", "Estoy onDestroy (Pantalla1)");
        Intent pantalla2 = new Intent(this, Activity2.class);
        startActivity(pantalla2);
    }



}