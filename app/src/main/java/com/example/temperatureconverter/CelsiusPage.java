package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CelsiusPage extends AppCompatActivity {

    TextView result;
    EditText get_input;
    Button btncf,btnck,btncr;
    double result0,result1,result2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_page);

        result=findViewById(R.id.result_C);
        get_input=findViewById(R.id.inputc);
        btncf=findViewById(R.id.btn_CF);
        btnck=findViewById(R.id.btn_CK);
        btncr=findViewById(R.id.btn_CR);

        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_input.getText().toString())){
                    get_input.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_input.getText().toString());
                    result0=((temp*9/5)+32);
                    result.setText(String.valueOf(result0));
                }
            }
        });

        btnck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_input.getText().toString())){
                    get_input.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_input.getText().toString());
                    result1=(temp+273.15);
                    result.setText(String.valueOf(result1));
                }
            }
        });

        btncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_input.getText().toString())){
                    get_input.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_input.getText().toString());
                    result2=((temp*9/5)+491.67);
                    result.setText(String.valueOf(result2));
                }
            }
        });
    }
}