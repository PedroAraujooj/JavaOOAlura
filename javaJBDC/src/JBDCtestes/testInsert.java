package JBDCtestes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JBDCfactorys.ConnectionFactory;

public class testInsert {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();

		Connection con = cf.criarConexao();

		Statement sta = con.createStatement();

		boolean execute = sta.execute("INSERT INTO PRODUTO(nome, descricao) VALUES ('MOUSE', 'SEM FIO');", Statement.RETURN_GENERATED_KEYS);
		
		ResultSet gk = sta.getGeneratedKeys();
		
		while(gk.next()) {
			System.out.println("o ID eh: " + gk.getInt(1));
		}
		
		
	}

}
