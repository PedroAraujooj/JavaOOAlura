package testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	
	public static void main(String[] args) throws  IOException, ClassNotFoundException {
		
//		Cliente c = new Cliente();
//		c.setNome("Pedro");
//		c.setProfissao("TI");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(c);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente c1 = (Cliente)ois.readObject();
		System.out.println(c1.getNome());

	}

}

