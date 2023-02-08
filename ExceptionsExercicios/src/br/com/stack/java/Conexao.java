package br.com.stack.java;

public class Conexao implements AutoCloseable {
	
	public Conexao() {
		System.out.println("inicio conexao");
		//throw new IllegalStateException();	
	}
	
	public void leDados()
	{
		System.out.println("recebendo dados ");
		throw new IllegalStateException();
		
	}
	public void fecha() {
		System.out.println("fechando conexao");
	}

	@Override
	public void close()  {
		System.out.println("close");
	}
}
