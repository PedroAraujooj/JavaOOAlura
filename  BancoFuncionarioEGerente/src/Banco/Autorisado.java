package Banco;

public abstract interface Autorisado {
	

	public abstract void setSenha(int senha); // o fato de todas os metodos serem abstratos força as classes a os
												// implementarem

	public abstract int getSenha();

	public abstract boolean autentica(int senha);
}
