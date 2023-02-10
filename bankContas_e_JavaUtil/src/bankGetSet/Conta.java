package bankGetSet;

import java.io.Serializable;

abstract public class Conta implements Comparable<Conta>, Serializable{
	

	private static final long serialVersionUID = -1428436982336312401L;
		private double saldo;
		private int numeroDaConta;
		private int agencia;
		private Cliente cliente;
		private static int total;
		
		public Conta(int agencia, int numero) {
//			if ((agencia<=99 || agencia>= 1000) || (numero<=999 || numero>=10000)) {
//				System.out.println("agencia invalida ou numero invalidos");
//				return;
//			}
			Conta.total++;
			this.agencia= agencia;
			this.numeroDaConta= numero;
			System.out.println("a agencia e o numero sao respectivamente "+ this.agencia+" "+ this.numeroDaConta);
			System.out.println(" no momento existem "+ Conta.total + " contas");
			
		}
		
		public void deposita(double valor) {
			if (valor>0) {
				this.saldo+= valor;
			}
			else {
				System.out.println("so ha como depositar valores maiores que 0");
				return; 
			}
		}
		public void saca( double valor) {
			if ( this.saldo< valor) {
				throw new SaldoInsuficienteException("saldo insuficiente");
			}
			else this.saldo-= valor;; 
		}
		public void transfere( double valor, Conta destino) {
			this.saca(valor);
			destino.deposita(valor);
			
		}
		public double getSaldo() {
			return this.saldo;
		}
	
	    public int getAgencia() {
			return this.agencia;
		}
	  
	    public int getNumeroDaConta() {
	    	return this.numeroDaConta;
	    }
	    
	    public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
	    	
	    public Cliente getCliente() {
			return cliente;
		}
		public static int getTotal() {
			return Conta.total;
			
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
			return "Conta, numero " + this.numeroDaConta;
		}
		
		@Override
		public boolean equals(Object obj){
			Conta ref = (Conta)obj;
			if(this.numeroDaConta == ref.getNumeroDaConta()) {
				return true;
			}
			else{
				return false;
			}
		}
		
		@Override
		public int compareTo(Conta o) {
			return Integer.compare(this.numeroDaConta, o.getNumeroDaConta() );
		}
	}
