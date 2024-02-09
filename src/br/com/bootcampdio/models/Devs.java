package br.com.bootcampdio.models;

import java.util.List;
import java.util.Objects;

public class Devs {
    private String nome;
    private List<Mentorias> mentoriasLista;
    private List<Cursos> cursosLista;


    public Devs() {}
    public Devs(String nome, List<Mentorias> mentoriasLista, List<Cursos> cursosLista) {
        this.nome = nome;
        this.mentoriasLista = mentoriasLista;
        this.cursosLista = cursosLista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Mentorias> getMentoriasLista() {
        return mentoriasLista;
    }

    public void setMentoriasLista(List<Mentorias> mentoriasLista) {
        this.mentoriasLista = mentoriasLista;
    }

    public List<Cursos> getCursosLista() {
        return cursosLista;
    }

    public void setCursosLista(List<Cursos> cursosLista) {
        this.cursosLista = cursosLista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Devs devs)) return false;
        return Objects.equals(nome, devs.nome) && Objects.equals(mentoriasLista, devs.mentoriasLista) && Objects.equals(cursosLista, devs.cursosLista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mentoriasLista, cursosLista);
    }

    @Override
    public String toString() {
        return "Devs{" +
                "nome='" + nome + '\'' +
                ", mentoriasLista=" + mentoriasLista +
                ", cursosLista=" + cursosLista +
                '}';
    }
}
