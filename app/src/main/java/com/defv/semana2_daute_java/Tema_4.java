package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Tema_4 extends AppCompatActivity {

    private Spinner spiner;
    private EditText txt1, txt2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema4);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        res = findViewById(R.id.lblres);

        spiner = findViewById(R.id.spinner);
        String [] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spiner.setAdapter(adapter);
    }

    public void operar(View view) {
        String valor1 = txt1.getText().toString();
        String valor2 = txt2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        String select = spiner.getSelectedItem().toString();

        if(select.equals("sumar")){
            int suma = num1 + num2;
            String result = String.valueOf(suma);
            res.setText(result);

        }else if(select.equals("restar")){
            int resta = num1 - num2;
            String result = String.valueOf(resta);
            res.setText(result);
        }else if(select.equals("multiplicar")){
            int multi = num1 * num2;
            String result = String.valueOf(multi);
            res.setText(result);
        }else if(select.equals("dividir")){
            int divi = num1 / num2;
            String result = String.valueOf(divi);
            res.setText(result);
        }
    }
}