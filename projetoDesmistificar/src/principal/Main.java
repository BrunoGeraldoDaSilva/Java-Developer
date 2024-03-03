package principal;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.QA;
import dominio.Mentoria;
import static java.lang.System.out;
import java.time.LocalDate;

public class Main {
	public static void main(String[]args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Quality Assurance");
		curso1.setDescricao("descrição curso Quality Assurance");
		curso1.setCargaHoraria(180);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso Introdução a Qualidade de Software");
		curso2.setDescricao("descrição curso Qualidade de Software");
		curso2.setCargaHoraria(58);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de QA");
		mentoria.setDescricao("descrição mentoria QA");
		mentoria.setData(LocalDate.now());
		
		/*out.println(curso1);
		out.println(curso2);
		out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Testador");
		bootcamp.setDescricao("Descrição Bootcamp Testador");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		QA qaBruno = new QA();
		qaBruno.setNome("Bruno");
		qaBruno.inscreverBootcamp(bootcamp);
		out.println("Conteúdos inscritos Bruno" + qaBruno.getConteudosInscritos());
		
		qaBruno.progredir();
		out.println("-");
		out.println("Conteúdos inscritos Bruno" + qaBruno.getConteudosInscritos());
		out.println("Conteúdos Concluidos Bruno" + qaBruno.getConteudosInscritos());
		out.println("XP:" + qaBruno.calcularTotalXp());
		
		out.println("-------------");
		
		QA qaPaulo = new QA();
		qaPaulo.setNome("Paulo");
		qaPaulo.inscreverBootcamp(bootcamp);
		out.println("Conteúdos Inscritos Paulo"+ qaPaulo.getConteudosInscritos());
		
		qaPaulo.progredir();
		out.println("-");
		out.println("Conteúdos inscritos Paulo" + qaPaulo.getConteudosInscritos());
		out.println("Conteúdos Concluidos Paulo"+ qaPaulo.getConteudosInscritos());
		out.println("XP:" + qaPaulo.calcularTotalXp());
	}
}

