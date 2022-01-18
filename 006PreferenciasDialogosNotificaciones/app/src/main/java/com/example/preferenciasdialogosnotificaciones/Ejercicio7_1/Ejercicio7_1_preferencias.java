package com.example.preferenciasdialogosnotificaciones.Ejercicio7_1;

import static com.example.preferenciasdialogosnotificaciones.R.xml.ejercicio7_1_preferencias;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_1_preferencias extends PreferenceActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(ejercicio7_1_preferencias);
    }
}
