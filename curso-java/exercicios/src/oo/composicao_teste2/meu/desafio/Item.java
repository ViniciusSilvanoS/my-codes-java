package oo.composicao_teste2.meu.desafio;

public class Item {

	private int qtd;
	private Produto produto;
	
	
	public Item(int qtd, Produto produto) {
		super();
		this.qtd = qtd;
		this.produto = produto;
	}
	
	public double totalProdutos() {
		double totalProdutos = 0;
		totalProdutos = this.produto.getPreco() * this.qtd;
		return totalProdutos;
	}

	//// ----------------------------------------------------
	
	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
}
