package modelos;

public class Categoria {
	private int id; 
	private String nome;
	
	public Categoria(String nome) {
		this.nome = nome;
	}
	public Categoria(int id, String nome) {
		this.nome = nome;
		this.id = id;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.getId()+ " " + this.getNome());
	}

}
