package bankGetSet;

public class ContaCorrente extends Conta implements Tributavel{
	
	private int numeroDoCartao;
	private Conta conta;
	private MetodosTributos metodo;
	
	public ContaCorrente(int agencia, int numero, int numeroDoCartao) {
		super(agencia, numero);
		this.numeroDoCartao= numeroDoCartao;
		MetodosTributos metodo= new MetodosTributos();
		this.metodo= metodo;
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		MetodosTributos metodo= new MetodosTributos();
		this.metodo= metodo;
	}
	
	public int getNumeroDoCartao(int numeroDoCartao) {
		return this.numeroDoCartao;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
		System.out.println("conta correspondente a " + conta.getCliente().getNome());
	}
	
	public Conta getConta() {
		return conta;
	}
	
	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		super.saca(valor+10);
	}

	@Override
	public void setTributo(double tributo) {
		this.metodo.setTributo(tributo);
	}

	@Override
	public double getTributo() {
		return	this.metodo.getTributo();
	}

}
