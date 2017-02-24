package br.com.valemobi.BO;

import br.com.valemobi.DAO.TipoNegocioDAO;
import br.com.valemobi.beans.TipoNegocio;

public class TipoNegocioBO {
	
	public TipoNegocio buscarPorId(int id) throws Exception {
		return new TipoNegocioDAO().buscarPorId(id);
	}

}
