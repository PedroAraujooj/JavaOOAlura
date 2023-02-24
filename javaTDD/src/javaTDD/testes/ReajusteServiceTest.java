package javaTDD.testes;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import javaTDD.classes.Funcionario;
import javaTDD.classes.ReajusteService;
import javaTDD.enums.Desempenho;
import junit.framework.Assert;

public class ReajusteServiceTest {

	@Test
	public void TesteParaRendimentoBaixo() {
		ReajusteService rs = new ReajusteService();
		Funcionario f = new Funcionario("Paulo", LocalDate.now(), BigDecimal.valueOf(1000.00));
		rs.concederReajuste(f, Desempenho.BAIXO);
		Assert.assertEquals(BigDecimal.valueOf(1030.00).setScale(2), f.getSalario());
	}
	
	@Test
	public void TesteParaRendimentoBom() {
		ReajusteService rs = new ReajusteService();
		Funcionario f = new Funcionario("Paulo", LocalDate.now(), BigDecimal.valueOf(1000.00));
		rs.concederReajuste(f, Desempenho.BOM);
		Assert.assertEquals(BigDecimal.valueOf(1150.00).setScale(2), f.getSalario());
	}
	
	@Test
	public void TesteParaRendimentoOtimo() {
		ReajusteService rs = new ReajusteService();
		Funcionario f = new Funcionario("Paulo", LocalDate.now(), BigDecimal.valueOf(1000.00));
		rs.concederReajuste(f, Desempenho.OTIMO);
		Assert.assertEquals(BigDecimal.valueOf(1200.00).setScale(2), f.getSalario());
	}
	
	

}
