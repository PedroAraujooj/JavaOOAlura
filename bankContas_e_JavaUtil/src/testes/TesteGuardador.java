package testes;

import bankGetSet.Conta;
import bankGetSet.ContaCorrente;
import bankGetSet.ContaPoupança;
import bankGetSet.GuardadorDeContas;

public class TesteGuardador{
	
	public static void main(String[] args) {
		
		GuardadorDeContas gc = new GuardadorDeContas();
		
		ContaCorrente cc = new ContaCorrente(11, 11, 11);
		
		gc.adiciona(cc);
		
		ContaPoupança cp = new ContaPoupança(22, 22);
//		cp.deposita(100);
//		System.out.println(cp.getSaldo());
		
		gc.adiciona(cp);
		
		Conta ref = (Conta)gc.getReference(1);
		ref.deposita(100);
		System.out.println(ref.getSaldo());
		
	}
}
