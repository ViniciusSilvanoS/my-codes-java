package youtube.robson_medeiros.composicao;

public class Funcionario {

	private String nome;
	private float salario;
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		
		if(salario < 0) {
			this.salario = 0;
			
		}else {
			this.salario = salario;
		}
		
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
}
