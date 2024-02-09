package br.com.bootcampdio.models;

import br.com.bootcampdio.interfaces.CalculaXpInterface;

import java.math.BigDecimal;

public class Cursos extends Conteudo implements CalculaXpInterface {
    private Double cargaHoraria;

    public Cursos() {}
    public Cursos(String titulo, String descricao, Double cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public Double calculaXp() {
        return 10d * this.cargaHoraria;
    }
}
