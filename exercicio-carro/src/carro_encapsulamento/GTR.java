package carro_encapsulamento;

public class GTR extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public GTR(){
		super(315);
	}
	
	public GTR(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void frear() {
		super.frear();
		super.frear();
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {		
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15; // Caso só o ar esteja ligado
		}
	}
	
	
}
