package oo.composicao_teste2.meu.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public Cliente(String nome, List<Compra> compras) {
		this(nome);
		this.compras = compras;
	}
	
	//// ----------------------------------------------------
	
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double totalCliente() {
		double totalCompras = 0;
		for(Compra compra: compras) {
			totalCompras += compra.totalItens();
		}
		
		return totalCompras;
	}
	
	//// ----------------------------------------------------
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	
	
	
	
}
