package exercicios.lista2.Eiii8segundo;

public class Funcionario {

	private String nome;
	private double salario;
	private int dataAdmissao;
	
	public Funcionario(String nome, double salario, int dataAdmissao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(int dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	
	
}
