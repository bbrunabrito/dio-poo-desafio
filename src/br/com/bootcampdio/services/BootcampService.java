package br.com.bootcampdio.services;

import br.com.bootcampdio.models.Bootcamp;
import br.com.bootcampdio.models.Cursos;
import br.com.bootcampdio.models.Devs;
import br.com.bootcampdio.models.Mentorias;

import java.util.Iterator;

public class BootcampService {
    public static void cadastraCursoBootcamp(Bootcamp bootcamp, Cursos curso) {
        bootcamp.getListaCursos().add(curso);
    }

    public static void cadastraMentoriaBootcamp(Bootcamp bootcamp, Mentorias mentoria) {
        bootcamp.getListaMentorias().add(mentoria);
    }

    public static void exibeDevsParticipantes(Bootcamp bootcamp) {
        Iterator<Devs> devsIterator = bootcamp.getListaDev().iterator();
        while (devsIterator.hasNext()) {
            Devs dev = devsIterator.next();
            System.out.println(dev.getNome() + " - Progresso: " + dev.getProgresso());
        }
    }
}
