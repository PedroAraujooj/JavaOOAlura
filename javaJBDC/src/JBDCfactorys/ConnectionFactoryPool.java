package JBDCfactorys;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactoryPool {
	
	public DataSource ds;
	public ConnectionFactoryPool() {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		cpds.setUser("root");
		cpds.setPassword("258348");
		
		this.ds = cpds;
	}
	
	public Connection criarConexao() throws SQLException{
		//return DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "258348");
		return this.ds.getConnection();
	}

}
