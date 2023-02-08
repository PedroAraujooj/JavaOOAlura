package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestFileWriter {
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("texto3.txt");
		BufferedWriter bw = new BufferedWriter(fw); // BufferedWriter bw = new BufferedWriter(new FileWriter("texto3.txt");
		
		bw.write("ncncncvnvc");
		bw.newLine();//fw.write(System.lineSeparator());
		bw.write("joojoooj");
		bw.close();
		
		
	}
}
