package youtube.gustavo_guanabara.poo07RelacionamentoEntreClasses;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	
	
	
	// ------------------------------------------
	
	public String apresentar(){
		return "Nome: " + nome + 
				"\nNacionalidade: " + nacionalidade + 
				"\nIdade: " + idade +
				"\nAltura: " + altura +
				"\nPeso: " + peso +
				"\nCategoria: " + categoria +
				"\nVitórias: " + vitorias + " | Derrotas: " + derrotas + " | Empates: " + empates + "\n";
	}
	
	public String status() {
		String txt = "";
		txt = getNome() + ", " + 
		"Peso " + getCategoria() + ", " +
		getVitorias() + " vitórias, " + 
		getDerrotas() + " derrotas, " +
		getEmpates() + " empates, ";
		
		return txt;
	}
	
	public void ganharLuta() {
		this.vitorias++;
	}
	
	public void perderLuta() {
		this.derrotas++;
	}
	
	public void empatarLuta() {
		this.empates++;
	}
	
	
	// ------------------------------------------
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria(peso);
	}
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(double peso) {
		if(peso < 70) {
			this.categoria = "pena";
		}else if(peso < 80) {
			this.categoria = "leve";
		}else if(peso < 100) {
			this.categoria = "medio";
		}else if(peso >= 100) {
			this.categoria = "pesado";
		}
	}

	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	
}
