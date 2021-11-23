package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Contador extends AppCompatActivity implements View.OnClickListener{

    private TextView cuenta;
    private Button mas,menos, reset;
    private CheckBox min, max;

    private boolean isVmin = false;
    private boolean isVmax = false;
    private final static int valorMin = 0;
    private final static int valorMax = 50;
    private int valorCuenta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contador_lay);

        cuenta = findViewById(R.id.tvCuenta);
        mas = findViewById(R.id.btnMas);
        mas.setOnClickListener(this);
        menos = findViewById(R.id.btnMenos);
        menos.setOnClickListener(this);
        reset = findViewById(R.id.btnReset);
        reset.setOnClickListener(this);
        min = findViewById(R.id.cvValMin);
        min.setOnClickListener(this);
        max = findViewById(R.id.cvValMax);
        max.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnMas:

                if((valorCuenta+1)>valorMax){

                }else{
                    valorCuenta++;
                    cuenta.setText(String.valueOf(valorCuenta));
                }
                break;
            case R.id.btnMenos:
                if((this.valorCuenta-1)<this.valorMin){

                }else{
                    this.valorCuenta--;
                    cuenta.setText(String.valueOf(valorCuenta));
                }
                break;
            case R.id.btnReset:
                this.valorCuenta=0;
                cuenta.setText(String.valueOf(valorCuenta));
                break;
            case R.id.cvValMin:
                this.isVmin = !this.isVmin;
                break;
            case R.id.cvValMax:
                this.isVmax = !this.isVmax;
                break;
        }
    }
}