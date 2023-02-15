package javaCollections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javaCollections.aulas.Aula;

public class TesteListasCurso {

	public static void main(String[] args) {
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(new Aula("java.io", 15));
		aulas.add(new Aula("java.lang", 29));
		aulas.add(new Aula("java.util", 21));
		
		//aulas.remove(1);
		
		Collections.sort(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		Collections.reverse(aulas);
		
		System.out.println(aulas);
	}

}
