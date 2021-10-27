package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    private TextView msg;
    private EditText usu;
    private Button next, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.tv1);
        usu = findViewById(R.id.input);
        next = findViewById(R.id.btnaction);
        exit = findViewById(R.id.btnexit);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saludo = "Bienvenid@ a nuestra APP \n";
                msg.setText (saludo+usu.getText().toString());
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
            

}