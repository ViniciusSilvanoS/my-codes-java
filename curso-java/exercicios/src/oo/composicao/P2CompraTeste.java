package oo.composicao;

public class P2CompraTeste {

	public static void main(String[] args) {
		
		P2Compra compra1 = new P2Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem(new P2Item("Caderno", 3, 18.79));
		
		System.out.println("Quantidade de items: " + compra1.itens.size());
		System.out.println("Valor total da compra: R$" + compra1.obterValorTotal());
		
		// Só para mostrar a relação bidirecional!!!
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("Total com bidirecional: R$" + total);
		
		System.out.println(compra1.cliente);
		
	}
	
	
}
