package youtube.gustavo_guanabara.poo09Livro;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo; // colocar toUpperCase
	
	public void fazAniversario() {
		this.idade++;
	}
	
	public String detalhaPessoa() {
		return "Nome: " + nome + 
				"\nIdade: " + idade + 
				"\nSexo: " + sexo + "\n";
	}

	public Pessoa(String nome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		setSexo(sexo);
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		
		String aux = Character.toString(sexo);
		
		aux = aux.toUpperCase();
		sexo = aux.charAt(0);
		
		this.sexo = sexo;
		
	}
	
	
}
