package com.example.kellysonsataides.tratamentodeeventos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);

                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if (login.equals("kellyson") && senha.equals("ksa123")) {
                    Intent intent = new Intent( getContext(), BemVindo.class);
                    Bundle parans = new Bundle();
                    parans.putString("none", "Ricardo Lecheta");
                    intent.putExtras(parans);
                    startActivity(intent);

                    //alert("Login Realizado");
                } else {
                    alert("Login e Senha incorretos.");
                }
            }
        });
    }

    private Context getContext() {
        return this;
    }

    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }
}
