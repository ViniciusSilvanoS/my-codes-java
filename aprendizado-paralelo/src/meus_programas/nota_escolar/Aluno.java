package meus_programas.nota_escolar;

public class Aluno {

	private String nome;
	private int idade;
	private Genero genero;
	private int nota;
	
	public Aluno(String nome, int idade, Genero genero, int nota) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public int getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + 
				" | Idade: " + idade + 
				" | Genero: " + genero + 
				" | Nota: " + nota;
	}
	
}
