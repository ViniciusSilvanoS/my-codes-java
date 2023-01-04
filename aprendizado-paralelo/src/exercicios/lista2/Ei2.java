package exercicios.lista2;

public class Ei2 {
	
	public static void main(String[] args) {

		System.out.println("Os números que se encaixão na regra são: ");
		
		String cheio;
		int cont = 0;
		
		for(int i = 1001; i < 9999;i++) {
			cheio = Integer.toString(i);
			int cheioInt = Integer.parseInt(cheio);
			int part1 = Integer.parseInt(cheio.substring(0, 2));
			int part2 = Integer.parseInt(cheio.substring(2, 4));
			
			if(cheioInt == Math.pow(part1 + part2, 2)) {
				cont++;
				System.out.println(cont + "º: " + cheioInt);
			}
		}
		
	}
	
}

/*
	Observe a seguinte propriedade que alguns números maiores que 1000 e menores que 9999 possuem:
	
	Número: abcd
	(ab) + (cd) = (ef)
	(ef)² = abcd
	
	Exemplo: 3025
	30+25 = 55
	55² = 3025
	
	Faça um programa que imprima todos os números que satisfaçam esta propriedade.
*/
