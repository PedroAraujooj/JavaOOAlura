package Banco;

public class Administrador extends Funcionario implements Autorisado /*Autorisado*/ {
	

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return getSalary()*0.2;
	}
		
private MetodosDeAutorisação metodo;
	
	public Administrador() {
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


