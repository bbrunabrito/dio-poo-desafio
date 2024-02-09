package br.com.bootcampdio.models;

import java.util.List;
import java.util.Objects;

public class Devs {
    private String nome;
    private Bootcamp bootcamp;
    private Double progresso;
    private Double xpTotal;


    public Devs() {}
    public Devs(String nome) {
        this.nome = nome;
        this.progresso = 0d;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }

    public Double getProgresso() {
        return progresso;
    }

    public Double getXpTotal() {
        return xpTotal;
    }

    public void setXpTotal(Double xpTotal) {
        this.xpTotal = xpTotal;
    }

    public void setProgresso(Double progresso) {
        this.progresso = progresso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Devs devs)) return false;
        return Objects.equals(nome, devs.nome) && Objects.equals(bootcamp, devs.bootcamp) && Objects.equals(progresso, devs.progresso) && Objects.equals(xpTotal, devs.xpTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, bootcamp, progresso, xpTotal);
    }

    @Override
    public String toString() {
        return "Devs{" +
                "nome='" + nome + '\'' +
                ", bootcamp=" + bootcamp.getNome() +
                ", progresso=" + progresso +
                ", xpTotal=" + xpTotal +
                '}';
    }
}
