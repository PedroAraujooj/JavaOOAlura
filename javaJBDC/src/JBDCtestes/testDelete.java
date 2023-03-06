package JBDCtestes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JBDCfactorys.ConnectionFactory;

public class testDelete {
	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();

		Connection con = cf.criarConexao();

		Statement sta = con.createStatement();

		boolean execute = sta.execute("DELETE FROM PRODUTO WHERE id > 2;");
		
		int i = sta.getUpdateCount();
		System.out.println(i);
		
		
	}
}
