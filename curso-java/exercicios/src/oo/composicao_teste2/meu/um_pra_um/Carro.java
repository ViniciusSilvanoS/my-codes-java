package oo.composicao_teste2.meu.um_pra_um;

public class Carro {

	private Motor motor;
	Log logger;
	
	Carro(){
		logger = new Log();
		this.motor = new Motor(this); // Relacionamento Bidirecional
	}
	
	void ligar() {
		if(!motor.isLigado()) {
			motor.setLigado(true);
		}else {
			logger.out("Carro já está ligado!");
		}
	}
	
	void desligar() {
		if(motor.isLigado()) {
			if(motor.isLigado()) {
				motor.setLigado(false);
			}
		}else {
			logger.out("Carro já está desligado!");
		}

	}
	
	void acelerar() {
		if(motor.isLigado()) {
			if(motor.giros() <= 10000) {
				motor.setFatorInjecao(0.4);
			}else {
				logger.out("Velocidade máxima já foi atingida!");
			}
		}else {
			logger.out("Carro está desligado!");			
		}

	}
	
	void frear(){
		if(motor.isLigado()) {
			if(motor.getFatorInjecao() >= 0.5) {
				motor.setFatorInjecao(-0.4);
			}else {
				logger.out("Velocidade mínima atingida!");
			}
		}else {
			logger.out("Carro está desligado!");
		}
	}
	
	boolean isLigado() {
		return motor.isLigado();
	}

	public Motor getMotor() {
		return motor;
	}
	
	
}
