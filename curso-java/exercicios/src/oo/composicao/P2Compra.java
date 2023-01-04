package oo.composicao;

import java.util.ArrayList;

public class P2Compra {

	String cliente;
	ArrayList<P2Item> itens = new ArrayList<P2Item>();
	
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new P2Item(nome, quantidade, preco));
	}
	
	void adicionarItem(P2Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(P2Item item: itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
}
