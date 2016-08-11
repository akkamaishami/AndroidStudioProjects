package com.example.kellysonsataides.tratamentodeeventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BemVindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bemvindo);

        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(", seja bem-vindo." +nome );

    }
}
