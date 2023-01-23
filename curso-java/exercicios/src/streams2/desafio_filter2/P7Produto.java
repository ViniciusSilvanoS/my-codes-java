package streams2.desafio_filter2;

public class P7Produto {

	private String nome;
	private int desconto;
	private double frete;
	
	public P7Produto(String nome, int desconto, double frete) {
		super();
		this.nome = nome;
		this.desconto = desconto;
		this.frete = frete;
	}

	//// ----------------------------------------------------
	
	
	
	public int getDesconto() {
		return desconto;
	}

	public String getNome() {
		return nome;
	}

	public double getFrete() {
		return frete;
	}
	
}
