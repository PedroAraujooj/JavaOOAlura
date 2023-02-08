package Banco;

public class ControlBonificacao {
	private double bonificacaoTotal;
	
	public void setRegistra (Funcionario funcionario) {
		bonificacaoTotal+= funcionario.getBonificacao();
	}
	
	public double getRegistra() {
		return bonificacaoTotal;
	}

}
