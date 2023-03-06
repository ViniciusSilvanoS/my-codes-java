package youtube.robotec.heranca;

public class ExemploHeranca {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("David", "123", 5);
		a1.imprime();
		
		System.out.println();
		Professor p1 = new Professor("Julio", "987", 3920.30);
		p1.imprime();
		
		System.out.println();
		Pessoa pe1 = new Pessoa("Rafaela", "654");
		pe1.imprime();
		
	}
	
}
