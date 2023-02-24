package javaTDD.testes;

import org.junit.jupiter.api.Test;

import javaTDD.classes.Calc;
import junit.framework.Assert;

public class CalcTest {
	
	@Test
	public void somaPositivos() {
		Calc calc = new Calc();
		double soma = calc.soma(3, 7);
		Assert.assertEquals(10.0, soma);
	}
}
