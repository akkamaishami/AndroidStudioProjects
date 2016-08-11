package com.example.kellysonsataides.project;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tV1 = (TextView) findViewById(R.id.tV1);
        final TextView tV2 = (TextView) findViewById(R.id.tV2);
        final TextView tV3 = (TextView) findViewById(R.id.tV3);
        final ImageView imagem = (ImageView) findViewById(R.id.iV1);
        final Button botao = (Button) findViewById(R.id.btn1);
        // final Button botao2 = (Button) findViewById(R.id.btn2);



        botao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                String VAR1 = String.valueOf((tV1.getCurrentTextColor()));

                if (VAR1.equals(Color.BLACK)) {
                    tV1.setTextColor(Color.CYAN);
                } else {
                    tV1.setTextColor(Color.BLACK);
                }

                if (tV2.getCurrentTextColor() == Color.BLACK) {
                    tV2.setTextColor(Color.MAGENTA);
                } else {
                    tV2.setTextColor(Color.BLACK);
                }

                if (tV3.getCurrentTextColor() == Color.BLACK) {
                    tV3.setTextColor(Color.GREEN);
                } else {
                    tV3.setTextColor(Color.BLACK);
                }

                imagem.setImageResource(R.drawable.robot2);
/*
                if (imagem.getResources() == R.drawable.robot2) {
                    imagem.setImageResource(R.drawable.robot);
                } else {
                    imagem.setImageResource(R.drawable.robot2);
                }
*/
            }

        });
    }

}