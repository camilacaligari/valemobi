package br.com.valemobi.BO;

import java.util.List;

import br.com.valemobi.DAO.ProdutoDAO;
import br.com.valemobi.beans.Produto;

public class ProdutoBO {
	
	public List<Produto> listar() throws Exception {
		return new ProdutoDAO().getLista();
	}
	
	public static void inserir(Produto produto) throws Exception {
		if (new ProdutoDAO().gravar(produto) == 0) {
			System.out.println("Gravado com sucesso!");
		}
		else {
			System.out.println("Não foi possível gravar o registro.");
		}
	}
	
}
