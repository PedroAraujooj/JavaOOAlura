package javaCollections.aulas;

public class Aula implements Comparable<Aula>{
	
	private int tempo;
	private String aula;

	public Aula(String aula, int tempo) {
		this.aula = aula;
		this.tempo = tempo;	
	}
	
	@Override
	public String toString() {
		return "A aula de tema: " + aula + " tem " + tempo + " minutos" ;
	}

	@Override
	public int compareTo(Aula o) {
		// TODO Auto-generated method stub
		return this.aula.compareTo(o.getAula());
	}

	public String getAula() {
		// TODO Auto-generated method stub
		return this.aula;
	}
	
	public int getTempo() {
		return this.tempo;
	}
	
	

}
