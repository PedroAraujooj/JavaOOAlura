package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test2 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fis = new FileOutputStream("texto2.txt");
		OutputStreamWriter isr = new OutputStreamWriter(fis);
		BufferedWriter br =new BufferedWriter(isr);
		
		br.write("ncncncvnvc");
		br.newLine();
		br.write("joojoooj");
		br.close();
		
		
	}
}
