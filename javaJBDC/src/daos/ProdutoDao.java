package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelos.Categoria;
import modelos.Produto;

public class ProdutoDao {
	
	private Connection con;
	
	public ProdutoDao(Connection con) {
		this.con = con;
	}
	
	public void salvar(Produto prod) throws SQLException {
		
		con.setAutoCommit(false);
		try(PreparedStatement ps = con.prepareStatement("INSERT INTO PRODUTO(nome, descricao) VALUES (?, ?);", Statement.RETURN_GENERATED_KEYS)){				
			ps.setString(1, prod.getNome() );
			ps.setString(2, prod.getDescricao() );
			ps.execute();
			
			try(ResultSet rs = ps.getGeneratedKeys()){
				while(rs.next()) {
					prod.setId(rs.getInt(1));
				}
			}
			
			con.commit();
			
			
		}
		catch (Exception e) {
			con.rollback();
		}
		
	}
	
	public List<Produto> listar() throws SQLException{
		List<Produto> ls = new ArrayList<Produto>();
		
		try(PreparedStatement ps = con.prepareStatement("select id,nome,descricao from produto;")){
			ps.execute();

			
			try(ResultSet rs = ps.getResultSet()){

				while(rs.next()) {
					Produto prod = new Produto(rs.getString(2), rs.getString(3), rs.getInt(1));
					ls.add(prod);
				}
			}
		}
		catch (Exception e) {
		}
		return ls;
		
	}

	public List<Produto> buscar(Categoria cat) throws SQLException{
		List<Produto> ls = new ArrayList<>();
		try(PreparedStatement ps = con.prepareStatement("select id,nome,descricao from produto where categoria_id = ?;")){
			ps.setInt(1, cat.getId());
			ps.execute();

			
			try(ResultSet rs = ps.getResultSet()){

				while(rs.next()) {
					Produto prod = new Produto(rs.getString(2), rs.getString(3), rs.getInt(1));
					ls.add(prod);
				}
			}
		}
		catch (Exception e) {
		}
		return ls;
	}
	

}
