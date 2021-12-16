package com.example.controles.Ejercicio5_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.controles.R;

public class Ejercicio5_4_2 extends AppCompatActivity {

    private TextView ejercicio5_4_2_tv;
    private Button ejercicio5_4_2_btn1;
    private Button ejercicio5_4_2_btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio5_4_2);

        this.ejercicio5_4_2_tv = findViewById(R.id.ejercicio5_4_2_tv);
        this.ejercicio5_4_2_btn1 = findViewById(R.id.ejercicio5_4_2_btn1);
        this.ejercicio5_4_2_btn2 = findViewById(R.id.ejercicio5_4_2_btn2);

        ejercicio5_4_2_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejercicio5_4_2_tv.setText("BOTÓN 1 PULSADO");
            }
        });

        ejercicio5_4_2_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejercicio5_4_2_tv.setText("BOTÓN 2 PULSADO");
            }
        });
    }
}