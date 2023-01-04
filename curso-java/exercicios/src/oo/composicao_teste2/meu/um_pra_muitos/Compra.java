package oo.composicao_teste2.meu.um_pra_muitos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private String cliente;
	private List<Item> itens = new ArrayList<>();
	
	
	
	// ----------------------
	
	// Faz um relação bidirecional entre a compra e o item, desta forma, quando for pesquisar um item por código de barra, por exemplo, vai ligar a está compra
	void addItem(String nome, int quantidade, double preco) {
		this.addItem(new Item(nome, quantidade, preco));
	}
	
	void addItem(Item item) {
		this.itens.add(item);
		item.setCompra(this);
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += (item.getPreco() * item.getQuantidade());
		}
		
		
		return total;
	}
	
	public String toStringItens() {
		String mensagem = "";
		for(Item item: itens) {
			mensagem += item.toString();
		}
		return mensagem;
	}
	
	// ----------------------
	
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItens() {
		return itens;
	}
	
	
	
	
	
}
