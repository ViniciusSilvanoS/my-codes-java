package oo.composicao_teste2.meu.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private List<Item> itens = new ArrayList<>();
	
	
	//// ----------------------------------------------------

	void addItem(int qtd, Produto produto) {
		this.itens.add(new Item(qtd, produto));
	}
	
	void addItem(String nome, double preco, int qtd) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(qtd, produto));
	}
	
	double totalItens() {
		double totalItens = 0;
		
		for(Item item: itens) {
			totalItens += item.getProduto().getPreco() * item.getQtd();
		}
		
		return totalItens;
	}

	//// ----------------------------------------------------


	public List<Item> getItens() {
		return itens;
	}
	
	
	
	

}
