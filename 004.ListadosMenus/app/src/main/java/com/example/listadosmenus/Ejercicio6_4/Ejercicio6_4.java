package com.example.listadosmenus.Ejercicio6_4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listadosmenus.R;

public class Ejercicio6_4 extends AppCompatActivity {

    private Spinner ejercicio6_4_sp;
    private TextView ejercicio6_4_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_4);

        ejercicio6_4_sp = (Spinner) findViewById(R.id.ejercicio6_4_sp);
        ejercicio6_4_tv = (TextView) findViewById(R.id.ejercicio6_4_tv);

        final String[] datos = new String[] {"España", "Suiza", "Argentia", "Japón", "Rusia", "Canada","Marruecos","Egipto","Noruega","Cuba"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos);
        ejercicio6_4_sp.setAdapter(adaptador);

        ejercicio6_4_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String elemento = (String) parentView.getItemAtPosition(position);
                ejercicio6_4_tv.setText(elemento);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }

        });

    }


}