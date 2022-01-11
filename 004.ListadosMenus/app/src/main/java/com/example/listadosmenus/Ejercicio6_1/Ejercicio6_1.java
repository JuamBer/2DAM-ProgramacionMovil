package com.example.listadosmenus.Ejercicio6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listadosmenus.R;

public class Ejercicio6_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_1);

        ListView listado = (ListView) findViewById(R.id.ejercicio6_1_lv);
        final String[] datos = new String[] {"Elemento 1", "Elemento 2", "Elemento3", "Elemento 4", "Elemento 5"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos);
        listado.setAdapter(adaptador);
    }


}