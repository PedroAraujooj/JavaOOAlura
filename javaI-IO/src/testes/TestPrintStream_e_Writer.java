package testes;

import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream_e_Writer {
	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("texto3.txt");   //PrintStream é mt sememlhante ao PrintWriter, funcionaria do mesmo jeito 
		
		ps.println("ncncncvnvc");
		ps.print("joojoooj122345");
		ps.close();
		
		
	}
}
