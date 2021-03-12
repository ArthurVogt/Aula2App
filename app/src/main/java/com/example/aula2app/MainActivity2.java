package com.example.aula2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvTemperatura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d("status", MainActivity2.this.getLocalClassName() + ".onCreate");

        tvTemperatura = findViewById(R.id.tvTemperatura);

        Intent it = getIntent();
        String temperatura = String.valueOf(it.getFloatExtra("temperatura", 0));
        tvTemperatura.setText(temperatura);

        Log.d("status", temperatura);
    }
}