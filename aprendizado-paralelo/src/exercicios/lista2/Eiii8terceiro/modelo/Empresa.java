package exercicios.lista2.Eiii8terceiro.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import javax.swing.JOptionPane;
//
//import exercicios.lista2.Eiii8terceiro.Aplicacao;
//import exercicios.lista2.Eiii8terceiro.utils.Utils;

public class Empresa {

	private Map<Long, Funcionario> funcionariosTotalEmpresa = new HashMap<>();
	private Map<Long, Funcionario> funcionariosSemDep = new HashMap<>();
	private Map<Long, Funcionario> funcionariosQueSairamDaEmpresa = new HashMap<>();
	
	private long countDepartamento = 1;
	private long countIdFuncionario = 1; // PRECISA ARRUMAR, VINCULAR O ID A EMPRESA, E O DEP TER ID DE ACORDO COM A EMPRESA ********************
	
	private String nome;
	private final String CNPJ;
	private List<Departamento> departamentos;
	
	
	public Empresa(String nome, String cNPJ) {
		super();
		departamentos = new ArrayList<>();
		this.nome = nome;
		CNPJ = cNPJ;
	}
	
	//// ----------------------------------------------------
	
	public void adicionarFuncionarioSemDep(Funcionario funcionario) {
		
		funcionariosSemDep.put(countIdFuncionario, funcionario);
		totalFuncionarios(funcionario);
		
	}
	
	public void totalFuncionarios(Funcionario funcionario) {
		
		funcionariosTotalEmpresa.put(countIdFuncionario, funcionario);
		countIdFuncionario++;
		
	}
	
	public Funcionario procurarFuncionario(String cpf) { // ************ ajustar a procurar por ID. Para o ID da empresa e não o geral
		
		return funcionariosTotalEmpresa.values().parallelStream()
					.filter(e -> e.getCpf().equals(cpf))
					.findFirst()
					.orElse(null);
		
	}
	
	public Funcionario procurarFuncionario(Long id) { // ************ ajustar a procurar por ID. Para o ID da empresa e não o geral
		
		return funcionariosTotalEmpresa.entrySet()
					.parallelStream()
					.filter(e -> e.getKey().equals(id))
					.findFirst()
					.map(Map.Entry::getValue)
					.orElse(null);
		
	}
	
	public Funcionario procurarFuncionarioSemDep(Long id) { // ************ ajustar a procurar por ID. Para o ID da empresa e não o geral
		
		return funcionariosSemDep.entrySet()
				.parallelStream()
				.filter(e -> e.getKey().equals(id))
				.findFirst()
				.map(Map.Entry::getValue)
				.orElse(null);
		
	}
	
	public Long procurarIdFuncionario(Funcionario funcionario) {
		
		return funcionariosTotalEmpresa.entrySet()
				.parallelStream()
				.filter(e -> e.getValue() == funcionario)
				.findFirst()
				.map(Map.Entry::getKey)
				.orElse(null);
		
	}
	
	public Departamento procurarDepartamento(int referencia) {
		
		return departamentos.parallelStream()
			.filter(e -> e.getReferencia() == referencia)
			.findFirst()
			.orElse(null);
			
	}
	
	public boolean isDepartamentoCadastrado (Departamento departamento) {
		
		return departamentos.parallelStream()
			.anyMatch(e -> e.getNome().trim().equalsIgnoreCase(departamento.getNome().trim()));
		
	}
	
	public void addDepartamento(Departamento departamento) {
		
		departamento.setReferencia(countDepartamento);
		
		departamentos.add(departamento);
		
		countDepartamento++;
		
	}
	
	
	public int quantidadeDeDep () {
		
		return departamentos.size();
		
	}
	
	
	public void tirarFuncionarioDosSemDep (Long id) {
				
		funcionariosSemDep.remove(id);
		
	}
	
