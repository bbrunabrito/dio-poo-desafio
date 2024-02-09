package br.com.bootcampdio.models;

public class Conteudo {
    private String titulo;
    private String descricao;
    private String status;

    public Conteudo() {}
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = "Não inicializado";
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
