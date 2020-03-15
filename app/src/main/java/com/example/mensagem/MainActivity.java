package com.example.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void enviaMensagem(View view) {
       Intent intent =  new Intent(this,MostraMensagemActivity.class); //aqui fica o que vai passar para a proxima actividade
        //String mensagem = "Olá mundo";//inicialmente enviamos esta mensagem fixa
        EditText editTextMensagem = (EditText) findViewById(R.id.editTextMensagem);
        String mensagem = editTextMensagem.getText().toString();
        intent.putExtra("MENSAGEM",mensagem); // MENSAGEM -> identificar a variavel
        startActivity(intent);

    }
}





