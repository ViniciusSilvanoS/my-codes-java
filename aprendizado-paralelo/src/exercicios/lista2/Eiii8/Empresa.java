package exercicios.lista2.Eiii8;

public class Empresa {

	private String nome;
	private Departamento[] departamentos = new Departamento[10];
	
	
	public Empresa(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Departamento[] getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}
	
	
	
}
