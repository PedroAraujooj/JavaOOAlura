package br.com.stack.test;

import br.com.stack.java.Conexao;

public class testeConexao {
	public static void main(String[] args) {

		//Conexao con = null;
		
		
		try(Conexao con = new Conexao()){
			con.leDados();
		} catch (IllegalStateException ex) {
			
			System.out.println("deu erro");
		}


//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//
//			System.out.println("deu erro");
//		} finally {
//			con.fecha();
//		}

	}

}
