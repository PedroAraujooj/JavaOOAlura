package br.com.stack.test;

public class Test2 {

	public static void main(String[] args) {
		String frase = "nossa 1 e mais 2.5 talvez 3";
		int contadorInt=0;
		int contadorDou=0;
		int contadorStr=0;
		
		String[] novo = frase.split(" ");
		
		for (String string : novo) {
			int count=0;
			try {
				double d = Double.parseDouble(string);
				count++;
				contadorDou++;
			}
			catch (NumberFormatException e) {
				// TODO: handle exception
			}
			try {
				int i = Integer.parseInt(string);
				count++;
				contadorInt++;
				contadorDou--;
			}
			catch (NumberFormatException e) {
				// TODO: handle exception
			}
			finally {
				if(count == 0) {
					contadorStr++;
				}
			}
		}
		System.out.println("int"+contadorInt + "\n" + "dou"+contadorDou);
		System.out.println("str"+contadorStr);
 	}

}
