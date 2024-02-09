package br.com.bootcampdio.services;

import br.com.bootcampdio.models.Bootcamp;
import br.com.bootcampdio.models.Cursos;
import br.com.bootcampdio.models.Devs;
import br.com.bootcampdio.models.Mentorias;

import java.util.Iterator;

public class DevsService {
    public static void executaInscricaoBootcamp(Devs dev, Bootcamp bootcamp) {
        bootcamp.getListaDev().add(dev);
        dev.setBootcamp(bootcamp);
    }

    public static void atualizaProgressoCurso(Devs dev, Double progresso, Cursos curso) {
        Iterator<Cursos> it = dev.getBootcamp().getListaCursos().iterator();
        while (it.hasNext()) {
            if (it.next().getTitulo().equalsIgnoreCase(curso.getTitulo())) {
                curso.setStatus(progresso + curso.getStatus());
                break;
            }
        }
    }

    public static void atualizaProgressoBootcamp(Devs dev) {
        Double progresso = dev.getBootcamp().getListaCursos().stream().mapToDouble(Cursos::getStatus).sum();
        progresso += dev.getBootcamp().getListaMentorias().stream().mapToDouble(Mentorias::getStatus).sum();
        dev.setProgresso(progresso);
    }

    public static void calculaXpTotalDev(Devs dev) {
        Double xp = dev.getBootcamp().getListaCursos().stream().mapToDouble(Cursos::calculaXp).sum();
        xp += dev.getBootcamp().getListaMentorias().stream().mapToDouble(Mentorias::calculaXp).sum();
        dev.setXpTotal(xp);
    }

    public static void exibeCursos(Devs dev) {
        for (Cursos cursos : dev.getBootcamp().getListaCursos()) {
            System.out.println(cursos.getTitulo() + " - " + cursos.getStatus());
        }
    }
}
