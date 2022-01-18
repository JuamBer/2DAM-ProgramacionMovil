package com.example.preferenciasdialogosnotificaciones.Ejercicio7_1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_1 extends AppCompatActivity {

    private Button ejercicio7_1_btn1;
    private Button ejercicio7_1_btn2;

    protected void cargarActivity() {
        Intent intent = new Intent(this, Ejercicio7_1_preferencias.class);
        startActivity(intent);
    }
    protected void cargarDatos(){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        Log.i("TEMA_07", "Opción 1: " + pref.getBoolean("clave1", false));
        Log.i("TEMA_07", "Opción 2: " + pref.getString("clave2", "No asignada"));
        Log.i("TEMA_07", "Opción 3: " + pref.getString("clave3", "No asignada"));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_1);

        ejercicio7_1_btn1 = findViewById(R.id.ejercicio7_1_btn1);
        ejercicio7_1_btn2 = findViewById(R.id.ejercicio7_1_btn2);

        ejercicio7_1_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarActivity();
            }
        });

        ejercicio7_1_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cargarDatos();
            }
        });

    }

}