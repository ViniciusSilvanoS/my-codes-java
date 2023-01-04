package oo.heranca.jogo_encapsulamento;

public class P5Heroi extends P5Jogador {

	public P5Heroi(int x, int y){
		super(x, y);
	}
	
	public boolean atacar(P5Jogador oponente){
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;

	}
	
}
