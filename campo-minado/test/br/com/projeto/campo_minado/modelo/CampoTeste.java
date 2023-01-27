package br.com.projeto.campo_minado.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.projeto.campo_minado.excecao.ExplosaoException;
import br.com.projeto.campo_minado.modelo.Campo;

class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	//// Testenado Vizinhos Horizontal/Vertical ----------------------------------------------------
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Cima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Baixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	//// Testando Vizinhos Diagonal ----------------------------------------------------
	
	@Test
	void testeVizinhoDistancia2EsquerdaCima() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2DireitaCima() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2EsquerdaBaixo() {
		Campo vizinho = new Campo(4, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2DireitaBaixo() {
		Campo vizinho = new Campo(4, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	
	//// Teste de Não Vizinhos ----------------------------------------------------
	
	@Test
	void testeNaoVizinhoDiagonalEsquerdaCima() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinhoDiagonalDireitaCima() {
		Campo vizinho = new Campo(1, 5);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinhoDiagonalEsquerdaBaixo() {
		Campo vizinho = new Campo(5, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinhoDiagonalDireitaBaixo() {
		Campo vizinho = new Campo(7, 7);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinhoEsquerda() {
		Campo vizinho = new Campo(3, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinhoDireita() {
		Campo vizinho = new Campo(3, 10);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinhoCima() {
		Campo vizinho = new Campo(1, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeNaoVizinhoBaixo() {
		Campo vizinho = new Campo(10, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	//// Teste Marcações ----------------------------------------------------
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	//// Teste de Abertura de Campos ----------------------------------------------------
	
	@Test
	void testeAbrirNaoMinadoENaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMarcadoMinado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMarcadoMinado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
		
	}
	
	@Test
	void testeAbrirComVizinhos() {
		
		Campo campo11 = new Campo(1, 1);	
		Campo campo22 = new Campo(2, 2);
		
		campo22.adicionarVizinho(campo11);

		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}

	@Test
	void testeAbrirComVizinhosMinado() {
		
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);		
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	//// ----------------------------------------------------
	
//	@Test
//	void testeAtingirObjetivo() {
//		
//		Campo campo22 = new Campo(2, 2);
//		Campo campo22 = new Campo(2, 2);
//		
//	}
	
	
	
	
}
