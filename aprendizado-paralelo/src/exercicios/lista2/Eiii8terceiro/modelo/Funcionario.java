package exercicios.lista2.Eiii8terceiro.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicios.lista2.Eiii8terceiro.utils.Utils;

//import javax.swing.JOptionPane;
//
//import exercicios.lista2.Eiii8terceiro.Aplicacao;
//import exercicios.lista2.Eiii8terceiro.utils.Utils;

public class Funcionario {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private static int count = 1; // ARRUMAR, VINCULAR O ID A EMPRESA, NO CASO ********************

	private final int id;
	private String nome;
	private Double salario;
	private String cpf;
	private Date dataAdmissao;
	private Date dataDesligamento;
	private Departamento departamento;
	private Empresa empresa;
	
	private static List<Funcionario> funcionariosTotal = new ArrayList<>(); // Mantém guardado todos usuários cadastrados

	
	public Funcionario(String nome, Double salario, String cpf, Empresa empresa , String dataAdmissao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.empresa = empresa;
		
		setDataAdmissao(dataAdmissao);
		
		this.id = count;
		count++;
		
		funcionariosTotal.add(this);
		empresa.adicionarFuncionarioSemDep(this);
	}
	
	
	public Funcionario(String nome, Double salario, String cpf, Empresa empresa , String dataAdmissao, Departamento departamento) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.empresa = empresa;
		this.departamento = departamento;
		
		setDataAdmissao(dataAdmissao);
		
		this.id = count;
		count++;
		
		funcionariosTotal.add(this);
	}
	
	
	//// ----------------------------------------------------
	
	
	Funcionario procurarFuncionario(String cpf){
				
		return funcionariosTotal.stream()
				.filter(e -> e.cpf.equals(cpf))
				.findFirst()
				.orElse(null);
		
	}
	
	
//	Funcionario procurarFuncionarioSemDep(String cpf){
//		
//		return funcionariosSemDep.stream()
//				.filter(e -> e.cpf.equals(cpf))
//				.findFirst()
//				.orElse(null);
//		
//	}
	
	
	void addDepartamento() {
		
	}
	
	
//	void adicionarFuncionarioAoDepartamento(String cpf, int referencia) {
//		
//		Funcionario funcionario;
//		funcionario = procurarFuncionarioSemDep(cpf);
//		if(funcionario != null) {
//			this.getEmpresa().adicionarFuncionarioAoDepartamento(funcionario, referencia);
//		}else {
//			// Procurar em todos funcionários
//			funcionario = procurarFuncionario(cpf);
//			if(funcionario != null) {
//				int escolha = JOptionPane.showConfirmDialog(null, "Funcionário já está em um departamento, deseja alterá-lo?", 
//																"Escolha", JOptionPane.YES_NO_OPTION);
//				if(escolha == 0) {
//					alterarDepartamento(cpf, referencia);
//				}else {
//					Utils.escrever("Ok. Operação cancelada!");
//				}
//			}else {
//				Utils.escrever("Funcionário não encontrado!");
//			}
//		}
//		
//	}
	
	
//	void alterarDepartamento(String cpf, int referencia) {
//		
//		Funcionario funcionario;
//		funcionario = procurarFuncionarioSemDep(cpf);
//		if(funcionario == null) {
//			
//			funcionario = procurarFuncionario(cpf);
//			
//			if(funcionario != null) {
//				
//				int escolha = JOptionPane.showConfirmDialog(null, "Deseja alterar o departamento do funcionario (" + funcionario.getNome() + ") ?" +
//						"\nDepartamento atual: " + funcionario.getDepartamento() + 
//						"\nDepartamento que irá: " + funcionario.getEmpresa().procurarDepartamento(referencia), 
//						"Escolha", JOptionPane.YES_NO_OPTION);
//				
//				if(escolha == 0) {
//					
//					Departamento departamento = funcionario.getEmpresa().procurarDepartamento(referencia);
//					if(departamento != null) {
////						funcionario.getDepartamento().alterarFuncionarioDep(this);
////						funcionario.getDepartamento().alterarFuncionarioDep(this);
//						funcionario.setDepartamento(departamento); // Tirar ele do departamento antigo e colocar no novo lá na classe DEPARTAMENTO			
//					}else {
//						Utils.escrever("Departamento não encontrado!");
//					}
//					
//				}else {
//					Utils.escrever("Operação cancelada!");
//				}
//				
//			}else {
//				Utils.escrever("Funcionário não encontrado!");
//			}
//			
//		}else {
//			int escolha = JOptionPane.showConfirmDialog(null, "Funcionário ainda não possui departamento\n" +
//															"Deseja inserilo no departamento informado?", 
//															"Escolha", JOptionPane.YES_NO_OPTION);
//			if(escolha == 0) {
//				adicionarFuncionarioAoDepartamento(cpf, referencia);
//			}
//		}
//		
//
//		
//	}
	
	
	void alterarAEmpresa() { // DEPENDE DE EMPRESA
		
	}
	
	
//	public static void listarFuncionariosSemDep() {
//		for (Funcionario funcionario : funcionariosSemDep) {
//			System.out.println(funcionario.toString());
//		}
//	}
	
	
	//// ----------------------------------------------------
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getDataAdmissao() {
		return sdf.format(dataAdmissao);
	}

	public void setDataAdmissao(String dataAdmissao) { // TRATAR O ERRO DESSE MÉTODO RETORNANDO A REPONSABILIDADE PARA O LUGAR QUE CHAMOU
														// TRATAR ELE NA CLASSE APLICACAO
		try {
			this.dataAdmissao = sdf.parse(dataAdmissao);
		} catch (ParseException e) {
			Utils.escrever("Data inválida!");
			System.out.println("LOG: Formato de data inválido");
			e.printStackTrace();
			// REDIRECIONAR PARA O LUGAR DE CADASTRO CASO ESTEJA ERRADO O FORMADO DE DATA
//			System.out.println(sdf.format(minhaDataEmDate)); Vai ficar assim no toString
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Empresa getEmpresa() {
		return empresa;
	}
	
	public int getId() {
		return id;
	}

	public Date getDataDesligamento() {
		return dataDesligamento;
	}


	public void setDataDesligamento(String dataDesligamento) {// TRATAR O ERRO DESSE MÉTODO RETORNANDO A REPONSABILIDADE PARA O LUGAR QUE CHAMOU
															// TRATAR ELE NA CLASSE APLICACAO
		try {
			this.dataDesligamento = sdf.parse(dataDesligamento);
		} catch (ParseException e) {
			Utils.escrever("Data inválida!");
			System.out.println("LOG: Formato de data inválido");
			e.printStackTrace();
			// REDIRECIONAR PARA O LUGAR DE CADASTRO CASO ESTEJA ERRADO O FORMADO DE DATA
//			System.out.println(sdf.format(minhaDataEmDate)); Vai ficar assim no toString
		}
	}


	@Override
	public String toString() { // Escreve com o id geral
		return "Id:" + id + " | Nome: " + nome + " | Salario: " + salario + " | CPF: " + cpf + " | Data Admissão: "
				+ this.getDataAdmissao() + " | Departamento: " + departamento + " | Empresa: " + empresa + "\n";
	}

	public String listarFuncionariosSemIdGeral() {
		return "Nome: " + nome + " | Salario: " + salario + " | CPF: " + cpf + " | Data Admissão: "
				+ this.getDataAdmissao() + " | Departamento: " + departamento + " | Empresa: " + empresa + "\n";
	}
		
}
