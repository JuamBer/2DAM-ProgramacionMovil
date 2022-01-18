package com.example.listadosmenus.Ejercicio6_6;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listadosmenus.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio6_6 extends AppCompatActivity {

    private TextView tv;
    private SubMenu meses;
    private static final int id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio6_6);

        tv = findViewById(R.id.ejercicio6_6_tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
       getMenuInflater().inflate(R.menu.menu_ejercicio6_6, menu);
       meses = menu.addSubMenu(Menu.NONE,1,Menu.NONE,"Meses del año");
       ArrayList<String> mesesTexto = new ArrayList<String>(Arrays.asList("Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"));

        int i = 2;
        for (String mes:mesesTexto) {
            meses.add(Menu.NONE,i,Menu.NONE,mes);
            i++;
        }

       return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        tv.setText(item.getTitle());


        return true;
    }

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
}