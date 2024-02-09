package br.com.bootcampdio.models;

import br.com.bootcampdio.interfaces.CalculaXpInterface;

import java.time.LocalDate;

public class Mentorias extends Conteudo implements CalculaXpInterface {
    private LocalDate dataMentoria;



    public Mentorias(){}
    public Mentorias(String titulo, String descricao, LocalDate dataMentoria) {
        super(titulo, descricao);
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public Double calculaXp() {
        return 10d;
    }
}
