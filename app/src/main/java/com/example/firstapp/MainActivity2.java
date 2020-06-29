package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity2 extends AppCompatActivity {

    TextView edDP;
    TextView edSR;
    TextView tvPagamento;
    TextView tvReceber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvPagamento = findViewById(R.id.tvPagamento);
        TextView tvReceber = findViewById(R.id.tvReceber);

        TextView edPagamento = findViewById(R.id.edDP);
        TextView edReceber = findViewById(R.id.edSR);

        Bundle parametros = getIntent().getExtras();

        if (parametros != null) {

            String Cpf = parametros.getString("Cpf");
            String Nasc = parametros.getString("Nasc");
            String Renda = parametros.getString("Renda");

            tvPagamento.setText("Data" + String.valueOf(tvPagamento));
            tvReceber.setText("R$" + String.valueOf(tvReceber));

        }

    }
}