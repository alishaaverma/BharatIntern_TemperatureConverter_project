package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FehrenheitPage extends AppCompatActivity {

    TextView resultF;
    EditText get_inputf;
    Button btnfc,btnfk,btnfr;
    double resultf0,resultf1,resultf2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fehrenheit_page);

        resultF=findViewById(R.id.result_F);
        get_inputf=findViewById(R.id.inputf);
        btnfc=findViewById(R.id.btn_FC);
        btnfk=findViewById(R.id.btn_FK);
        btnfr=findViewById(R.id.btn_FR);

        btnfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputf.getText().toString())){
                    get_inputf.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputf.getText().toString());
                    resultf0=((temp-32)*5/9);
                    resultF.setText(String.valueOf(resultf0));
                }
            }
        });

        btnfk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputf.getText().toString())){
                    get_inputf.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputf.getText().toString());
                    resultf1=(temp+459.67)*5/9;
                    resultF.setText(String.valueOf(resultf1));
                }
            }
        });

        btnfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(get_inputf.getText().toString())){
                    get_inputf.setError("temperature is compulsory");
                }
                else {
                    double temp=Double.parseDouble(get_inputf.getText().toString());
                    resultf2=(temp+459.67);
                    resultF.setText(String.valueOf(resultf2));
                }
            }
        });
    }
}