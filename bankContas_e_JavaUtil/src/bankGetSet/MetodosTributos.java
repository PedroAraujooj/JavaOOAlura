package bankGetSet;

import java.io.Serializable;

public class MetodosTributos implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private double tributo;

	public void setTributo(double tributo){
		this.tributo=tributo;		
	}
	
	public double getTributo() {
		return this.tributo;
	}

}
