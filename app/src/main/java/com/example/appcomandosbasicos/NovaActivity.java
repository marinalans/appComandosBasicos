package com.example.appcomandosbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NovaActivity extends AppCompatActivity {

    Button bt_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);

        bt_voltar = findViewById(R.id.bt_voltar);

        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarAtividade = new Intent(NovaActivity.this, MainActivity.class);
                startActivity(voltarAtividade);
            }
        });
    }
}