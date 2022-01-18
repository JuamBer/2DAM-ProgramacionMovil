package com.example.preferenciasdialogosnotificaciones.Ejercicio7_3;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_3_2 extends AppCompatActivity {

    private SeekBar ejercicio7_3_2_sb;
    private Button ejercicio7_3_2_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_3_2);

        ejercicio7_3_2_sb = findViewById(R.id.ejercicio7_3_2_sb);
        ejercicio7_3_2_btn = findViewById(R.id.ejercicio7_3_2_btn);

        ejercicio7_3_2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("sdsd",String.valueOf(ejercicio7_3_2_sb.getProgress()));
                Toast myToast = Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_LONG);
                myToast.setGravity(Gravity.LEFT | Gravity.LEFT,0,0);
                myToast.show();
            }
        });
    }
}