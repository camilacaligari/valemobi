package br.com.valemobi.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.valemobi.BO.ProdutoBO;
import br.com.valemobi.BO.TipoMercadoriaBO;
import br.com.valemobi.BO.TipoNegocioBO;
import br.com.valemobi.beans.Produto;
import br.com.valemobi.beans.TipoMercadoria;
import br.com.valemobi.beans.TipoNegocio;

@WebServlet("/produtoServlet")
public class ProdutoServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Recuperando os valores do formulário
		int codigo = Integer.parseInt(req.getParameter("cd-mercadoria"));
		int tipoMercadoria = Integer.parseInt(req.getParameter("tp-mercadoria"));
		String nome = req.getParameter("nm-mercadoria");
		double preco = Double.parseDouble(req.getParameter("valor"));
		int tipoNegocio = Integer.parseInt(req.getParameter("tp-negocio"));
		int quantidade = Integer.parseInt(req.getParameter("qt-mercadoria"));

		//Buscando o objeto TipoMercadoria referenciado no cadastro para preencher o objeto TipoMercadoria
		TipoMercadoriaBO tmBO = null;
		TipoMercadoria objTm = null;

		try {
			tmBO = new TipoMercadoriaBO();
			objTm = tmBO.buscarPorId(tipoMercadoria);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		TipoMercadoria tm = new TipoMercadoria(5, objTm.getNome());

		//Buscando o objeto TipoMercadoria referenciado no cadastro para preencher o objeto TipoNegocio
		TipoNegocioBO tnBO = null;
		TipoNegocio objTn = null;

		try {
			tnBO = new TipoNegocioBO();
			objTn = tnBO.buscarPorId(tipoNegocio);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		TipoNegocio tn = new TipoNegocio(objTn.getId(), objTn.getNome());

		//Instanciando o produto
		Produto produto = new Produto();
		produto.setCodigoProduto(codigo);
		produto.setNome(nome);
		produto.setPreco(preco);
		produto.setQuantidade(quantidade);
		produto.setTipoMercadoria(tm);
		produto.setTipoNegocio(tn);

		//Persistindo os dados no banco
		try {
			ProdutoBO.inserir(produto);		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//Instanciando o BO
		ProdutoBO bo = new ProdutoBO();

		//Buscando os livros cadastrados
		List<Produto> lista = null;
		try {
			lista = bo.listar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Passando a lista para o JSP (chave)
		req.setAttribute("lista", lista);
		
		//Redirecionando para a página de cadastro
		req.getRequestDispatcher("lista.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Redirecionando para a página da lista
		req.getRequestDispatcher("index.jsp").forward(req, resp);

	}

}
