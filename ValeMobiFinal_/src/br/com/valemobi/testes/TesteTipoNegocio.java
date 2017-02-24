package br.com.valemobi.testes;

import br.com.valemobi.DAO.TipoNegocioDAO;
import br.com.valemobi.beans.TipoNegocio;

public class TesteTipoNegocio {

	public static void main(String[] args) {

		TipoNegocioDAO dao = new TipoNegocioDAO();

		try {
			TipoNegocio tn = dao.buscarPorId(6);
			System.out.println("ID: " +tn.getId());
			System.out.println("Nome: " + tn.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
