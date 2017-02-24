package br.com.valemobi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.valemobi.beans.Produto;
import br.com.valemobi.beans.TipoMercadoria;
import br.com.valemobi.beans.TipoNegocio;
import br.com.valemobi.connection.ConnectionFactory;

public class ProdutoDAO {
	
	
	public List<Produto> getLista() throws Exception {

		Connection c           = null;
		PreparedStatement stmt = null;
		ResultSet result       = null;

		c = ConnectionFactory.getConnection();
		List<Produto> produtos = new ArrayList<Produto>();

		stmt = c.prepareStatement("SELECT P.ID_PRODUTO, "
				+ "P.CD_PRODUTO, "
				+ "P.NM_PRODUTO, "
				+ "P.QT_PRODUTO, "
				+ "P.VL_PRODUTO, "
				+ "T.NM_MERCADORIA, " 
				+ "T.ID_MERCADORIA, " 
				+ "N.NM_NEGOCIO," 	  	
				+ "N.ID_NEGOCIO FROM T_VLMB_PRODUTO P "
				+ "INNER JOIN T_VLMB_TIPO_PRODUTO T ON P.ID_MERCADORIA = T.ID_MERCADORIA "
				+ "INNER JOIN T_VLMB_TIPO_NEGOCIO N ON P.ID_MERCADORIA = N.ID_NEGOCIO");
		result = stmt.executeQuery();

		while (result.next()) {
			Produto produto = new Produto();
			produto.setId(result.getInt("ID_PRODUTO"));
			produto.setCodigoProduto(result.getInt("CD_PRODUTO"));
			produto.setNome(result.getString("NM_PRODUTO"));
			produto.setPreco(result.getDouble("VL_PRODUTO"));
			produto.setQuantidade(result.getInt("QT_PRODUTO"));
			TipoMercadoria tm = new TipoMercadoria();
			tm.setId(result.getInt("ID_MERCADORIA"));
			tm.setNome(result.getString("NM_MERCADORIA"));				
			TipoNegocio tn = new TipoNegocio();
			tn.setId(result.getInt("ID_NEGOCIO"));
			tn.setNome(result.getString("NM_NEGOCIO"));

			produto.setTipoNegocio(tn);
			produto.setTipoMercadoria(tm);

			produtos.add(produto);
		}

		result.close();
		stmt.close();
		return produtos;

	} 

	
	
	public Integer gravar(Produto produto) throws Exception {

		Connection c           = null;
		PreparedStatement stmt = null;
		
			c = ConnectionFactory.getConnection();
						
			String query = "INSERT INTO T_VLMB_PRODUTO VALUES (SEQ_PRODUTO.NEXTVAL,?,?,?,?,?,?)";
			stmt = c.prepareStatement(query);
			stmt.setInt(1, produto.getCodigoProduto());
			stmt.setString(2, produto.getNome());
			stmt.setInt(3, produto.getQuantidade());
			stmt.setDouble(4, produto.getPreco());
			stmt.setInt(5, produto.getTipoNegocio().getId());
			stmt.setInt(6, produto.getTipoMercadoria().getId());
			
			int resp = stmt.executeUpdate();
			stmt.close();

			return resp;
		
	}
	

}
