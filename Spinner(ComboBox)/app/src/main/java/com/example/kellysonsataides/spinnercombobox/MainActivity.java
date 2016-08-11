package com.example.kellysonsataides.spinnercombobox;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner estado_civil = (Spinner) findViewById(R.id.sP01);

        final ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.estado_civil,
                                                android.R.layout.simple_spinner_dropdown_item);

        estado_civil.setAdapter(adapter);

        AdapterView.OnItemSelectedListener escolha = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String item = estado_civil.getSelectedItem().toString();

                Toast.makeText(getBaseContext(), "O item selecionado foi "+item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };

        estado_civil.setOnItemSelectedListener(escolha);
    }
}
