package com.example.tasca4joanplanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Intent in = getIntent();
        String missatge = in.getStringExtra("missatge");
        TextView informacio = findViewById(R.id.textInfo);
        informacio.setText(missatge);*/

        Intent in = getIntent();
        String info = in.getStringExtra("info");
        TextView informacio = findViewById(R.id.textInfo);

        informacio.setText(info);
    }

    public void pag2(View v){
        Intent in = new Intent(this, MainActivity2.class);
        startActivity(in);
    }
}