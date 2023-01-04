package oo.composicao_teste2.meu.um_pra_muitos;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.setCliente("João Pedro");
		c1.addItem("Caneta", 20, 7.45);
		c1.addItem("Borracha", 12, 3.89);
		c1.addItem("Caderno", 3, 18.79);
		
//		Compra c2 = new Compra();
		
		
		System.out.println(c1.toStringItens());
		
		System.out.println("Preço total: " + c1.getValorTotal());
		
		System.out.println(c1.getItens().get(1));
		System.out.println(c1.getItens().get(0).getCompra().getCliente()); // Testando relação bidirecional
		
	}
	
}
