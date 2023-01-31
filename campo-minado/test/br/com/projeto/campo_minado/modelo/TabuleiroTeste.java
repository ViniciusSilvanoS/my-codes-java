package br.com.projeto.campo_minado.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabuleiroTeste {

	Tabuleiro tabuleiro;
	
	@Test
	void testeIniciarTabuleiro() {
		tabuleiro = new Tabuleiro(6, 6, 2);
	}
	
	@Test
	void testeAbrirCamposSemExplosao() {
		int linhas = 6;
		int colunas = 6;
		
		tabuleiro = new Tabuleiro(linhas, colunas, 1);
		
		tabuleiro.abrir(0, 0);
		tabuleiro.campos.stream().filter(c -> c.isFechado() && c.vizinhancaSegura()).forEach(c -> c.alternarMarcacao());
		
		assertTrue(tabuleiro.objetivoAlcancado());
		
//		for(int i = 0; i < linhas; i++) {
//			for(int j = 0; j < colunas; j++) {
//				assertAll(tabuleiro.abrir(i, j));
//				assertNo
//			}
//		}
		
		
	}

}
