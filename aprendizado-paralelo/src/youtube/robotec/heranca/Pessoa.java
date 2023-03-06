package youtube.robotec.heranca;

public class Pessoa {

	private String nome;
	private String cpf;
	
	//Contrutor
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;	
	}
	
	//Método
	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
	
}
