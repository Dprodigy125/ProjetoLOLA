package com.example.lola_sorteio_n2.modelos;

public class Usuario {
    //atributos usuários
    private int id;
    private String email, senha, nome, endereco, estado, cidade;
    private int tel;
    private int diaev;

    //Construtor com argumentos
    public Usuario(int id, String email, String senha, String nome, String endereco, String estado, String cidade, int tel, int diaev) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.cidade = cidade;
        this.tel = tel;
        this.diaev = diaev;
    }

    //Construtor vazio

    public Usuario(){

    }

    //Metodos get e set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getDiaev() {
        return diaev;
    }

    public void setDiaev(int diaev) {
        this.diaev = diaev;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", tel=" + tel +
                ", diaev=" + diaev +
                '}';
    }

}
