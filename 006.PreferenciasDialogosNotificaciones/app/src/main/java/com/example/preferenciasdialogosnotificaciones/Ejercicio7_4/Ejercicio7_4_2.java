package com.example.preferenciasdialogosnotificaciones.Ejercicio7_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_4_2 extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_4_2);

        btn = findViewById(R.id.ejercicio7_4_2_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}