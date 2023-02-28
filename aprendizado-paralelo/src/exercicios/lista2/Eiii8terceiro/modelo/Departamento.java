package exercicios.lista2.Eiii8terceiro.modelo;

import java.util.ArrayList;
import java.util.List;

//import exercicios.lista2.Eiii8terceiro.utils.Utils;

public class Departamento {
	
	private String nome;
	private long referencia;
	private Empresa empresa;
	private List<Funcionario> funcionarios;
	
	
	public Departamento(String nome, Empresa empresa) {
		
		this.nome = nome;
		this.empresa = empresa;
		funcionarios = new ArrayList<>();
		
	}
	
	//// ----------------------------------------------------

	 public void inserirFuncionarioDep(Funcionario funcionario) {
		 
		 funcionarios.add(funcionario);
		 
	 }

	//// ----------------------------------------------------
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario funcionarios) {
		this.funcionarios.add(funcionarios);
	}
	
	public long getReferencia() {
		return referencia;
	}

	public void setReferencia(long referencia) {
		this.referencia = referencia;
	}

	@Override
	public String toString() {
		return "Departamento [nome=" + nome + ", referencia=" + referencia + ", empresa=" + empresa + ", funcionarios="
				+ funcionarios + "]";
	}
	
	
	
}
