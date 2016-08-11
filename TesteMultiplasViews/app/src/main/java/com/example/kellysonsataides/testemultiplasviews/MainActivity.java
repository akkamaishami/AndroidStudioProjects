package com.example.kellysonsataides.testemultiplasviews;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button ok;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = (Button) findViewById(R.id.bT01);
        texto = (EditText) findViewById(R.id.eT01);

        ok.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
        dlg.setMessage(texto.getText().toString());
        dlg.setNeutralButton("OK", null);
        dlg.show();
    }
}