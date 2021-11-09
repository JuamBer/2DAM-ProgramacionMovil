package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;
import android.content.*;
import android.util.*;
import android.widget.*;
import android.os.*;
import android.view.View;
import java.util.ArrayList;

public class Activity2 extends AppCompatActivity{

        private Button exit;
        private ArrayList<ContactsInfo> contactsInfoList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);

            Log.i("PRACTICA 00", "Estoy onCreate (Pantalla2)");


            exit = findViewById(R.id.btnexit);

            exit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }

        @Override
        protected void onStart(){
            super.onStart();
            Log.i("PRACTICA 00", "Estoy onStart (Pantalla2)");
        }

        @Override
        protected void onPause(){
            super.onPause();
            Log.i("PRACTICA 00", "Estoy onPause (Pantalla2)");
        }

        @Override
        protected void onRestart(){
            super.onRestart();
            Log.i("PRACTICA 00", "Estoy onRestart (Pantalla2)");
        }

        @Override
        protected void onDestroy(){
            super.onDestroy();
            Log.i("PRACTICA 00", "Estoy onDestroy (Pantalla2)");

            showContactsApp();

            //startActivity(google);
        }

        public void showContactsApp(){

            Intent intent  = new Intent();
            intent.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.addCategory("android.intent.category.DEFAULT");
            startActivity(intent);

        }
}
