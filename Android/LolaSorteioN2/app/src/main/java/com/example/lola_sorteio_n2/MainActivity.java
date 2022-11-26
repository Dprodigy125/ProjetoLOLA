package com.example.lola_sorteio_n2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Tela_login(view view)
    {

    }

    public void telaLogin(View view)
    {
        Intent secondActivity = new Intent(this, FormLogin.class);
        startActivity(secondActivity);
    }

    public void telaCadastro(View view)
    {
        Intent secondActivity = new Intent(this, TelaCadastro.class);
        startActivity((secondActivity));
    }
}