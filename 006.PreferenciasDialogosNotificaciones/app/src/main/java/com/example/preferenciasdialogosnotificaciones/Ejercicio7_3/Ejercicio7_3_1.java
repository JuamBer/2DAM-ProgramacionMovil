package com.example.preferenciasdialogosnotificaciones.Ejercicio7_3;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_3_1 extends AppCompatActivity {

    private TextView ejercicio7_3_1_tv;
    private Button ejercicio7_3_1_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_3_1);

        ejercicio7_3_1_tv = findViewById(R.id.ejercicio7_3_1_tv);
        ejercicio7_3_1_btn = findViewById(R.id.ejercicio7_3_1_btn);

        ejercicio7_3_1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejercicio7_3_1_tv.setText("Prueba Toast");
                Toast myToast = Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_LONG);
                myToast.setGravity(Gravity.CENTER| Gravity.LEFT,0,0);
                myToast.show();
            }
        });
    }
}