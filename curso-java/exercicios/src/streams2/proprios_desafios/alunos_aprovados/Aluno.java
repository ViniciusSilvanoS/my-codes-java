package streams2.proprios_desafios.alunos_aprovados;

public class Aluno {

	private String nome;
	private int nota;
	
	public Aluno(String nome, int nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
	//// ----------------------------------------------------
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	

	
}
