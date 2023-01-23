package excecao.personalizadaA;

import java.util.Objects;

public class P3Aluno {

	public final String nome;
	public final double nota;
	public final boolean bomComportamento;
	
	public P3Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	public P3Aluno(String nome, double nota, boolean bomComportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}

	@Override
	public String toString() {
		return "P3Aluno [nome=" + nome + ", nota=" + nota + ", bomComportamento=" + bomComportamento + "]";
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
		P3Aluno other = (P3Aluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
	
	
	
	
	
	
}
