package com.defv.semana2_daute_java;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.provider.MediaStore;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.defv.semana2_daute_java.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.tema1) {
            Toast.makeText(this, "Tema #1", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_1.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.tema2) {
            Toast.makeText(this, "Tema #2", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_2.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.tema3) {
            Toast.makeText(this, "Tema #3", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_3.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.tema4) {
            Toast.makeText(this, "Tema #4", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_4.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.tema5) {
            Toast.makeText(this, "Tema #5", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_5.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.tema6) {
            Toast.makeText(this, "Tema #6", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_6.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.tema7) {
            Toast.makeText(this, "Tema #7", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_7.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.tema8) {
            Toast.makeText(this, "Tema #8", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_8.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.tema9) {
            Toast.makeText(this, "Tema #9", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_9.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.tema10) {
            Toast.makeText(this, "Tema #10", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_10.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.tema11) {
            Toast.makeText(this, "Tema #11", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Tema_11.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.agenda) {
            Toast.makeText(this, "Agenda", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Agenda.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

