package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tema_10 extends AppCompatActivity {

    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema10);

        txt = findViewById(R.id.txt1);
    }

    public void ver(View view) {
        Intent intent = new Intent(Tema_10.this, sitio.class);
        intent.putExtra("direccion", txt.getText().toString());
        startActivity(intent);
    }
}