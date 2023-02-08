package bankGetSet;

public class SeguroDeVida implements Tributavel{
	
	private MetodosTributos metodo;
	
	public SeguroDeVida() {
		metodo= new MetodosTributos();
	}

	@Override
	public void setTributo(double tributo) {
		metodo.setTributo(tributo);
	}

	@Override
	public double getTributo() {
		return	metodo.getTributo();
	}

	

}
