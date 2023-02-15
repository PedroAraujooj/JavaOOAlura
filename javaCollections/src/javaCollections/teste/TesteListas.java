package javaCollections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javaCollections.aulas.Aula;
import javaCollections.cursos.Curso;

public class TesteListas {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("java collections", "paulo");
		List<Aula> aulas = curso1.getAulas();
		
		//System.out.println(aulas);
		
		curso1.addAulas(new Aula("java.util", 13));
		curso1.addAulas(new Aula("Trabalhando com ArrayList", 21));
		curso1.addAulas(new Aula("Criando uma Aula", 20));
		curso1.addAulas(new Aula("Modelando com coleções", 22));
		
		//System.out.println(curso1.getAulas().get(0));
		
		List<Aula> aulas1 = new ArrayList<>(aulas);
		Collections.sort(aulas1);
		System.out.println(aulas1);
		
		System.out.println(curso1.getTempoTotal());
		
		System.out.println(curso1);
	}

}
