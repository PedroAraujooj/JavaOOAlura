package Banco;

public class Programador extends Funcionario {
	
	private int senha= 1313;
	
	public boolean getSenha(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return getSalary()*0.2 ;
	}

}
