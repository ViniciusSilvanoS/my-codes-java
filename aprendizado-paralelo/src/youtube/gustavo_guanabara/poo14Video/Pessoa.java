package youtube.gustavo_guanabara.poo14Video;

public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected char sexo;
	protected float experiencia;
	
	
	
	
	public Pessoa(String nome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}

	protected void ganharExp() {
		
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
		this.sexo = sexo;
	}

	public float getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + 
				"\nIdade: " + idade + 
				"\nSexo: " + sexo + 
				"\nExperiencia: " + experiencia + "\n";
	}
	
	
	
}
