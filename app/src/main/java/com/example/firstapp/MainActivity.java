package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.santalu.maskedittext.MaskEditText;

import java.math.BigDecimal;
import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    private MaskEditText editCpf;
    private MaskEditText editNasc;
    private MaskEditText editRenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCpf = findViewById(R.id.editCpf);
        editNasc = findViewById(R.id.editNasc);
        editRenda = findViewById(R.id.editRenda);

        String editC = editCpf.getText().toString();
        String editN = editNasc.getText().toString();
        String editR = editRenda.getText().toString();

    }

    public void CalcularAuxilio(View v) {

        if (!validarCamposNulos()){
            Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                return;
        }

        String editC = editCpf.getText().toString();
        String editN = editNasc.getText().toString();
        String editR = editRenda.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
//        Bundle parametros = new Bundle();
//
//        parametros.putString("editCpf", editC);
//        parametros.putString("editNasc", editN);
//        parametros.putDouble("editRenda", editR);
//
//        intent.putExtras(parametros);
        startActivity(intent);

    }

    private boolean validarCamposNulos() {

        if (TextUtils.isEmpty(editCpf.getText().toString()) ||
                TextUtils.isEmpty(editRenda.getText().toString()))
        {
            return false;
        }
        return true;
    }

    public void LimparCampos(View v) {

        editCpf.setText("");
        editNasc.setText("");
        editRenda.setText("");

    }
}