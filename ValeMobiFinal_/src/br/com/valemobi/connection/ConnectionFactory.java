package br.com.valemobi.connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	
	private static Connection connection = null;

	private ConnectionFactory() {} 

	public static Connection getConnection() throws Exception {
		if (connection == null) {
			String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";	
			String DBUSER = null;	
			String DBPASS = null;
			if(url.indexOf("oracle") > 0) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} else if (url.indexOf("mysql") > 0) {
				Class.forName("com.mysql.jdbc.Driver");
			}
			connection = DriverManager.getConnection(url, DBUSER, DBPASS);
		}

		return connection;
	}
}
