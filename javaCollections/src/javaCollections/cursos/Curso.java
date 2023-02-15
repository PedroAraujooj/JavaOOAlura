package javaCollections.cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javaCollections.aulas.Aula;

public class Curso {
	
	private String instrutor;
	private String nome;
	private List<Aula> aulas = new ArrayList<>();
	
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
		return Collections.unmodifiableList(aulas);
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
	
}
