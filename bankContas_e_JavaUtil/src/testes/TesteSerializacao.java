package testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bankGetSet.Cliente;
import bankGetSet.ContaCorrente;
import bankGetSet.ContaPoupança;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		ContaCorrente cc = new ContaCorrente(22, 22);
//		cc.setCliente(new Cliente());
//		cc.getCliente().setNome("Pedro");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conta.bin"));
//		oos.writeObject(cc);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("conta.bin"));
		ContaCorrente cc1 = (ContaCorrente)ois.readObject();
		System.out.println(cc1.getCliente().getNome());

	}

}
