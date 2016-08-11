package com.example.kellysonsataides.radiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton mas = (RadioButton) findViewById(R.id.rB01);
        final RadioButton fem = (RadioButton) findViewById(R.id.rB02);
        Button ok = (Button) findViewById(R.id.bT01);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sexo = "";
                if (mas.isChecked()) {
                    sexo = "Masculino";
                }
                if (fem.isChecked()) {
                    sexo = "Feminino";
                }

                Toast.makeText(getApplicationContext(), "Sexo: "+sexo, Toast.LENGTH_LONG).show();
            }
        });
    }
}
