package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
    static final String CUENTA = "cuenta";
    private int valorCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            Log.i("PRACTICA 00", "savedInstanceState existe "+savedInstanceState.getString(CUENTA));

            // Restore value of members from saved state
            valorCuenta = Integer.parseInt(savedInstanceState.getString(CUENTA));
        } else {
            // Probably initialize members with default values for a new instance
            valorCuenta = 0;
        }
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

                if(this.isVmax){
                    if(!((valorCuenta+1)>valorMax)){
                        valorCuenta++;
                        cuenta.setText(String.valueOf(valorCuenta));
                    }
                }else{
                    valorCuenta++;
                    cuenta.setText(String.valueOf(valorCuenta));
                }

                break;
            case R.id.btnMenos:
                if(this.isVmin){
                    if(!((valorCuenta-1)<valorMin)){
                        valorCuenta--;
                        cuenta.setText(String.valueOf(valorCuenta));
                    }
                }else{
                    valorCuenta--;
                    cuenta.setText(String.valueOf(valorCuenta));
                }
                break;
            case R.id.btnReset:
                this.valorCuenta=0;
                cuenta.setText(String.valueOf(valorCuenta));
                break;
            case R.id.cvValMin:
                if(this.valorCuenta < 0){
                    this.valorCuenta = 0;
                    cuenta.setText(String.valueOf(valorCuenta));
                }
                this.isVmin = !this.isVmin;
                break;
            case R.id.cvValMax:
                if(this.valorCuenta > 50){
                    this.valorCuenta = 50;
                    cuenta.setText(String.valueOf(valorCuenta));
                }
                this.isVmax = !this.isVmax;
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString(CUENTA, String.valueOf(valorCuenta));
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

}