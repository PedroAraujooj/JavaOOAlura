package modelos;

public class Produto {
	
	private int id;
	private String nome;
	private String descricao;
	
	public Produto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	public Produto(String nome, String descricao, int id) {
		this.nome = nome;
		this.descricao = descricao;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return (this.getId() +" "+this.getNome() +" "+ this.descricao) ;
	}

	 
	
}
	
	
	
