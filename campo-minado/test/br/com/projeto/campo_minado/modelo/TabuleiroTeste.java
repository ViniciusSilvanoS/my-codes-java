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

		tabuleiro = new Tabuleiro(6, 6, 1);
		
		tabuleiro.campos.stream()
			.filter(c -> c.isMinado())
			.forEach(c -> c.alternarMarcacao());
		
		tabuleiro.campos.stream()
			.filter(c -> !c.isMinado() && c.isFechado() && !c.isMarcado())
			.forEach(c -> c.abrir());
		
		assertTrue(tabuleiro.objetivoAlcancado());			
			
	}
	
	@Test
	void testeAbrirCamposComExplosao() {
		
		tabuleiro = new Tabuleiro(6, 6, 1);
				
		tabuleiro.campos.stream()
		.filter(c -> c.isMinado())
		.map(c -> c.abrir());
		
		
		
	}

}
