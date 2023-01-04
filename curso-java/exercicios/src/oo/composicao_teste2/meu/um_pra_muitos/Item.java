package oo.composicao_teste2.meu.um_pra_muitos;

public class Item {

	private String nome;
	private int quantidade;
	private double preco;
	private Compra compra;
	
	
	public Item(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	// ----------------------

	public String toString() {
		return "Item -> nome: " + getNome() + " | Quantidade: " + getQuantidade() + " | Preço: " + getPreco() + "\n";
	}
		
	// ----------------------

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

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	
	
	
	
}
