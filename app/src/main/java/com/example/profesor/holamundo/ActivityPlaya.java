package com.example.profesor.holamundo;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ActivityPlaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playa);

        // Recogemos el itent de la actividad
        Intent intent = getIntent();
        int contador = intent.getIntExtra(MainActivity.KEY_CONTADOR,0);
        Toast.makeText(getApplicationContext(),"El contador es: " + contador , Toast.LENGTH_SHORT).show();

        // Preparo información que tendrá que recoger la actividad llamante cuando esta termine
        String mensaje="¡He estado en la playa!";
        Intent intent2=new Intent();
        intent2.putExtra("MENSAJE",mensaje);
        setResult(RESULT_OK,intent2);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MainActivity.TAG,"Playa-->onPause()" );


        //finish();//finishing activity
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MainActivity.TAG,"Playa-->onDestroy()" );

    }
}
