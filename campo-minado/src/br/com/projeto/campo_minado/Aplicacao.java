package br.com.projeto.campo_minado;

import br.com.projeto.campo_minado.modelo.Tabuleiro;
import br.com.projeto.campo_minado.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
		
	}
	
}
