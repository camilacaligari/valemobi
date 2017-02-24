package br.com.valemobi.BO;

import br.com.valemobi.DAO.TipoMercadoriaDAO;
import br.com.valemobi.beans.TipoMercadoria;

public class TipoMercadoriaBO {

	public TipoMercadoria buscarPorId(int id) throws Exception {
		return new TipoMercadoriaDAO().buscarPorId(id);
	}

}
