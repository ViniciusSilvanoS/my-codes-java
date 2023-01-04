package desafios.lambdas;

public class P10Produto {

	final String nome;
	final double preco;
	final double desconto;
	
	public P10Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço R$" + precoFinal;
	}
	
}
