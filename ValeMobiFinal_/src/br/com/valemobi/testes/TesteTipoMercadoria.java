package br.com.valemobi.testes;

import br.com.valemobi.BO.TipoMercadoriaBO;
import br.com.valemobi.DAO.TipoMercadoriaDAO;
import br.com.valemobi.beans.TipoMercadoria;

public class TesteTipoMercadoria {

	public static void main(String[] args) {

		TipoMercadoriaDAO dao = new TipoMercadoriaDAO();
		
		try {
			TipoMercadoria tm = dao.buscarPorId(6);
			System.out.println("ID: " +tm.getId());
			System.out.println("Nome: " + tm.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
