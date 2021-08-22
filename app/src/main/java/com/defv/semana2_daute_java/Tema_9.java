package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tema_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema9);
    }

    public void acercade(View view) {
        Intent intent = new Intent(Tema_9.this, AcercaDe.class);
        startActivity(intent);
    }
}