package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestReadWitre {
	public static void main(String[] args) throws IOException {
		
		InputStream fis = System.in;//new FileInputStream("texto.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UFT-8");
		BufferedReader br =new BufferedReader(isr);
		
		OutputStream fos = System.out; //new FileOutputStream("texto2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw =new BufferedWriter(osw);
		
		String line = br.readLine();
		
		while(line != null && !line.isEmpty()) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
			
			}
		br.close();
		bw.close();
		
		
	}
}
