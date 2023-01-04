package exercicios.lista2.Eiii8;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	
	
	public Departamento(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
	
}
