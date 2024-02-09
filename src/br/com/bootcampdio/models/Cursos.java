package br.com.bootcampdio.models;

import br.com.bootcampdio.interfaces.CalculaXpInterface;

import java.math.BigDecimal;

public class Cursos extends Conteudo implements CalculaXpInterface {
    private BigDecimal cargaHoraria;

    public Cursos() {}
    public Cursos(String titulo, String descricao, BigDecimal cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public BigDecimal getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(BigDecimal cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void calculaXp() {

    }
}
