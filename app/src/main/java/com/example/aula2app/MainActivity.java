package com.example.aula2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etTemperatura;
    Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("status", MainActivity.this.getLocalClassName() + ".onCreate");

        etTemperatura = findViewById(R.id.etTemperatura);
        bCalcular = findViewById(R.id.bCalcular);

        bCalcular.setOnClickListener(v -> {
            Log.d("status", MainActivity.this.getLocalClassName() + ".onClick");
            String text = String.valueOf(etTemperatura.getText());
            float temperatura = 0;
            if (!text.isEmpty()) {
                temperatura = Float.valueOf(text);
            }
            Log.d("status", String.valueOf(temperatura));
            Intent it = new Intent(MainActivity.this, MainActivity2.class);
            it.putExtra("temperatura", F(temperatura));
            startActivity(it);
        });
    }

    public static float F(float c) {
        return ((c * 9) / 5) + 32;
    }
}