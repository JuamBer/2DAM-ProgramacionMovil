package com.example.controles.Ejercicio5_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.controles.R;

public class Ejercicio5_4_1 extends AppCompatActivity {

    private TextView ejercicio5_4_1_tv;
    private Button ejercicio5_4_1_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio5_4_1);

        this.ejercicio5_4_1_tv = findViewById(R.id.ejercicio5_4_1_tv);
        this.ejercicio5_4_1_btn = findViewById(R.id.ejercicio5_4_1_btn);

        ejercicio5_4_1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ejercicio5_4_1_tv.setText("BOTÓN PULSADO");
            }
        });
    }
}