package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana para saber o valor respectivo: ");
		String dia = scanner.next();
		
		System.out.println("Dia: " + dia);
		if(dia == "domingo") {
			System.out.println("1");
		}else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}else if(dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")){
			System.out.println("3");
		}else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		}else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		}else if(dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("sesta")) {
			System.out.println("6");
		}else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
			System.out.println("7");
		}else {
			System.out.println("Este dia da semana não existe");
		}
		
		
		
		scanner.close();
		System.out.println("\n\nEncerrando!!!");
		
	}
	
	
}
