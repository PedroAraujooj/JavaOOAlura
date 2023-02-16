package javaCollections.alunos;

import java.util.Objects;

public class Aluno {
	
	String nome;
	int numeroMatricula;
	public Aluno(String nome, int numeroMatricula) {
		if(nome == null) throw new NullPointerException("Precisa digitar um nome");
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	public String getNome() {
		return nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		Aluno aluno = (Aluno)obj;
//		return this.getNome().equals(aluno.getNome());
//	}
//	
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}

}
