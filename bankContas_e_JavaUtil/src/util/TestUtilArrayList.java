package util;

import java.util.ArrayList;

import bankGetSet.Conta;
import bankGetSet.ContaCorrente;
import bankGetSet.ContaPoupança;

public class TestUtilArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> list = new ArrayList<Conta>();
		
		ContaCorrente cc = new ContaCorrente(11, 11, 11);
		
		list.add(cc);
		
		ContaPoupança cp = new ContaPoupança(22, 22);
		
		list.add(cp);
		
		System.out.println("o tamanho eh: "+ list.size());
		
		Conta ref = list.get(1);
		ref.deposita(100);
		System.out.println(ref.getSaldo());
		
		for(Conta c : list) {
			System.out.println((c));
		}
		
		ContaCorrente cp1 = new ContaCorrente(22,22,22);
		
		boolean bool = list.contains(cp1);
		System.out.println(bool); // reescrevi o metodo equals na class conta

	}

}
