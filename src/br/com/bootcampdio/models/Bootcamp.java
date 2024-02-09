package br.com.bootcampdio.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bootcamp {
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private String descricao;
    private String nome;
    private List<Devs> listaDev;
    private List<Mentorias> listaMentorias;
    private List<Cursos> listaCursos;

    public Bootcamp() {}
    public Bootcamp(LocalDate dataInicio, LocalDate dataTermino, String descricao, String nome) {
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.descricao = descricao;
        this.nome = nome;
        this.listaCursos = new ArrayList<>();
        this.listaDev = new ArrayList<>();
        this.listaMentorias = new ArrayList<>();
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Devs> getListaDev() {
        return listaDev;
    }

    public void setListaDev(List<Devs> listaDev) {
        this.listaDev = listaDev;
    }

    public List<Mentorias> getListaMentorias() {
        return listaMentorias;
    }

    public void setListaMentorias(List<Mentorias> listaMentorias) {
        this.listaMentorias = listaMentorias;
    }

    public List<Cursos> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Cursos> listaCursos) {
        this.listaCursos = listaCursos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataTermino, bootcamp.dataTermino) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(nome, bootcamp.nome) && Objects.equals(listaDev, bootcamp.listaDev) && Objects.equals(listaMentorias, bootcamp.listaMentorias) && Objects.equals(listaCursos, bootcamp.listaCursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicio, dataTermino, descricao, nome, listaDev, listaMentorias, listaCursos);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", descricao='" + descricao + '\'' +
                ", nome='" + nome + '\'' +
                ", listaDev=" + listaDev +
                ", listaMentorias=" + listaMentorias +
                ", listaCursos=" + listaCursos +
                '}';
    }
}
