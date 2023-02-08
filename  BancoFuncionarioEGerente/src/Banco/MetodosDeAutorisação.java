package Banco;

public class MetodosDeAutorisação {

	int senha;
	
	public void setSenha(int senha) {
		this.senha=senha;
		
	}

	
	public int getSenha() {
		return this.senha;
	}

	
	public boolean autentica(int senha) {
		if(this.senha==senha) return true;
		return false;
	}

}
