package oo.heranca.desafio_encapsulamento;

import oo.heranca.desafio.P6Carro;
import oo.heranca.desafio.P6Civic;
import oo.heranca.desafio.P6GTR;

public class P6Sistema {

	// Colocar condicional, pra só ligar o ar e o turbo se tiver ligado o carro
	public static void main(String[] args) {
		
		P6Carro c1 = new P6Civic();
		P6GTR c2 = new P6GTR(400);
		
		c1.ligar();
		c2.ligar();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("-------------------------------------------");
		
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println(c2.velocidadeDoAr());
		
		c1.acelerar();
		c2.acelerar();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("-------------------------------------------");
		
		c1.frear();
		c2.frear();
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		c1.statusIgnicao();
		c1.desligar();
		c1.statusIgnicao();
		
	}
	
}
