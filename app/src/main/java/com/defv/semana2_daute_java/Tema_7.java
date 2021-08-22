package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Tema_7 extends AppCompatActivity {

    private EditText txt;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema7);

        txt = findViewById(R.id.txt);
        num = (int)(Math.random() * 100001);

        String cadena = String.valueOf(num);

        Toast.makeText(this, cadena, Toast.LENGTH_SHORT).show();
    }

    public void controlar(View view) {
        String valor = txt.getText().toString();
        int numero = Integer.parseInt(valor);
        if (numero == num){
            Toast.makeText(this, "Muy bien acertaste!!!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Incorrecto.", Toast.LENGTH_SHORT).show();
        }
    }
}