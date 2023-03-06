package JBDCtestes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JBDCfactorys.ConnectionFactory;

public class TestaConexaoParaExercicio {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory cf = new ConnectionFactory();
		
		Connection con  = cf.criarConexao();
		
		
		Statement sta = con.createStatement();
		
		boolean execute = sta.execute("SELECT * FROM PRODUTO;");
		
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
