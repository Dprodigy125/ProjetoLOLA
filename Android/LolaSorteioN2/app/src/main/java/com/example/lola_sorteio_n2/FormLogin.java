package com.example.lola_sorteio_n2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class FormLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
    }

    public void telaLogado(View view)
    {
        Intent secondActivity = new Intent(this, Tela_Logada.class);
        startActivity(secondActivity);
    }

    public void telaCadastro(View view)
    {
        Intent secondActivity = new Intent(this, TelaCadastro.class);
        startActivity((secondActivity));
    }
}