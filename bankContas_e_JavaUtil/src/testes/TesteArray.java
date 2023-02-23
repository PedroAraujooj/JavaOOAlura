package testes;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.List;

import bankGetSet.Conta;
import bankGetSet.ContaCorrente;
import bankGetSet.ContaPoupança;

public class TesteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta[] contas = new Conta[5];
		
		contas[1] = new ContaCorrente(1, 2, 3);
		contas[2]= new ContaPoupança(4, 5);
		
		ContaCorrente cc = (ContaCorrente)contas[1];
		
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
			
		List<Conta> contass = new ArrayList<>();
		contass.add(cc);
		contass.add(contas[2]);
		
		
		}
	}

}
