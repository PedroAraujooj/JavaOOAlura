package programas.testes;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStream {
	public static void main(String[] args) {
		
	    ArrayList<Curso> cursos = new ArrayList<>();
	    cursos.add(new Curso("Python", 45));
	    cursos.add(new Curso("JavaScript", 150));
	    cursos.add(new Curso("Java 8", 113));
	    cursos.add(new Curso("C", 55));


	    //cursos.sort(Comparator.comparing(Curso::getAlunos));

	    System.out.println(cursos.stream().filter(c -> c.getAlunos() > 50).mapToInt(c -> c.getAlunos()).sum());
	    cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
	    System.out.println(cursos.stream().filter(c -> c.getAlunos() > 50).mapToInt(c -> c.getAlunos()).average());
	    cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toMap(c -> c.getNome(), c-> c.getAlunos()));
	    
	   Optional<Curso> findAny = cursos.stream().filter(c -> c.getAlunos() > 50).findAny();
	   System.out.println(findAny.get().getAlunos());

	   
	   
	    //System.out.println(findFirst);

	    //cursos.forEach(c -> System.out.println(c.getAlunos()));
	
	}

}
