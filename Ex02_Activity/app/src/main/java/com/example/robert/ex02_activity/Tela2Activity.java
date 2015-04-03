package com.example.robert.ex02_activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Tela2Activity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent it = getIntent();
        TextView txt = (TextView)findViewById(R.id.textView);

        String nome = it.getStringExtra("nome");
        txt.setText("Nome: "+nome);

        /*Pessoa pessoa = (Pessoa)it.getSerializableExtra("pessoa");
        String texto = "Nome: "+pessoa.nome+" / Idade: "+pessoa.idade;
        txt.setText(texto);*/


    }
}