	public void excluirFuncionario (Long id) {
		
		Funcionario funcionario = procurarFuncionario(id);
		funcionariosQueSairamDaEmpresa.put(id, funcionario);
		funcionariosTotalEmpresa.remove(id);
		
	}

//	public void adicionarFuncionarioAoDepartamento(Funcionario funcionario, int referencia) {
//			
//		Departamento departamento;
//		departamento = procurarDepartamento(referencia);
//		
//		boolean funcionarioNaoRepetido = false;
//		if(departamento != null && departamento.getFuncionarios().size() != 0) {
//			
//			funcionarioNaoRepetido = departamento.getFuncionarios().parallelStream()
//					.noneMatch(e -> e == funcionario);
//			
//			if(funcionarioNaoRepetido) {
//				departamento.inserirFuncionarioDep(funcionario);
//				Utils.escrever("Funcionário inserido com sucesso!");
//			}else {
//				Utils.escrever("Funcionário já está no departamento!");
//			}
//			
//		}else if(departamento == null) {
//			Utils.escrever("Departamento não existe!");			
//		}else {
//			// Adicionar o funcionário sem verificar repetidos
//			departamento.inserirFuncionarioDep(funcionario);
//			Utils.escrever("Funcionário inserido com sucesso!");
//		}
//		
//	}
	
	public void ajustarTodosSalarios() {
		
	}
	
	public String listarEmpresa() {
		return "Nome: " + nome + " | CNPJ: " + CNPJ + "\n";
	}
	
	//// ----------------------------------------------------
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", CNPJ=" + CNPJ + ", departamentos=" + departamentos + "]";
	}
	
	public StringBuilder listarFuncionariosCompletoTodos() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Long, Funcionario> f : funcionariosTotalEmpresa.entrySet()) {
			String departamento = f.getValue().getDepartamento() != null ? f.getValue().getDepartamento().getNome() : "Sem Dep.";
			sb.append("Id:" + f.getKey() + " | Nome: " + f.getValue().getNome() + " | Salario: " + f.getValue().getSalario() + 
					" | CPF: " + f.getValue().getCpf() + " | Data Admissão: "
					+ f.getValue().getDataAdmissao() + " | Departamento: " + departamento + "\n"); // 
		}
		
		return sb;

	}
	
	public StringBuilder listarFuncionariosSimplesTodos() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Long, Funcionario> f : funcionariosTotalEmpresa.entrySet()) {
			sb.append("Id: " + f.getKey() + " | Nome: " + f.getValue().getNome() + " | Departamento: " + f.getValue().getDepartamento() + "\n");
		}
		
		return sb;
		
	}
	
	public StringBuilder listarFuncionariosCompletoSemDep() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Long, Funcionario> f : funcionariosSemDep.entrySet()) {
			String departamento = f.getValue().getDepartamento() != null ? f.getValue().getDepartamento().getNome() : "Sem Dep.";
			sb.append("Id:" + f.getKey() + " | Nome: " + f.getValue().getNome() + " | Salario: " + f.getValue().getSalario() + 
					" | CPF: " + f.getValue().getCpf() + " | Data Admissão: "
					+ f.getValue().getDataAdmissao() + " | Departamento: " + departamento + "\n"); // 
		}
		
		return sb;

	}
	
	public StringBuilder listarFuncionariosSimplesSemDep() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Long, Funcionario> f : funcionariosSemDep.entrySet()) {
			sb.append("Id: " + f.getKey() + " | Nome: " + f.getValue().getNome() + " | Departamento: " + f.getValue().getDepartamento() + "\n");
		}
		
		return sb;
		
	}
	
	public StringBuilder listarDepartamentos() {
		
		StringBuilder sb = new StringBuilder();
		
		if(departamentos != null) {
			if(departamentos.size() > 0) {
				for(Departamento d: departamentos) {
					sb.append(d.getReferencia() + " - " + d.getNome() + "\n");
				}
			}else {
				sb.append("Nenhum departamento cadastrado!");	
			}
		}else {
			sb.append("Nenhum departamento cadastrado!");	
		}

		return sb;
		
	}
	
}
