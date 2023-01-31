package streams2.youtube_amigoscode_stream;

public class Pessoa {

	private final String nome;
	private final int idade;
	private final Genero genero;
	
	public Pessoa(String nome, int age, Genero genero) {
		this.nome = nome;
		this.idade = age;
		this.genero = genero;
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

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", age=" + idade + ", genero=" + genero + "]";
	}
	
	
	
}
