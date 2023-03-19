package br.com.projeto.campo_minado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int linha;
	private final int coluna;	
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	// Auto relacionamento
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();
	
	Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	//// ----------------------------------------------------
	
	public void registrarObservador(CampoObservador observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(CampoEvento evento) {
		observadores.stream()
			.forEach(observador -> observador.eventoOcorreu(this, evento));
	}
	
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
	
	
	public void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
			
			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			}else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
		}
	}
	
	
	public boolean abrir() {
		
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				notificarObservadores(CampoEvento.EXPLODIR);
				return true;
			}
			
			setAberto(true);
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
			
		}else {
			return false;			
		}
		
		
	}
	
	public boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	void minar() {
			minado = true;
	}
	
	public boolean isMarcado() {
		return this.marcado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		
		if(aberto) {
			notificarObservadores(CampoEvento.ABRIR);			
		}
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
	
	public int minasNaVizinhanca() {
		return (int) vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		notificarObservadores(CampoEvento.REINICIAR);
	}

	
}
