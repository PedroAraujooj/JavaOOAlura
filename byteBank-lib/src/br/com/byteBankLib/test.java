package br.com.byteBankLib;

import Banco.Funcionario;
import Banco.Gerente;

public class test {
	
	public static void main(String[] args) {
		
		String nomeComEsp = "   jOoJ  ";
		String nome = nomeComEsp.trim();
		
//		String outro = nome.toUpperCase();
//		System.out.println(outro);
		
//		String outro = nome.replace('O', 'o');
//		char outro = nome.charAt(2);
//		int outro = nome.indexOf("OO");
//		String outro = nome.substring(1);
		for(int i =0; i<nome.length(); i++)
			System.out.println(nome.charAt(i));
//		System.out.println(outro);
		
		System.out.println(nome.isEmpty());
		System.out.println(nomeComEsp.isEmpty());
		System.out.println(nome.contains("oJ"));

		
		Funcionario cc = new Gerente();
		
		
		
		
	}

}
