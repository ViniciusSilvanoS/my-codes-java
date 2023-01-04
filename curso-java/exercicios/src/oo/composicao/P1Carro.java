package oo.composicao;

public class P1Carro {

	final P1Motor motor;
	
	P1Carro(){
		this.motor = new P1Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5){
			motor.fatorInjecao -= 0.4;
		
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	
	
}
