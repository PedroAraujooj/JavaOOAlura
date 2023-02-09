package testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("texto.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br =new BufferedReader(isr);
		
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
			}
		br.close();
		
		
	}
}
