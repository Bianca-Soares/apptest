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

 //var para receber o resultado nas classes
    double res;
    //Campos do layout- variáveis de referências
    //somar
    EditText valor1Soma, valor2Soma, totalSoma;
    Button btnSoma;
    //subtrair
    EditText valor1Sub, valor2Sub, totalSub;
    Button btnSub;
    //multiplicar
    EditText valor1Mult, valor2Mult, totalMult;
    Button btnMult;
    //dividir
    EditText valor1Div, valor2Div, totalDiv;
    Button btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//receber valores nas variáveis

       //Somar
        valor1Soma = findViewById(R.id.valor1Soma);
        valor2Soma = findViewById(R.id.valor2Soma);
        totalSoma = findViewById(R.id.totalSoma);
       //Subtrair
        valor1Sub = findViewById(R.id.valor1Sub);
        valor2Sub = findViewById(R.id.valor2Sub);
        totalSub = findViewById(R.id.totalSub);
       //Multplicar
        valor1Mult = findViewById(R.id.valor1Mult);
        valor2Mult = findViewById(R.id.valor2Mult);
        totalMult = findViewById(R.id.totalMult);
       //Dividir
        valor1Div = findViewById(R.id.valor1Div);
        valor2Div = findViewById(R.id.valor2Div);
        totalDiv = findViewById(R.id.totalDiv);

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

