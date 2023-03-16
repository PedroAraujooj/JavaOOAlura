package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelos.Categoria;
import modelos.Produto;

public class CategoriaDao {
	
private Connection con;
	
	public CategoriaDao(Connection con) {
		this.con = con;
	}
	
	public List<Categoria> listar() throws SQLException{
		List<Categoria> ls = new ArrayList<>();
		
		try(PreparedStatement ps = con.prepareStatement("select id,nome from categoria;")){
			ps.execute();

			
			try(ResultSet rs = ps.getResultSet()){

				while(rs.next()) {
					Categoria cat = new Categoria(rs.getInt(1), rs.getString(2));
					ls.add(cat);
				}
			}
		}
		catch (Exception e) {
		}
		return ls;
		
	}

}
