package br.com.bootcampdio.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private String descricao;
    private String nome;
    private List<Devs> listaDev = new ArrayList<>();
    private List<Mentorias> listaMentorias = new ArrayList<>();
    private List<Cursos> listaCursos = new ArrayList<>();

}
