package carro;

import carro_encapsulamento.Carro;
import carro_encapsulamento.Civic;
import carro_encapsulamento.GTR;

public class Sistema {

	// Colocar condicional, pra só ligar o ar e o turbo se tiver ligado o carro
	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		GTR c2 = new GTR(400);
		
		c1.ligar();
		c2.ligar();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("-------------------------------------------");
		
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println("Velocidade do ar: " + c2.velocidadeDoAr());
		
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
