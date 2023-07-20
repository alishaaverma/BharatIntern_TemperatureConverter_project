package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {
Button btnCelsius,btnFahren,btnKelvin,btnRankine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        btnCelsius=findViewById(R.id.btn_celsius);
        btnFahren=findViewById(R.id.btn_fahren);
        btnKelvin=findViewById(R.id.btn_kelvin);
        btnRankine=findViewById(R.id.btn_rankine);

        btnCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPage.this,CelsiusPage.class);
                startActivity(intent);
            }
        });

        btnFahren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPage.this,FehrenheitPage.class);
                startActivity(intent);
            }
        });

        btnKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPage.this,KelvinPage.class);
                startActivity(intent);
            }
        });

        btnRankine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainPage.this,RankinePage.class);
                startActivity(intent);
            }
        });
    }
}