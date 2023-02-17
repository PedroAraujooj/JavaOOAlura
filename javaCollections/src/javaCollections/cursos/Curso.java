package javaCollections.cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import javaCollections.alunos.Aluno;
import javaCollections.aulas.Aula;

public class Curso {
	
	private String instrutor;
	private String nome;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculasParaAlunos = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.instrutor = instrutor;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}
	
	public void addAulas(Aula aula){
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int total = 0;
		for (Aula aula : aulas) {
			total+= aula.getTempo();
		}
		//this.aulas.stream().mapToInt(Aula::getTempo); ----> retornaria a mesma coisa
		return total;
	}
	
	@Override
	public String toString() {
		return "Esse curso tem as aulas: " + getAulas() + ", com o total de " + getTempoTotal() +  " minutos";
	}
	
	public void matricula(Aluno aluno){
		this.alunos.add(aluno);
		this.matriculasParaAlunos.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int key) {
		if (!matriculasParaAlunos.containsKey(key)) throw new NoSuchElementException("Matricula não encontrada");
		return matriculasParaAlunos.get(key);
	}
}
