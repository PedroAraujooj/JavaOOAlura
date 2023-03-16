package JBDCtestes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import JBDCfactorys.ConnectionFactoryPool;
import daos.CategoriaDao;
import daos.ProdutoDao;
import modelos.Categoria;
import modelos.Produto;

public class TestListarCategoria {
	public static void main(String[] args) throws SQLException {
		
		try(Connection con = new ConnectionFactoryPool().criarConexao()){
			CategoriaDao catDao = new CategoriaDao(con);
			List<Categoria> ls = catDao.listar();
			ls.forEach(cat -> {
				System.out.println(cat);
				try {
					for (Produto produto : new ProdutoDao(con).buscar(cat)) {
						System.out.println(produto);
						
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
		} 
	}

}
