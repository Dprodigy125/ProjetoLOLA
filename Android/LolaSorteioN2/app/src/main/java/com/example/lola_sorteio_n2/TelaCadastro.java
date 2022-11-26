package com.example.lola_sorteio_n2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TelaCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void telaLogado(View view)
    {
        Intent secondActivity = new Intent(this, Tela_Logada.class);
        startActivity(secondActivity);
    }
}
