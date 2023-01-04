package oo.composicao_teste2.meu.um_pra_um;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.isLigado());
		
		c1.ligar();
		System.out.println(c1.isLigado());
		
		System.out.println(c1.getMotor().giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.getMotor().giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println(c1.getMotor().giros());
		
		
	}
	
}
