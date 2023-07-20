package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RankinePage extends AppCompatActivity {

    TextView resultR;
    EditText get_inputr;
    Button btnrc,btnrf,btnrk;
    double resultr0,resultr1,resultr2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rankine_page);

        resultR=findViewById(R.id.result_R);
        get_inputr=findViewById(R.id.inputr);
        btnrc=findViewById(R.id.btn_RC);
        btnrf=findViewById(R.id.btn_RF);
        btnrk=findViewById(R.id.btn_RK);

        btnrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputr.getText().toString())){
                    get_inputr.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputr.getText().toString());
                    resultr0=(temp*5/9)-273.15;
                    resultR.setText(String.valueOf(resultr0));
                }
            }
        });

        btnrf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputr.getText().toString())){
                    get_inputr.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputr.getText().toString());
                    resultr1=temp-459.67;
                    resultR.setText(String.valueOf(resultr1));
                }
            }
        });

        btnrk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputr.getText().toString())){
                    get_inputr.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputr.getText().toString());
                    resultr2=(temp*5/9);
                    resultR.setText(String.valueOf(resultr2));
                }
            }
        });
    }
}