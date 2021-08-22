package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tema_6 extends AppCompatActivity {

    private TextView lbl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema6);

        lbl1 = findViewById(R.id.lbl);
    }
    public void llamar(View view) {
        lbl1.setText("Llamando...");
    }
}