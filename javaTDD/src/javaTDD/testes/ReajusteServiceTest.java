package javaTDD.testes;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javaTDD.classes.Funcionario;
import javaTDD.classes.ReajusteService;
import javaTDD.enums.Desempenho;
import junit.framework.Assert;

public class ReajusteServiceTest {

	private ReajusteService rs;
	private Funcionario f;
	
	@BeforeEach
	public void inicializa() {
		System.out.println("inicio");
		rs = new ReajusteService();
		f = new Funcionario("Paulo", LocalDate.now(), BigDecimal.valueOf(1000.00));
	}

	@AfterEach
	public void finaliza() {
		System.out.println("fim");
	}
	
	@BeforeAll
	public static void inicializaAll() {
		System.out.println("INICIO");
	}
	
	@AfterAll
	public static void finalizaAll() {
		System.out.println("FIM");
	}
	
	@Test
	public void TesteParaRendimentoBaixo() {
		rs.concederReajuste(f, Desempenho.BAIXO);
		Assert.assertEquals(BigDecimal.valueOf(1030.00).setScale(2), f.getSalario());
	}
	
	@Test
	public void TesteParaRendimentoBom() {
		rs.concederReajuste(f, Desempenho.BOM);
		Assert.assertEquals(BigDecimal.valueOf(1150.00).setScale(2), f.getSalario());
	}
	
	@Test
	public void TesteParaRendimentoOtimo() {
		rs.concederReajuste(f, Desempenho.OTIMO);
		Assert.assertEquals(BigDecimal.valueOf(1200.00).setScale(2), f.getSalario());
	}
	
	

}
