package br.com.valemobi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.valemobi.beans.TipoNegocio;
import br.com.valemobi.connection.ConnectionFactory;

public class TipoNegocioDAO {

	public TipoNegocio buscarPorId(int id) throws Exception{

		Connection c           = null;
		PreparedStatement stmt = null;
		ResultSet result       = null;

		c = ConnectionFactory.getConnection();
		stmt = c.prepareStatement("select * from T_VLMB_TIPO_NEGOCIO where ID_NEGOCIO =?");
		stmt.setInt(1,id);
		result = stmt.executeQuery();
		TipoNegocio tn = new TipoNegocio();
		while(result.next()){
			tn.setId(result.getInt("ID_NEGOCIO"));
			tn.setNome(result.getString("NM_NEGOCIO"));
		}

		return tn;
	}

}
