package com.example.lola_sorteio_n2.controladores;

import com.example.lola_sorteio_n2.modelos.Usuario;
import java.util.List;

public interface IUsuarioBD {
    Usuario elemento(int id); // Devolve o elemento de acordo com o id
    Usuario elemento(String email); //Devolve o usuario de acordo com o e-mail

    List<Usuario> lista(); // Devolve uma lista com todos os elementos

    void add(Usuario user); //Adiciona elemento indicado
    void atualizar(int id, Usuario user); // Atualiza os dados do elemento pelo id

    void apagar(int id); //Elimina o elemento indicado
}
