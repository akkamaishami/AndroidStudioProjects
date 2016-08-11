package com.example.kellysonsataides.intentrecebendoparametro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int RC_SEGUNDA = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final TextView nome = (TextView) findViewById(R.id.eT01);
        Button ok = (Button) findViewById(R.id.bT01);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent veriavel = new Intent(MainActivity.this, SegundaActivity.class);

                veriavel.putExtra("TESTANDO", nome.getText().toString());
                startActivityForResult(veriavel, RC_SEGUNDA);
            }
        });

    }
}
