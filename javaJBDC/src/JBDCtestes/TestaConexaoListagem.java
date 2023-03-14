package JBDCtestes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JBDCfactorys.ConnectionFactory;
import JBDCfactorys.ConnectionFactoryPool;

public class TestaConexaoListagem {

	public static void main(String[] args) throws SQLException {
		
		//ConnectionFactory cf = new ConnectionFactory();
		ConnectionFactoryPool cf = new ConnectionFactoryPool();
		
		Connection con  = cf.criarConexao();
		
		
		PreparedStatement sta = con.prepareStatement("SELECT * FROM PRODUTO;");
		
		boolean execute = sta.execute();
	
		
		ResultSet resultSet = sta.getResultSet();
		
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			System.out.print(id + " ");
			String nome = resultSet.getString("nome");
			System.out.print(nome + " ");
			String descricao = resultSet.getString("descricao");
			System.out.println(descricao);
		}
		System.out.println("closando");
		con.close();
	}

}
