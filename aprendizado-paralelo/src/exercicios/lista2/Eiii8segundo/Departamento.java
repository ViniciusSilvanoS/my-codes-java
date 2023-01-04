package exercicios.lista2.Eiii8segundo;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nome;
	private List<Funcionario> funcionarios;
	
	
	public Departamento(String nome) {
		super();
		this.nome = nome;
	}

	public Departamento(String nome, List<Funcionario> funcionarios) {
		super();
		this.nome = nome;
		
		funcionarios = new ArrayList<>();
		this.funcionarios = funcionarios;
	}
	
	// -----------------------
	
	
	
	// -----------------------
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
