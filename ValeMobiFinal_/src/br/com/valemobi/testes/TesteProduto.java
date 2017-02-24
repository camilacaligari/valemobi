package br.com.valemobi.testes;

import br.com.valemobi.BO.ProdutoBO;
import br.com.valemobi.DAO.ProdutoDAO;
import br.com.valemobi.beans.Produto;
import br.com.valemobi.beans.TipoMercadoria;
import br.com.valemobi.beans.TipoNegocio;
import br.com.valemobi.excecoes.Excecao;

public class TesteProduto {

	public static void main(String[] args) throws Excecao{

		try {
			ProdutoBO bo = new ProdutoBO();

			System.out.println("====== Produtos =======");

			for (Produto produto: bo.listar()) {
				System.out.println("Produto: " + produto.getNome() + "/" + produto.getPreco() + "\nFK: " + produto.getTipoMercadoria().getNome());
			}
		} catch (Exception e) {
			throw new Excecao(e.getMessage(), e);
		}

		Produto p = new Produto();
		p.setId(0);
		p.setCodigoProduto(2345);
		p.setNome("TesteCamilaConsole");
		p.setPreco(1300);
		p.setQuantidade(10);
		TipoNegocio tn = new TipoNegocio();
		tn.setId(5);
		tn.setNome("VENDA");
		TipoMercadoria tm = new TipoMercadoria();
		tm.setId(5);
		tm.setNome("MOBILIÁRIO");

		p.setTipoMercadoria(tm);
		p.setTipoNegocio(tn);

		try {
			ProdutoDAO dao = new ProdutoDAO();
			System.out.println(dao.gravar(p));

		} catch (Exception e) {
			throw new Excecao(e.getMessage(), e);
		}
	}


}
