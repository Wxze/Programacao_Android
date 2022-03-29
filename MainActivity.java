//Author: Gabriel Jose da Silva dos Santos

package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String result = "";
    private float converted;

    private TextView textView_result;
    private Button button;
    private Button button_reset;
    private Button button_convert;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = "";
        textView_result = findViewById(R.id.textView_result);
        button = findViewById(R.id.button);
        button_reset = findViewById(R.id.button_reset);
        button_convert = findViewById(R.id.button_convert);
        button_0 = findViewById(R.id.button_0);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(result.isEmpty()){
                    Toast.makeText(MainActivity.this, "Insira um número primeiro!", Toast.LENGTH_LONG).show();
                }else{
                    if(result.contains(".")){
                        Toast.makeText(MainActivity.this, "Apenas uma vírgula por numero!", Toast.LENGTH_LONG).show();
                    }else{
                        result += ".";
                        textView_result.setText(result);
                    }
                }
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = "";
                textView_result.setText(result);
            }
        });

        button_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converted = Float.parseFloat(result);
                converted = (float) (converted / 4.77);
                //result = "$ " + String.valueOf(converted);
                result = "$ " + String.format("%.2f", converted);
                textView_result.setText(result);
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "0";
                textView_result.setText(result);
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "1";
                textView_result.setText(result);
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "2";
                textView_result.setText(result);
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "3";
                textView_result.setText(result);
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "4";
                textView_result.setText(result);
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "5";
                textView_result.setText(result);
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "6";
                textView_result.setText(result);
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "7";
                textView_result.setText(result);
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "8";
                textView_result.setText(result);
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "9";
                textView_result.setText(result);
            }
        });
    }
}