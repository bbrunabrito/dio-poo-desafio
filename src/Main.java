import br.com.bootcampdio.models.Bootcamp;
import br.com.bootcampdio.models.Cursos;
import br.com.bootcampdio.models.Devs;
import br.com.bootcampdio.models.Mentorias;
import br.com.bootcampdio.services.BootcampService;
import br.com.bootcampdio.services.DevsService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcampJava = new Bootcamp(
                LocalDate.of(2025,01,01),
                LocalDate.of(2025,04,30),
                "Bootcamp de Java",
                "Bootcamp DIO");
        Cursos introducaoJava = new Cursos("Introducao Java", "Curso de Introducao Java", 10d);
        Cursos pooJava = new Cursos("Poo Java", "Curso de POO Java", 25d);
        Mentorias mercadoJava = new Mentorias("Mercado Java", "Mentoria de Java", LocalDate.of(2025,02,24));
        Devs bruna = new Devs("Bruna");
        Devs gabriel = new Devs("Gabriel");
        Devs mauro = new Devs("Mauro");


        System.out.println(bootcampJava);


        BootcampService.cadastraMentoriaBootcamp(bootcampJava,mercadoJava);
        BootcampService.cadastraCursoBootcamp(bootcampJava,introducaoJava);
        BootcampService.cadastraCursoBootcamp(bootcampJava,pooJava);

        DevsService.executaInscricaoBootcamp(bruna, bootcampJava);
        BootcampService.exibeDevsParticipantes(bootcampJava);

        System.out.println(bruna);
        DevsService.exibeCursos(bruna);
        DevsService.atualizaProgressoCurso(bruna, 25d, pooJava);
        DevsService.atualizaProgressoBootcamp(bruna);
        DevsService.atualizaProgressoCurso(bruna, 25d, pooJava);
        DevsService.atualizaProgressoCurso(bruna, 25d, pooJava);
        DevsService.atualizaProgressoBootcamp(bruna);
        BootcampService.exibeDevsParticipantes(bootcampJava);

        DevsService.calculaXpTotalDev(bruna);
        System.out.println(bruna.toString());
    }
}