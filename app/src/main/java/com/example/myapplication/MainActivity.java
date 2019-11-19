package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText parcela1, parcela2, soma;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parcela1 = findViewById(R.id.parcela1);
        parcela2 = findViewById(R.id.parcela2);
        btn = findViewById(R.id.btn);
        soma = findViewById(R.id.soma);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double res = Double.parseDouble(parcela1.getText().toString()) +
                        Double.parseDouble(parcela2.getText().toString());
                soma.setText(res + "");


                parcela1 = findViewById(R.id.parcela1);
                parcela2 = findViewById(R.id.parcela2);
                btn = findViewById(R.id.btn);
                soma = findViewById(R.id.soma);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double res = Double.parseDouble(parcela1.getText().toString()) +
                                Double.parseDouble(parcela2.getText().toString());
                        soma.setText(res + "");

                    }

                });
            }
        });
    }
}

