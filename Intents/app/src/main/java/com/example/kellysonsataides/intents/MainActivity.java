package com.example.kellysonsataides.intents;

import android.content.Intent;
import android.net.Uri;
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

        final EditText eT_URL = (EditText) findViewById(R.id.eT01);
        Button ok = (Button) findViewById(R.id.bT01);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse(eT_URL.getText().toString());
                Intent AbrirBrowser = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(AbrirBrowser);
            }
        });
    }
}
