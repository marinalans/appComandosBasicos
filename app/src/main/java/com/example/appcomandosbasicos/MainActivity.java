package com.example.appcomandosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button bt_01, bt_02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_01 = findViewById(R.id.bt_01);
        bt_02 = findViewById(R.id.bt_02);

        bt_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(MainActivity.this,"Este é o botão 01", Toast.LENGTH_SHORT).show();
            }
        });

        bt_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mudarAtividade = new Intent(MainActivity.this, NovaActivity.class);
                startActivity(mudarAtividade);
            }
        });
    }

}