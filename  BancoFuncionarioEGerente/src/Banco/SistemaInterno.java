package Banco;

public class SistemaInterno {
	
	 private int resposta=1212;
	 
	 public boolean autentica(Autorisado FA) {
			if(FA.autentica(resposta)) {
				 System.out.println("acesso permitido");
				 return true;
			 }
			 else {
				 System.out.println("acesso negado");
				 return false;
			}
		 
	 }
	 
	 
	 
}
