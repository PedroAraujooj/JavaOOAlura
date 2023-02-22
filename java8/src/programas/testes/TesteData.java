package programas.testes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TesteData {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalDate data =LocalDate.of(2099, 1, 25);
		System.out.println(data);
		
		System.out.println(data.compareTo(hoje));
		
		Period periodo = Period.between(hoje, data);
		
		System.out.println(periodo);
	}

}
