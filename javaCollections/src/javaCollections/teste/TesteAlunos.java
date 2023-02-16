package javaCollections.teste;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import javaCollections.alunos.Aluno;
import javaCollections.cursos.Curso;

public class TesteAlunos {
	
	public static void main(String[] args) {
		 
		Curso curso = new Curso("Java e OO", "Paulo");
		
		curso.matricula(new Aluno("Pedro", 001));
		curso.matricula(new Aluno("Paulo", 002));
		curso.matricula(new Aluno("Patricia", 003));
		curso.matricula(new Aluno("Penido", 004));
		
		//System.out.println(curso.getAlunos());  //--------------> uso atual 
		
		Iterator<Aluno> ite = curso.getAlunos().iterator(); // -----> como era feito antigamente 
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
//		Set<String> nomes = Collections.emptySet();  ----> esse set vai ser sempre vazio! n tem como adc nd
//        nomes.add("Paulo");
		boolean estaMt = curso.estaMatriculado(new Aluno("Pedro", 005));
		System.out.println(estaMt);
		
	}

}
