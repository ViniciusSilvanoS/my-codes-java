package POO;

public abstract class P1Veiculo {

	private double velocidade;
	private int aro;
	private int assento;
	private double peso;
	
	public void acelerar() {
		
	}
	
	public void freiar() {
		
	}
	
	//// ----------------------------------------------------
	
	public double getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getAro() {
		return aro;
	}
	
	public void setAro(int aro) {
		this.aro = aro;
	}
	
	public int getAssento() {
		return assento;
	}

	public void setAssento(int assento) {
		this.assento = assento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "P1Veiculo [velocidade=" + velocidade + ", aro=" + aro + ", assento=" + assento + ", peso=" + peso + "]";
	}

	
	
	
	
	
	
	
}
