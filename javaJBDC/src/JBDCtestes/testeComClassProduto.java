package JBDCtestes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import JBDCfactorys.ConnectionFactoryPool;
import daos.ProdutoDao;
import modelos.Produto;

public class testeComClassProduto {

	public static void main(String[] args) throws SQLException {

		Produto prod = new Produto("quradro", "negro");

		try (Connection con = new ConnectionFactoryPool().criarConexao()) {
			ProdutoDao prodao = new ProdutoDao(con);
			prodao.salvar(prod);

			List<Produto> ls = prodao.listar();
			ls.forEach(prodt -> System.out.println(prodt));

		}
		System.out.println(prod);

	}

}
