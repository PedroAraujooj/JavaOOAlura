package JBDCtestes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JBDCfactorys.ConnectionFactory;

public class testDelete {
	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();

		Connection con = cf.criarConexao();

		PreparedStatement sta = con.prepareStatement("DELETE FROM PRODUTO WHERE id > 8;");

		boolean execute = sta.execute();
		
		int i = sta.getUpdateCount();
		System.out.println(i);
		
		
	}
}
