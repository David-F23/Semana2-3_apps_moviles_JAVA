package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Tema_2 extends AppCompatActivity {

    private EditText txt1, txt2;
    private TextView result;
    private RadioButton radio1, radio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema2);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        result = findViewById(R.id.lblres);

        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
    }

    public void operar(View view) {
        String valor1 = txt1.getText().toString();
        String valor2 = txt2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if (radio1.isChecked() == true){
            int suma = num1 + num2;
            String resultado = String.valueOf(suma);
            result.setText("Resultado: " + resultado);
            Toast.makeText(this, "El resultado es: " + resultado, Toast.LENGTH_SHORT).show();
        }else{
            if (radio2.isChecked() == true){
                int resta = num1 - num2;
                String resultado = String.valueOf(resta);
                result.setText("Resultado: " + resultado);
                Toast.makeText(this, "El resultado es: " + resultado, Toast.LENGTH_SHORT).show();
            }
        }
    }
}