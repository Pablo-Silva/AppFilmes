package com.example.shootingstars.appfilmes;

public class Filme {

    private String nome;
    private String genero;
    private Integer nota;

    public Filme(){}

    public Filme(String nome,int nota, String genero) {
        this.nome = nome;
        this.nota = nota;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getNota(){return nota;}

    public void setNota(Integer nota){ this.nota = nota;}
}
