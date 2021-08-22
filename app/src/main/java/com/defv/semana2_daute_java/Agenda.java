package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Agenda extends AppCompatActivity {

    private TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
    }

    public void grabar(View view) {
        String nombre = txt1.getText().toString();
        String datos = txt2.getText().toString();
        SharedPreferences preferencias = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString(nombre, datos);
        editor.commit();
        Toast.makeText(this, "Datos Guardados!!", Toast.LENGTH_SHORT).show();
        txt1.setText("");
        txt2.setText("");
    }

    public void recuperar(View view) {
        String nombre = txt1.getText().toString();
        SharedPreferences prefe = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String d = prefe.getString(nombre, "");
        if(d.length() == 0){
            Toast.makeText(this, "No existe el nombre en la agenda", Toast.LENGTH_SHORT).show();
        }else{
            txt2.setText(d);
        }
    }
}