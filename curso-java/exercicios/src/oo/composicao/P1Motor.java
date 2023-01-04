package oo.composicao;

public class P1Motor {

	final P1Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;
	
	P1Motor (P1Carro carro){
		this.carro = carro;
	}
	
	
	int giros() {
		if(!ligado){
			return 0;
			
		}else {
			return (int) Math.round(fatorInjecao * 3000);
			
		}
	}
	
	
}
