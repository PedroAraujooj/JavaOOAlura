package Banco;

public class AdcGerente {
	
	public static void main(String[] args) {
		
		Gerente marcos= new Gerente();
		marcos.setCpf(12121212121l);
		System.out.println(marcos.getCpf());
		marcos.setSalary(5000);
		System.out.println("your salary is: "+ marcos.getSalary()+" and your add is: "+ marcos.getBonificacao());
		Programador gui= new Programador();
		gui.setSalary(5000);
		ControlBonificacao control= new ControlBonificacao();
		control.setRegistra(gui);
		control.setRegistra(marcos);
		System.out.println(control.getRegistra());
		
	}

}
