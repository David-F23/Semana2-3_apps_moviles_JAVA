package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tema_3 extends AppCompatActivity {

    private EditText txt1, txt2;
    private TextView result;
    private CheckBox cBox1, cBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema3);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        result = findViewById(R.id.lblres);

        cBox1 = findViewById(R.id.cBox1);
        cBox2 = findViewById(R.id.cBox2);
    }

    public void operar(View view) {
        String valor1 = txt1.getText().toString();
        String valor2 = txt2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        String resultado = "";

        if(cBox1.isChecked() == true){
            int suma = num1 + num2;
            resultado = "La suma es: " + suma;
            Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show();
        }
        if(cBox2.isChecked() == true){
            int resta = num1 - num2;
            resultado = "La resta es: " + resta;
            Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show();
        }

        result.setText(resultado);
    }
}