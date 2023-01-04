package oo.composicao_teste2.meu.um_pra_um;

public class Motor {

	private boolean ligado;
	private double fatorInjecao;
	private Carro carro;
	
	Motor(){
		super();
		this.ligado = false;
		this.fatorInjecao = 1;
	}
	
	Motor(Carro carro) {
		this();
		this.carro = carro; // Relacionamento Bidirecional
	}

	int giros(){
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getFatorInjecao() {
		return fatorInjecao;
	}

	public void setFatorInjecao(double fatorInjecao) {
		this.fatorInjecao += fatorInjecao;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
	
}
