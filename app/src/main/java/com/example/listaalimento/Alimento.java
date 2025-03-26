package com.example.listaalimento;

public class Alimento {
    private String nome;
    private String caloria;
    private String quantidade;
    private String img;

    public Alimento(String nome, String caloria, String quantidade, String img) {
        this.nome = nome;
        this.caloria = caloria;
        this.quantidade = quantidade;
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaloria() {
        return caloria;
    }

    public void setCaloria(String caloria) {
        this.caloria = caloria;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

