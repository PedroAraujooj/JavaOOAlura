package Banco;


/**
 * 
 * @author PedroAraujooj
 *
 */

public abstract class Funcionario {
	
	private String name;
	private long cpf;
	private double salary;
	
	public void setCpf (long cpf){
		if(cpf<=9999999999l || cpf>=100000000000l) {
			System.out.println("wrong number, you must use a cpf with 11 numbers ");
			return;
		}
		this.cpf=cpf;
	}
	
	/**
	 * 
	 * 
	 * @return cpf
	 */
	public long getCpf() {
		return this.cpf;
	}

	public String getName() {
		return this.name;
	}
	
	/**
	 * @return this.name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public abstract double getBonificacao();

}
