package bankGetSet;


public class GuardadorDeContas {
	
	private int count;
	private Object[] arr;
	
	public GuardadorDeContas() {
		this.arr = new Object[10];
		this.count=0;
	}

	public void adiciona(ContaCorrente cc) {
		this.arr[this.count]=cc;
		this.count++;
	}
	
	public void adiciona(ContaPoupança cp) {
		this.arr[this.count]=cp;
		this.count++;
	}

//	public Conta getReference(int i) {
//		return (Conta)this.arr[i];
//	}
	
	public Object getReference(int i) {
		return this.arr[i];
	}
	
	

}
