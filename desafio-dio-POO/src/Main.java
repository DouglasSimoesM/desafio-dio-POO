import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas");
        devDouglas.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Douglas: "+devDouglas.getConteudosInscritos());
        devDouglas.progredir();
        devDouglas.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos concluidos Douglas: "+devDouglas.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Douglas: "+devDouglas.getConteudosInscritos());
        System.out.println("XP "+devDouglas.calcularTotalXp());
        System.out.println("----------------");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos concluidos Joao: "+devJoao.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Joao: "+devJoao.getConteudosInscritos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());



    }
}
