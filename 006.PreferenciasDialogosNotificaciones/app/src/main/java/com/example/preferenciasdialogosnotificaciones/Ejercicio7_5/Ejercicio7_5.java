package com.example.preferenciasdialogosnotificaciones.Ejercicio7_5;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.preferenciasdialogosnotificaciones.R;

import java.util.Calendar;

public class Ejercicio7_5 extends AppCompatActivity {

    private Button btn;
    private TextView tv;

    private void iniciarDialogo(){
        final Calendar calen = Calendar.getInstance();
        int hour = calen.get(Calendar.HOUR_OF_DAY);
        int minute = calen.get(Calendar.MINUTE);

        TimePickerDialog hora = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tv.setText(String.valueOf(hourOfDay)+":"+String.valueOf(minute));
            }
        }, hour, minute, false);
        hora.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_5);

        btn = findViewById(R.id.ejercicio7_5_btn);
        tv = findViewById(R.id.ejercicio7_5_tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarDialogo();
            }
        });
    }
}