package br.com.valemobi.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.valemobi.connection.ConnectionFactory;
import br.com.valemobi.excecoes.Excecao;


public class TesteConexao {

	public static void main(String[] args) throws Exception {

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM T_VLMB_TIPO_NEGOCIO");
			ResultSet result = stmt.executeQuery();
			
			while (result.next()) {
				System.out.println(result.getInt("ID_NEGOCIO"));
				System.out.println(result.getString("NM_NEGOCIO"));
			}
			
			result.close();
			
		} catch (Exception e) {
			new Excecao(e.getMessage(), e);
		} finally {
			con.close();
		}
	}
	
	
	

}

