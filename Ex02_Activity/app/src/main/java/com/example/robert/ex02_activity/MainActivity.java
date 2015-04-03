package com.example.robert.ex02_activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    EditText editTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTexto = (EditText) findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Button buttonTela2 = (Button) findViewById(R.id.button2);
        buttonTela2.setOnClickListener(this);
    //Botao 3
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        //BOtao4
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button:
                String texto = editTexto.getText().toString();
                Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
                break;

            case R.id.button2:
                Intent ite = new Intent(this, Tela2Activity.class);
                ite.putExtra("nome", "Ludson");
                ite.putExtra("idade", 24);
                startActivity(ite);
                break;

            case R.id.button3:
                Cliente cliente = new Cliente(1, "Ludson");
                Intent intent = new Intent(this, Tela2Activity.class);
                intent.putExtra("cliente", cliente);
                startActivity(intent);
                break;

            case R.id.button4:
                Intent intent2 = new Intent(this,Tela2Activity.class);
                intent2.putExtra("pessoa", new Pessoa("Ludson A", 22));
                startActivity(intent2);
                break;
        }

    }
}
