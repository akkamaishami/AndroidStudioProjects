package com.example.kellysonsataides.edittextcomtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText texto = (EditText) findViewById(R.id.eT01);
        Button ok = (Button) findViewById(R.id.bT01);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), texto.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
