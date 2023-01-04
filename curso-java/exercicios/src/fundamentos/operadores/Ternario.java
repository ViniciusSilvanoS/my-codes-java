package fundamentos.operadores;

//import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
		
//		System.out.print("Digite sua nota: ");
//		double media = entrada.nextDouble();
		double media = 5.0;
		String resultadoParcial = media >= 5 ? "de recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("Você está " + resultadoFinal);
		
	
		
		
//		entrada.close();
		System.out.println("\n\nEncerrando!");
	}
	
}
