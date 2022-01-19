package com.example.preferenciasdialogosnotificaciones.Ejercicio7_6;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.example.preferenciasdialogosnotificaciones.R;

public class Ejercicio7_6 extends AppCompatActivity {

    private NotificationManager notificator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio7_6);

        notificator = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "Canal_ID" )
                .setSmallIcon (android.R.drawable.stat_sys_warning)
                .setContentTitle ("MENSAJE DE ALERTA")
                .setContentText ("Ejemplo de notificación.")
                .setTicker ("AVISO DE NOTIFICACIÓN");

        Intent intent = new Intent(this,Ejercicio7_6_intent.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(Ejercicio7_6.class);
        stackBuilder.addNextIntent(intent);

        PendingIntent result = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_IMMUTABLE );
        builder.setContentIntent(result);

        builder.setAutoCancel(true);
        notificator.notify(1, builder.build());

        builder.setFullScreenIntent(result,true);
        builder.setVisibility(NotificationCompat.VISIBILITY_PUBLIC);
    }
}