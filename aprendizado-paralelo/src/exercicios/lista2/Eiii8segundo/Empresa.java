package exercicios.lista2.Eiii8segundo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nome;
	private String cnpj;
	private List<Departamento> departamentos;
	private Log logger;



	public Empresa(String nome, String cnpj) {
		super();
		setNome(nome);
		setCnpj(cnpj);
		
		logger = new Log();
	}

	public Empresa(String nome, String cnpj, List<Departamento> departamentos) {
		this(nome, cnpj);
		
		departamentos = new ArrayList<>();
		addConjuntoDeDep(departamentos);
	}

	// -----------------------
	
	public void addConjuntoDeDep(List<Departamento> departamentos) {
		
		if(this.departamentos == null) {
			this.departamentos.addAll(departamentos);
			
		}else {
			if((this.departamentos.size() + departamentos.size()) <= 10) {
				this.departamentos.addAll(departamentos);
			}else {
				logger.out("Erro! O limite de departamentos irá ultrapassar.");
			}
			
		}
		
	}
	
	public void addDep(Departamento departamentos) {
		
		if(this.departamentos == null) {
			this.departamentos.add(departamentos);
			
		}else {
			if(this.departamentos.size() < 10) {
				this.departamentos.add(departamentos);
			}else {
				logger.out("Erro! O limite de departamentos irá ultrapassar.");
			}
			
		}
		
	}

	
	public void imprime() {
		
	}
	
	// -----------------------
	
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

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamento departamentos) {
		if(this.departamentos.size() < 10) {
			this.departamentos.add(departamentos);
		}else {
			logger.out("Erro! O limite de departamentos irá ultrapassar.");
		}
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", departamentos=" + departamentos;
	}
	
	
	
	
	
}
