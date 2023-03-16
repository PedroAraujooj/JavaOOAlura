package JBDCtestes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import JBDCfactorys.ConnectionFactoryPool;
import daos.CategoriaDao;
import modelos.Categoria;

public class TestListarCategoria {
	public static void main(String[] args) throws SQLException {
		
		try(Connection con = new ConnectionFactoryPool().criarConexao()){
			CategoriaDao catDao = new CategoriaDao(con);
			List<Categoria> ls = catDao.listar();
			ls.forEach(cat -> System.out.println(cat));
		} 
	}

}
