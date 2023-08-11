package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    String pais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        generarPais();

    }

    public void presion(View v){
        ImageButton b=(ImageButton)v;
        if(b.getTag().toString().equals(pais)) {
            Toast.makeText(this, "Muy bien", Toast.LENGTH_SHORT).show();
            generarPais();
        }else
            Toast.makeText(this, "Es incorrecto señalaste la andera de "+b.getTag().toString(), Toast.LENGTH_SHORT).show();
    }

    public void generarPais(){
        int nro=(int)(Math.random()*4);
        switch (nro){
            case 0: pais="argentina";break;
            case 1: pais="colombia";break;
            case 2: pais="guatemala";break;
            case 3: pais="peru";break;
        }
        tv1.setText("Cual es la bandera de "+pais);
    }
}