package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelvinPage extends AppCompatActivity {

    TextView resultK;
    EditText get_inputk;
    Button btnkc,btnkf,btnkr;
    double resultk0,resultk1,resultk2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_page);

        resultK=findViewById(R.id.result_K);
        get_inputk=findViewById(R.id.inputk);
        btnkc=findViewById(R.id.btn_KC);
        btnkf=findViewById(R.id.btn_KF);
        btnkr=findViewById(R.id.btn_KR);

        btnkc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputk.getText().toString())){
                    get_inputk.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputk.getText().toString());
                    resultk0=(temp-273.15);
                    resultK.setText(String.valueOf(resultk0));
                }
            }
        });

        btnkf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputk.getText().toString())){
                    get_inputk.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputk.getText().toString());
                    resultk1=(temp*9/5)-459.67;
                    resultK.setText(String.valueOf(resultk1));
                }
            }
        });

        btnkr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputk.getText().toString())){
                    get_inputk.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputk.getText().toString());
                    resultk2=(temp*9/5);
                    resultK.setText(String.valueOf(resultk2));
                }
            }
        });
    }
}