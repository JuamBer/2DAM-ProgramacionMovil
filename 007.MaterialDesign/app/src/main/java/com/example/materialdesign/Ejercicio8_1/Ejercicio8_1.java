package com.example.materialdesign.Ejercicio8_1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.materialdesign.R;

public class Ejercicio8_1 extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
       menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio8_1);
        //this.toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.barra_nuevo: mensaje(R.string.ejercicio8_1_barra_nuevo);
                return true;
            case R.id.barra_editar: mensaje(R.string.ejercicio8_1_barra_editar);
                return true;
            case R.id.barra_acerca: mensaje(R.string.ejercicio8_1_barra_info);
                return true;
            case R.id.barra_configurar: mensaje(R.string.ejercicio8_1_barra_configurar);
                return true;
            case R.id.barra_ayuda: mensaje(R.string.ejercicio8_1_barra_ayuda);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }

    private void mensaje(int resid){
        Toast.makeText(this, resid,Toast.LENGTH_SHORT).show();
    }


}
