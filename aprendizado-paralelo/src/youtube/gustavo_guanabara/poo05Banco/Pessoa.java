package youtube.gustavo_guanabara.poo05Banco;

public class Pessoa {

	private String nome;
	private int idade;
	private Banco conta;
	
	
	public Pessoa(String nome, int idade, Banco conta) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.conta = conta;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Banco getConta() {
		return conta;
	}
	public void setConta(Banco conta) {
		this.conta = conta;
	}
	
	
	
}
