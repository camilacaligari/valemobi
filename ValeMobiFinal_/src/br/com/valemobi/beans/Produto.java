package br.com.valemobi.beans;

public class Produto {
		
		private int id;
		private int codigoProduto;
		private String nome;
		private int quantidade;
		private double preco;
		private TipoNegocio tipoNegocio;
		private TipoMercadoria tipoMercadoria;
		
	
		public Produto() {
		}
		
		public Produto(int id, int codigoProduto, String nome, int quantidade, double preco, TipoNegocio tipoNegocio,
				TipoMercadoria tipoMercadoria) {
			super();
			this.id = id;
			this.codigoProduto = codigoProduto;
			this.nome = nome;
			this.quantidade = quantidade;
			this.preco = preco;
			this.tipoNegocio = tipoNegocio;
			this.tipoMercadoria = tipoMercadoria;
		}
		
		public Produto(int codigoProduto, String nome, int quantidade, double preco, TipoNegocio tipoNegocio,
				TipoMercadoria tipoMercadoria) {
			super();
			this.codigoProduto = codigoProduto;
			this.nome = nome;
			this.quantidade = quantidade;
			this.preco = preco;
			this.tipoNegocio = tipoNegocio;
			this.tipoMercadoria = tipoMercadoria;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getCodigoProduto() {
			return codigoProduto;
		}

		public void setCodigoProduto(int codigoProduto) {
			this.codigoProduto = codigoProduto;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public TipoNegocio getTipoNegocio() {
			return tipoNegocio;
		}

		public void setTipoNegocio(TipoNegocio tipoNegocio) {
			this.tipoNegocio = tipoNegocio;
		}

		public TipoMercadoria getTipoMercadoria() {
			return tipoMercadoria;
		}

		public void setTipoMercadoria(TipoMercadoria tipoMercadoria) {
			this.tipoMercadoria = tipoMercadoria;
		}

	}
