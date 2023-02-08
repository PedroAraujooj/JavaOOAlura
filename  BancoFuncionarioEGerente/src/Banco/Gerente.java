package Banco;

public class Gerente extends Funcionario implements Autorisado /*Autorisado*/ {
	
	
	
	
	public double getBonificacao() {
		return getSalary()*0.4;
	}

private MetodosDeAutorisação metodo;
	
	public Gerente() {
		// TODO Auto-generated constructor stub
		MetodosDeAutorisação metodo= new MetodosDeAutorisação();
	}

	@Override
	public void setSenha(int senha) {
		metodo.setSenha(senha);
		
	}

	@Override
	public int getSenha() {
		return this.metodo.getSenha();
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return this.metodo.autentica(senha);
	}

}
