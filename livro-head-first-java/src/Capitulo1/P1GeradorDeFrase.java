package Capitulo1;

public class P1GeradorDeFrase {

	public static void main(String[] args) {
		
		String[] listaDePalavras1 = { "Olá", "Tudo bem", "Oi", "Bem vindo"};

		String[] listaDePalavras2 = { "Mariana", "Roberto", "Julia", "Diego", "Cidcley", "Vanessa", "Vinícius"};

		String[] listaDePalavras3 = { "como vai?", "tudo certo?", "você está bem?", "prazer!"};
		
		// find out how many words are in each list
	    int primeiroTamanho = listaDePalavras1.length;
	    int segundoTamanho = listaDePalavras2.length;
	    int terceiroTamanho = listaDePalavras3.length;
	    
	    // generate three random numbers
	    java.util.Random randomGenerator = new java.util.Random();
	    int rand1 = randomGenerator.nextInt(primeiroTamanho);
	    int rand2 = randomGenerator.nextInt(segundoTamanho);
	    int rand3 = randomGenerator.nextInt(terceiroTamanho);
	    
	    // now build a phrase
	    String phrase = listaDePalavras1[rand1] + " " +
	    		listaDePalavras2[rand2] + ", " + listaDePalavras3[rand3];
	    
	    // print out the phrase
	    System.out.println("A frese aleatória é: \n\n" + phrase);
		
	}
	
}
