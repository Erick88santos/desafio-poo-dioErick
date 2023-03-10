package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //criação de constantes
    protected static final double XP_PADRAO = 100d;

    private String titulo;
    private String descricao;

    //criando o método caucular XP
    public abstract double caucularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
