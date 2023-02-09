package testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class testScanner {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("contas.csv"), "UTF-8");
		
		while(scan.hasNext()) {
			String linha = scan.nextLine();
			
			Scanner formatador = new Scanner(linha);
			formatador.useLocale(Locale.US);
			formatador.useDelimiter(",");
			//System.out.println(linha);
			
			String tipoConta = formatador.next();
			int agencia = formatador.nextInt();
			int numeroDaConta = formatador.nextInt();
			String titulo = formatador.next();
			double saldo = formatador.nextDouble();
			
			//String strformatada= String.format(%s - %03d , %03d: titular-%s, saldo- %08.2f %n", tipoConta, agencia, numeroDaConta, titulo, saldo);
			
			System.out.format(new Locale("en"),"%s - %03d , %03d: titular-%s, saldo- %08.2f %n", tipoConta, agencia, numeroDaConta, titulo, saldo);

		}
		
		scan.close();
	}

}
