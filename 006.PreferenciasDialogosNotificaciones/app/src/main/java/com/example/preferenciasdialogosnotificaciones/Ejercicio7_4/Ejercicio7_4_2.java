package com.example.preferenciasdialogosnotificaciones.Ejercicio7_4;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_4_2 extends AppCompatActivity {

    private Button btn;
    private String msg = "";

    private void iniciarDialogo(){
        String[] elementos = {"LUNES","MARTES", "MIERCOLES", "JUEVES", "SÁBADO","DOMINGO"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
            .setItems (elementos, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    msg = elementos[id];

                    Toast myToast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
                    myToast.setGravity(Gravity.CENTER| Gravity.LEFT,0,0);
                    myToast.show();
                }
            })
            .setTitle("TÍTULO DEL DIÁLOGO")
            .setIcon(R.mipmap.ic_launcher);

        AlertDialog dialogo = builder.create();
        dialogo.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_4_2);

        btn = findViewById(R.id.ejercicio7_4_2_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarDialogo();
            }
        });
    }
}