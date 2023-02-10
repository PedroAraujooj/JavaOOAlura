package testes;

import java.io.Serializable;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 6763802197195161559L;
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
