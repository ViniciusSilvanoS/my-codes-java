package Capitulo2;

import java.util.Random;

public class P2Jogador {
	
	String nome;
	int numero;
	
	Random aleatorio = new Random();
	
	P2Jogador(){
		
	}
	
	P2Jogador(String nome) {
		this.nome = nome;
	}
	
	// Gera os números aleatórios de cada jogador
	void pegaChute(int qtdChutes) {
		this.numero = aleatorio.nextInt(qtdChutes);
	}
	

	
}
