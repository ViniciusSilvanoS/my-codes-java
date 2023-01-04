package carro_encapsulamento;

public class Carro {
	
	private final int VELOCIDADE_MAXIMA;
	protected double velocidadeAtual = 0;
	private boolean ignicao = false;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}
	
	public void statusIgnicao() {
		if(ignicao == true) {
			System.out.println("Carro está ligado");
		}else {
			System.out.println("Carro está desligado");
		}
	}
	
	public void ligar() {
		if(ignicao == false) {
			ignicao = true;
		}else {
			System.out.println("Já está ligado.");
		}
	}
	
	public void desligar() {
		if(ignicao == true) {
			ignicao = false;
		}else {
			System.out.println("Já está desligado.");
		}
	}
	
	public void acelerar() {
		if((velocidadeAtual + getDelta()) > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			if(ignicao == true) {
				this.velocidadeAtual += getDelta();
			}else {
				System.out.println("Para acelerar, ligue o carro!");
			}
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}	
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
}
