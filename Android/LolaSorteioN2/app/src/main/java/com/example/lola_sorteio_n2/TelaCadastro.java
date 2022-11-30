package com.example.lola_sorteio_n2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lola_sorteio_n2.controladores.UsuarioBD;
import com.example.lola_sorteio_n2.modelos.Usuario;

public class TelaCadastro extends AppCompatActivity {

    Context context;
    EditText txtemail, txtsenha, txtnome, txtcpf, txtcep, txtendereco, txtcidade, txtestado, txttelefone, txtdia;
    int id;
    UsuarioBD usuarioBD;
    Usuario Usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    private Usuario init(){
        context = getApplicationContext();
        txtemail = findViewById(R.id.edit_email);
        txtsenha = findViewById(R.id.edit_senhas);
        txtnome = findViewById(R.id.edit_nome);
        txtendereco = findViewById(R.id.edit_endereco);
        txtcidade = findViewById(R.id.edit_cidade);
        txtestado = findViewById(R.id.edit_estado);
        txttelefone = findViewById(R.id.edit_tel);
        txtdia = findViewById(R.id.edit_diai);

        Intent i =getIntent();
        Bundle bolsa = i.getExtras();
        id = bolsa.getInt("id");
        if ( id != 0){
            txtemail.setText( bolsa.getString("email"));
            txtsenha.setText( bolsa.getString("senha"));
            txtnome.setText( bolsa.getString("nome"));
            txtendereco.setText( bolsa.getString("endereco"));
            txtcidade.setText( bolsa.getString("cidade"));
            txtestado.setText( bolsa.getString("estado"));
            txttelefone.setText( bolsa.getString("tel"));
            txtdia.setText( bolsa.getString("diaev"));
        }

        return Usuario;





    }

    public void telaLogado(View view)
    {
        Intent secondActivity = new Intent(this, Tela_Logada.class);
        startActivity(secondActivity);
    }


    private Usuario criarUsuario() {
        Usuario usuario = new Usuario();
        String t = txtemail.getText().toString();
        String s = txtsenha.getText().toString();
        String a = txtnome.getText().toString();
        String b = txtendereco.getText().toString();
        String c = txtcidade.getText().toString();
        String d = txtestado.getText().toString();
        String tele = txttelefone.getText().toString();
        String dia = txtdia.getText().toString();

        usuario.setId(id);
        usuario.setEmail(t);
        usuario.setSenha(s);
        usuario.setNome(a);
        usuario.setEndereco(b);
        usuario.setCidade(c);
        usuario.setEstado(d);
        usuario.setTel(Integer.parseInt(tele));
        usuario.setDiaev(Integer.parseInt(dia));

        usuarioBD.add(usuario);
        return usuario;


    }
}


