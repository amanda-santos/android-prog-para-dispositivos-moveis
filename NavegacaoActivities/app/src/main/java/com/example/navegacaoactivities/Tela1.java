package com.example.navegacaoactivities;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button botaoVoltarTelaInicial = (Button) findViewById(R.id.btnVoltarTelaInicial);
        botaoVoltarTelaInicial.setOnClickListener(this);

        Intent i = getIntent();
        String disciplina = i.getStringExtra("disciplina");
        String professor = i.getStringExtra("professor");
        String curso = i.getStringExtra("curso");

        TextView valueDisciplina = findViewById(R.id.valueDisciplina);
        TextView valueProfessor = findViewById(R.id.valueProfessor);
        TextView valueCurso = findViewById(R.id.valueCurso);

        valueDisciplina.setText(disciplina);
        valueProfessor.setText(professor);
        valueCurso.setText(curso);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnVoltarTelaInicial:
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}