package JBDCtestes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JBDCfactorys.ConnectionFactory;

public class testInsertComParametro {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory();
		try (Connection con = cf.criarConexao()) {
			con.setAutoCommit(false);

			try (PreparedStatement ps = con.prepareStatement("INSERT INTO PRODUTO(nome, descricao) VALUES (?, ?);",
					Statement.RETURN_GENERATED_KEYS)) {

				setParametros("bola", "de futebol", ps);
				setParametros("luva", "de goleiro", ps);

				con.commit();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK executado");
				con.rollback();
			}

		}

	}

	private static void setParametros(String str1, String str2, PreparedStatement ps) throws SQLException {
		ps.setString(1, str1);

		ps.setString(2, str2);

		ps.execute();

		try (ResultSet gk = ps.getGeneratedKeys()) {

			while (gk.next()) {
				System.out.println("o ID eh: " + gk.getInt(1));
			}

		}

	}

}
