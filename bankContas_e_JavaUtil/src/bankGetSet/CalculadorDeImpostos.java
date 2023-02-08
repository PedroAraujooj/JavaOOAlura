package bankGetSet;

public class CalculadorDeImpostos {
	double total;
	
	public void setRegistra(Tributavel tributavel) {
		total+= tributavel.getTributo();
	}
	public double getRegistra() {
		return total;
	}
}
