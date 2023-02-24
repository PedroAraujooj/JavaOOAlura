package javaTDD.classes;

import java.math.BigDecimal;


public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1")).setScale(2);
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Salarios acima de 10,000 não recebem bonus");
		}
		return valor;
	}

}
