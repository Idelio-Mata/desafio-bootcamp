import dominio.bootcamp.Bootcamp;
import dominio.curso.Curso;
import dominio.dev.Dev;
import dominio.mentoria.Mentoria;

import java.time.LocalDate;

public class Application {
    public static void main(String[]ars){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Aprendendo os Fundamentos");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Aprenda java Com a DIO");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Desenvolvendo em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devIdelio = new Dev();

        devIdelio.setNome("Idélio");
        devIdelio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Idélio:" + devIdelio.getConteudosInscritos());
        devIdelio.progredir();
        devIdelio.progredir();
        System.out.println("__");
        System.out.println("Conteúdos inscritos Idélio:" + devIdelio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Idélio:" + devIdelio.getConteudosConcluidos());
        System.out.println("XP:" + devIdelio.calcularTotalXp());

        System.out.println(".......................");

        Dev devLeonel = new Dev();
        devLeonel.setNome("Leonel");
        devLeonel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Leonel:" + devLeonel.getConteudosInscritos());
        devLeonel.progredir();
        devLeonel.progredir();
        devLeonel.progredir();
        System.out.println("__");
        System.out.println("Conteúdos inscritos Leonel:" + devLeonel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Leonel:" + devLeonel.getConteudosConcluidos());
        System.out.println("XP:" + devLeonel.calcularTotalXp());
    }
}
