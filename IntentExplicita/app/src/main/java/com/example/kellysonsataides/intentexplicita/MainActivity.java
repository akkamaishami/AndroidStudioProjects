package com.example.kellysonsataides.intentexplicita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nome = (EditText) findViewById(R.id.eT01);
        Button ok = (Button) findViewById(R.id.bT01);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent new_intent = new Intent(MainActivity.this, SegundaActivity.class);
                new_intent.putExtra("NomeParametro", nome.getText().toString());
                startActivity(new_intent);

            }
        });

    }
}