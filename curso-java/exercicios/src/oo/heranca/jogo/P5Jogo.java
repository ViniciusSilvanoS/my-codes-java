package oo.heranca.jogo;

import oo.heranca.jogo_encapsulamento.P5Direcao;
import oo.heranca.jogo_encapsulamento.P5Heroi;
import oo.heranca.jogo_encapsulamento.P5Jogador;
import oo.heranca.jogo_encapsulamento.P5Monstro;

public class P5Jogo {

	public static void main(String[] args) {
		
		// Monstro j1 = new Monstro();
		P5Jogador mosntro = new P5Monstro();
		mosntro.x = 10;
		mosntro.y = 10;
		
		// Heroi j2 = new Heroi();
		P5Jogador heroi = new P5Heroi(10, 11);
		heroi.x = 10;
		heroi.y = 11;
	
		System.out.println("Monstro tem => " + mosntro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		mosntro.atacar(heroi);
		heroi.atacar(mosntro);
		
		mosntro.atacar(heroi);
		heroi.atacar(mosntro);
		
		mosntro.andar(P5Direcao.NORTE);
		mosntro.atacar(heroi);
		heroi.atacar(mosntro);
		
		System.out.println("Monstro tem => " + mosntro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		
	}
	
}
