package br.com.valemobi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.valemobi.beans.TipoMercadoria;
import br.com.valemobi.connection.ConnectionFactory;

public class TipoMercadoriaDAO {

	public TipoMercadoria buscarPorId(int id) throws Exception{

		Connection c           = null;
		PreparedStatement stmt = null;
		ResultSet result       = null;

		c = ConnectionFactory.getConnection();
		stmt = c.prepareStatement("select * from T_VLMB_TIPO_PRODUTO where ID_MERCADORIA =?");
		stmt.setInt(1,id);
		result = stmt.executeQuery();

		TipoMercadoria tm = new TipoMercadoria();
		while(result.next()){
			tm.setId(result.getInt("ID_MERCADORIA"));
			tm.setNome(result.getString("NM_MERCADORIA"));
		}

		return tm;
	}

}
