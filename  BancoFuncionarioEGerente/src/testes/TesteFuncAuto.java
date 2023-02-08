package testes;

import Banco.Administrador;
import Banco.Gerente;
import Banco.SistemaInterno;

public class TesteFuncAuto {
	public static void main(String args[]) {
		
		Gerente andressa= new Gerente();
		Administrador jorge= new Administrador();
		
		andressa.setSenha(1212);
		jorge.setSenha(5555);
		SistemaInterno SI= new SistemaInterno();
		SI.autentica(jorge);
		SI.autentica(andressa);
}

}
