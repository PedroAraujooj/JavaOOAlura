package testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerialização {
	
	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		
//		String nome ="Pedro";
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		//--------------------------------------------------------//
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomer = (String) ois.readObject();
		
		System.out.println(nomer);
		
	}

}

