package com.example.preferenciasdialogosnotificaciones.Ejercicio7_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_4_1 extends AppCompatActivity {

    private Button btn;

    private void iniciarDialogo(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
            .setTitle("TÍTULO DEL DIÁLOGO")
            .setMessage ("EJEMPLO DE DIÁLOGO")
            .setIcon (R.mipmap.ic_launcher);

        AlertDialog dialogo = builder.create();
        dialogo.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_4_1);

        btn = findViewById(R.id.ejercicio7_4_1_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarDialogo();
            }
        });
    }
}