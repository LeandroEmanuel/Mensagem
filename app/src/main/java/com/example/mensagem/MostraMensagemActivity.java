package com.example.mensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class MostraMensagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_mensagem);
        Intent intent = getIntent();
        String mensagem = intent.getStringExtra("MENSAGEM");
        Toast.makeText(this, "mensagem", Toast.LENGTH_SHORT).show(); // Mensagem informativa
        //TextView texto = new TextView(this);
        TextView texto = (TextView) findViewById(R.id.textView2);
        texto.setText(mensagem);
    }
}
