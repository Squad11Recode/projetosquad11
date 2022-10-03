package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionMySQL {

	public static Connection createConnectionMySQL() throws Exception{
	
	//Carregar a classe pelo JVM
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Criar a conexão com o banco
	Connection connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/AgenciaDeViagens?user=root&password=Maori080717");
	
	return connection;
}
	public static void main (String[] args ) throws Exception{
		
		//recupera a conexão com o banco
		Connection con = createConnectionMySQL();
		
		// teste de conexão
		if (con != null) {
		System.out.println(con + "\n**** Conexão bem Sucedida****\n");
		con.close();
		}
	}
}

