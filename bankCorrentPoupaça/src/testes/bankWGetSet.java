package testes;

import bankGetSet.CalculadorDeImpostos;
import bankGetSet.Cliente;
import bankGetSet.Conta;
import bankGetSet.ContaCorrente;
import bankGetSet.ContaPoupança;

public class bankWGetSet {
	public static void main(String[] args) {
		Cliente andressaAraujo= new Cliente("12355");
		ContaPoupança contaDaAndressa= new ContaPoupança(123, 1234);
		
		contaDaAndressa.deposita(2000);
		System.out.println(" a agnencia e "+ contaDaAndressa.getAgencia()+ " e o numero"+
				" da conta e " + contaDaAndressa.getNumeroDaConta()+ " e o saldo e "+
				contaDaAndressa.getSaldo());
		contaDaAndressa.setCliente(andressaAraujo);
		contaDaAndressa.getCliente().setNome("Andressa da Costa Araujo");
		System.out.println(contaDaAndressa.getCliente().getNome());
		contaDaAndressa.deposita(-1);
		System.out.println(contaDaAndressa.getSaldo());
		
		ContaPoupança contaDoRobson= new ContaPoupança(12, 2234);
		System.out.println(Conta.getTotal());
		ContaPoupança contaPedro= new ContaPoupança(11,44);
		
		ContaCorrente correnteDaAndressa= new ContaCorrente(123, 1234, 12);
		correnteDaAndressa.deposita(500);
		correnteDaAndressa.setConta(contaDaAndressa);
		correnteDaAndressa.transfere(600, contaDaAndressa);
		System.out.println("acc "+ correnteDaAndressa.getConta().getSaldo()+ "acc corrente "+
		correnteDaAndressa.getSaldo());
		
		CalculadorDeImpostos calc=new CalculadorDeImpostos();
		correnteDaAndressa.setTributo(45);
		System.out.println(correnteDaAndressa.getTributo()); 
		calc.setRegistra(correnteDaAndressa);
		double jooj= calc.getRegistra();
		System.out.println(jooj);
		
		
		
				
		
	}

}
