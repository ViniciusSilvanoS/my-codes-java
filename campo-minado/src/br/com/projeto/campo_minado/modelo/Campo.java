package br.com.projeto.campo_minado.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.campo_minado.excecao.ExplosaoException;

public class Campo {

	private final int linha;
	private final int coluna;	
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	// Auto relacionamento
	private List<Campo> vizinhos = new ArrayList<>();
	
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	//// ----------------------------------------------------
	
	boolean adicionarVizinho(Campo confirmaSeVizinho) {
		
		boolean linhaDiferente = linha != confirmaSeVizinho.linha; // 4
		boolean colunaDiferente = coluna != confirmaSeVizinho.coluna; // 3
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int diferencaLinha = Math.abs(linha - confirmaSeVizinho.linha);
		int diferencaColuna = Math.abs(coluna - confirmaSeVizinho.coluna);
		int total = diferencaLinha + diferencaColuna;
		
		if((total == 1 && !diagonal) || (total == 2 && diagonal)) {
			vizinhos.add(confirmaSeVizinho);
			return true;
		}else {
			return false;
		}
		
	}
	
	
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	
	boolean abrir() {
		
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
			
		}else {
			return false;			
		}
		
		
	}
	
	boolean vizinhancaSegura() {
		
		return vizinhos.stream().noneMatch(v -> v.minado);
		
	}
	
	void minar() {
			minado = true;
	}
	
	public boolean isMarcado() {
		return this.marcado;
	}
	
	public boolean isMinado() {
		return this.minado;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = marcado && minado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) {
			return "x";
		}else if(aberto && minado) {
			return "*";
		}else if(aberto && minasNaVizinhanca() > 0) {
			return Long.toString(minasNaVizinhanca());
		}else if(aberto) {
			return " ";
		}else {
			return "?";
		}
	}
	
}
