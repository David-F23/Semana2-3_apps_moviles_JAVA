package com.defv.semana2_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class sitio extends AppCompatActivity {

    private WebView webv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitio);

        webv1 = findViewById(R.id.webv11);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        webv1.loadUrl("http://" + dato);
    }

    public void finalizar(View view) {
        finish();
    }
}