package bankGetSet;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	public Cliente(String cpf) {
		this.cpf= cpf;
	}
	public Cliente() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	

}
