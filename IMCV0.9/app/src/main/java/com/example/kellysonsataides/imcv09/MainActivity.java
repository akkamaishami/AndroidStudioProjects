package com.example.kellysonsataides.imcv09;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

import static android.view.WindowManager.LayoutParams.*;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular;
    private EditText peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(SOFT_INPUT_ADJUST_PAN);

        btnCalcular = (Button) findViewById(R.id.btn1);
        peso = (EditText) findViewById(R.id.eT1);
        altura = (EditText) findViewById(R.id.eT2);

        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                double peso1 = Double.parseDouble(peso.getText().toString());
                double altura1 = Double.parseDouble(altura.getText().toString());
                double calculaIMC = (peso1 / (altura1 * altura1));

                DecimalFormat f = new DecimalFormat("00.00");
                //System.out.println(f.format(calculaIMC));

                String sc;

                if (calculaIMC < 17) {
                    sc = "Você está muito abaixo do peso.";
                } else if (calculaIMC > 17 && calculaIMC <= 18.49) {
                    sc = "Você está abaixo do peso.";
                } else if (calculaIMC > 18.5 && calculaIMC <= 24.99) {
                    sc = "Seu peso está normal.";
                } else if (calculaIMC > 25 && calculaIMC <= 29.99) {
                    sc = "Você está acima do peso.";
                } else if (calculaIMC > 30 && calculaIMC <= 34.99) {
                    sc = "Seu caso é de Obesidade Tipo I";
                } else if (calculaIMC > 35 && calculaIMC <= 39.99) {
                    sc = "Seu caso é de Obesidade Tipo II (severa)";
                } else {
                    sc = "Seu caso é de Obesidade Tipo III (mórbida)";
                }

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("RESULTADO:");
                dlg.setMessage("IMC= " +f.format(calculaIMC)+ ". " +sc);
                dlg.setNeutralButton("OK", null);
                dlg.show();
            }
        });


    }
}
