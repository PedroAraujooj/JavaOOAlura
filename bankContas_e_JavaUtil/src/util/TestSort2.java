package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bankGetSet.Cliente;
import bankGetSet.Conta;
import bankGetSet.ContaCorrente;
import bankGetSet.ContaPoupança;

public class TestSort2 {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33, 22);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setCliente(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupança(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setCliente(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11, 22);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setCliente(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupança(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setCliente(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		lista.sort((o1, o2) -> Integer.compare(o1.getNumeroDaConta(), o2.getNumeroDaConta()));

		// lista.sort(new CompareTitular());
//		lista.sort(new Comparator<Conta>() { //classe anonima 
//
//			@Override
//			public int compare(Conta o1, Conta o2) {
//				return Integer.compare(o1.getNumeroDaConta(), o2.getNumeroDaConta());
//			}
//
//		});
		Comparator<Conta> jooj = (o1, o2) -> {
			return Integer.compare(o1.getNumeroDaConta(), o2.getNumeroDaConta());
		};
		
		
		
		
//		 Comparator<Conta> jooj = new Comparator<>() {  -------> pode ser deese jeito tbm
//
//				@Override
//				public int compare(Conta o1, Conta o2) {
//					return Integer.compare(o1.getNumeroDaConta(), o2.getNumeroDaConta());
//				}
//
//		};
//		lista.sort(jooj);
		

		// Collections.sort(lista, new CompareTitular());
		//Collections.sort(lista); // lista.sort(null) teria o mesmo efeito

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getCliente().getNome());
		}

	}
}


//class ComparereNum implements Comparator<Conta> {
//
//	@Override
//	public int compare(Conta o1, Conta o2) {
//		return Integer.compare(o1.getNumeroDaConta(), o2.getNumeroDaConta());
//	}
//
//}
//
//class CompareTitular implements Comparator<Conta> {
//
//	@Override
//	public int compare(Conta o1, Conta o2) {
//		// TODO Auto-generated method stub
//		return o1.getCliente().getNome().compareTo(o2.getCliente().getNome());
//	}
//
//}
