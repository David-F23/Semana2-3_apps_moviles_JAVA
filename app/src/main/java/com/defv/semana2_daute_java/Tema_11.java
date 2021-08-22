package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tema_11 extends AppCompatActivity {

    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema11);

        txt = findViewById(R.id.txt1);
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        txt.setText(prefe.getString("mail",""));
    }

    public void ejecutar(View view) {
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString("mail", txt.getText().toString());
        editor.commit();
        finish();
    }
}