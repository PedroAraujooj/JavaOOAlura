package javaCollections.teste;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosStr {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");
        
        //alunos.forEach(aluno -> System.out.println(aluno));
        
        System.out.println(alunos.size());
        
        alunos.add("Pedro");
        
        System.out.println(alunos.size());
        
        boolean adicionou = alunos.add("Pedro");
        System.out.println("Pedro foi adicionado ao Set? " + adicionou);
	}

}
