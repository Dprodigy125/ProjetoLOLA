package com.example.lola_sorteio_n2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lola_sorteio_n2.controladores.UsuarioBD;


public class FormLogin extends AppCompatActivity {

    Context context;
    EditText txtemail, txtsenha;
    int id;
    UsuarioBD usuarioBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
    }

    public void telaLogado(View view) {
        Intent secondActivity = new Intent(this, Tela_Logada.class);
        startActivity(secondActivity);
    }

    public void telaCadastro(View view) {
        Intent secondActivity = new Intent(this, TelaCadastro.class);
        startActivity((secondActivity));
    }

    private void init() {
        context = getApplicationContext();
        txtemail = findViewById(R.id.edit_email);
        txtsenha = findViewById(R.id.edit_senhas);

        Intent i = getIntent();
        Bundle bolsa = i.getExtras();
        id = bolsa.getInt("id");
        return;
    }
}