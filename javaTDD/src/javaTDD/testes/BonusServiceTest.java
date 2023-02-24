package javaTDD.testes;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import javaTDD.classes.BonusService;
import javaTDD.classes.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
        BonusService service = new BonusService();
        //BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
        
        //assertThrows(IllegalArgumentException.class, ()-> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
        //assertEquals(BigDecimal.ZERO, bonus);
        
        try {
        	BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
        	fail();
		} catch (Exception e) {
			assertEquals("Salarios acima de 10,000 não recebem bonus", e.getMessage());
		}
    }
	
	@Test
	void bonusDeveriaSer10PorCentoParaFuncionarioComSalarioBaixo() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("5000")));

        assertEquals(BigDecimal.valueOf(500.00).setScale(2), bonus);
    }
	
	@Test
	void bonusDeveriaSer10PorCentoParaFuncionarioComSalarioDe10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(BigDecimal.valueOf(1000.00).setScale(2), bonus);
    }

}
