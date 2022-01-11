package com.example.listadosmenus.Ejercicio6_3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listadosmenus.R;

public class Ejercicio6_3 extends AppCompatActivity {

    private GridView ejercicio6_3_gv;
    private TextView ejercicio6_3_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_3);

        ejercicio6_3_gv = (GridView) findViewById(R.id.ejercicio6_3_gv);
        ejercicio6_3_tv = (TextView) findViewById(R.id.ejercicio6_3_tv);

        final String[] datos = new String[] {"España", "Suiza", "Argentia", "Japón", "Rusia", "Canada","Marruecos","Egipto","Noruega","Cuba"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos);
        ejercicio6_3_gv.setAdapter(adaptador);

        ejercicio6_3_gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id){
                String elemento = (String) parent.getItemAtPosition(posicion);
                ejercicio6_3_tv.setText(elemento);
            }
        });

    }


}