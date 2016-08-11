package com.example.kellysonsataides.intentrecebendoparametro;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

    }

    public void finish() {
        Intent dados = new Intent();
        dados.putExtra("retorno", "Estamos retornando da segunda");
        setResult(RESULT_OK, dados);
        super.finish();
    }




}
