package com.example.preferenciasdialogosnotificaciones.Ejercicio7_2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_2);

        Toast myToast = Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.CENTER| Gravity.LEFT,0,0);
        myToast.show();

    }
}