package streams2;

import java.util.Objects;

public class P8Aluno {

	private String nome;
	private double nota;
	private boolean bomComportamento;
	
	
	public P8Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	public P8Aluno(String nome, double nota, boolean bomComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	
	//// ----------------------------------------------------
	
	public String getNome() {
		return nome;
	}
	
	public double getNota() {
		return nota;
	}
	
	public boolean isBomComportamento() {
		return bomComportamento;
	}
	
	@Override
	public String toString() {
		return nome + " tem nota " + nota;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(bomComportamento, nome, nota);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		P8Aluno other = (P8Aluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	
}
