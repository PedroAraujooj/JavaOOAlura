package programas.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class TesteStream {
	public static void main(String[] args) {

		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		//cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));
		
		//cursos.forEach(c -> System.out.println(c.getAlunos()));
	}

}
