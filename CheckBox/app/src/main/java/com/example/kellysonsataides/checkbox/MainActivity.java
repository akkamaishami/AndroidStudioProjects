package com.example.kellysonsataides.checkbox;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends  AppCompatActivity implements View.OnClickListener {

    private CheckBox sms = (CheckBox) findViewById(R.id.cB1);
    private CheckBox email = (CheckBox) findViewById(R.id.cB2);
    private CheckBox telefone = (CheckBox) findViewById(R.id.cB3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sms = (CheckBox) findViewById(R.id.cB1);
        //email = (CheckBox) findViewById(R.id.cB2);
        //telefone = (CheckBox) findViewById(R.id.cB3);

        Button verificar = (Button) findViewById(R.id.btn1);
        verificar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String mensagem = "Os itens marcados foram: ";
        if (sms.isChecked())
            mensagem += " SMS,";
        if (email.isChecked())
            mensagem += " E-Mail,";
        if (telefone.isChecked())
            mensagem += " Telefone.";

        AlertDialog.Builder msgbox = new AlertDialog.Builder(MainActivity.this);
        msgbox.setMessage(mensagem);
        msgbox.setNeutralButton("OK",null);
        msgbox.show();

    }
}
