package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import model.Produto;
import utils.Utils;

public class Carrinho {

	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;
	
	public static void main(String[] args) {
		
		produtos = new ArrayList<>();
		carrinho = new HashMap<>();
		
		addProdutos();
		menu();
		
	}
	
	
	// Centraliza todo o sitema neste menu
	public static void menu() {
		int opcao = Utils.insereNum("1 - Listar produtos\n2 - Adicionar itens ao carrinho\n3 - Alterar/Excluir itens" +
					"\n4 - Listar itens do carrinho\n5 - Finalizar compra\n6 - Esvaziar carrinho\n0 - Sair");
		
		switch(opcao) {
			case 1:
				listarProdutos();
				break;
			case 2:
				addItens();
				break;
			case 3:
				alterarItens();
				break;
			case 4:
				listarCarrinho();
				break;
			case 5:
				finalizarCompra();
				break;
			case 6:
				esvaziarCarrinho();
			case 0:
				System.exit(0);
				break;
			default:
				Utils.escreve("Opção inválida");
				menu();
		}
		
	}
	
	
	// Lista todos produtos no "Banco de dados". (Próxima alteração, colocar no banco)
	private static void listarProdutos() {
		
		if(produtos.size() > 0) {
			String message = "";
			message = "--- Lista de Produtos ---\n";
			for(Produto produto: produtos) {
				message += produto.getNome() + " - " + Utils.doubleToString(produto.getPreco()) + "\n";
			}
			Utils.escreve(message);
		}else {
			Utils.escreve("Nenhum produto cadastrado");
		}
		
		menu();
		
	}
	
	
	// Adiciona itens ao carrinho
	private static void addItens() {
		
		if(produtos.size() > 0) {
			String message = "Digite o código do produto que seja comprar: \n";
			message = "--- Produtos ---\n\n";
			
			for(Produto produto: produtos) {
				message += produto.getId() + " - " + produto.getNome() + " - " + Utils.doubleToString(produto.getPreco());
				
				if(carrinho.size() > 0) {
					message += carrinho.containsKey(produto) ? "   (" + carrinho.get(produto) + ")\n" : "\n";
				}else {
					message += "\n";
				}
			}
			
			int id = Utils.insereNum(message);
			boolean isPresent = false;
			
			for(Produto produto: produtos) { 
				if(id == produto.getId()) {
					int qtd = 0;
					try {
						qtd = carrinho.get(produto); 
						// checa se o produto já está no carrinho, incrementa a quantidade
						carrinho.put(produto, qtd + 1);
					} catch (NullPointerException e) {
						// se o produto for o primeiro no carrinho
						carrinho.put(produto, 1);
					}
					
					int opcao = Utils.insereNum("Deseja inserir quantidade?\n\n1 - Somente unidade\n2 - Inserir quantidade\n0 - Cancelar item/Voltar ao menu"); // *** VERIFICAR OPÇÃO 0 ***
					if(opcao == 2) {
						qtd = Utils.insereNum(produto.getNome() + "\nDigite a quantidade desejada");
						
						if(qtd == 0) {
							carrinho.remove(produto);
						}else {
							carrinho.put(produto, carrinho.get(produto) + (qtd - 1));							
						}
						
					}else if(opcao == 0) {
						
						if(carrinho.get(produto) == 1) {
							carrinho.remove(produto);
						}else {
							carrinho.put(produto, carrinho.get(produto) - 1);
						}
						
						menu();
						
					}
					
					if(opcao == 2) {
						Utils.escreve(qtd + " " + produto.getNome() + " adicionado ao carrinho.");
					}else {
						Utils.escreve(produto.getNome() + " adicionado ao carrinho.");
					}
					isPresent = true;
					
					if(isPresent) {
						do {
							
							String message2 = "";
							message2 += "Escolha as opções: \n\n";
							message2 += "1 - Adicionar outro item\n2 - Listar carrinho\n3 - Finalizar compra\n0 - Voltar ao menu";
							opcao = Utils.insereNum(message2);
							
							if(opcao == 1) {
								addItens();
							}else if(opcao == 2) {
								if(carrinho.size() > 0) {
									double total = 0;
									message2 = "Itens no carrinho:\n\n";
									for(Produto p: carrinho.keySet()) {
										message2 += p.getId() + " - " + p.getNome() + " - " + carrinho.get(p) + (carrinho.get(p) == 1 ? " item - " : " itens - ") +
													Utils.doubleToString(p.getPreco() * carrinho.get(p)) + "\n";
										total += p.getPreco() * carrinho.get(p);
									}
									Utils.escreve(message2 + "\nTotal: " + Utils.doubleToString(total));
								}else {
									Utils.escreve("Carrinho está vazio!");
								}

							}else if(opcao == 3) {
								finalizarCompra();
								menu();
							}else if(opcao == 0) {
								menu();
							}
							
						}while(opcao == 2);
						
					}
					
				}
			}				
			
			Utils.escreve("Produto não encontrado.");
			menu();
			
		}else {
			Utils.escreve("Nenhum produto disponível");
			menu();
		}
		
	}
	
	
	// Faz alterações nos itens inseridos no carrinho
	private static void alterarItens() {
		
		if(carrinho.size() > 0) {
			
			String message = "";
			message += "Escolha o ID do item que deseja alterar:\n\n";
			
			for(Produto produto: carrinho.keySet()) {
				message += produto.getId() + " - " + produto.getNome() + "   (" + carrinho.get(produto) + ")\n";
			}
			
			int id = Utils.insereNum(message);
			for(Produto produto: carrinho.keySet()) {
				if(id == produto.getId()) {
					
					int opcao = 0;
					do {
					
						opcao = Utils.insereNum("Digite a alteração que deseja fazer:\n\n" + produto.getNome() + ", " + carrinho.get(produto) +
								(carrinho.get(produto) > 1 ? " itens" : " item") + "\n1 - Alterar quantidade\n2 - Excluir do carrinho" + 
								"\n0 - Voltar ao menu");
						switch(opcao) {
							case 1:
								int qtd = Utils.insereNum(produto.getNome() + ", " + carrinho.get(produto) + (carrinho.get(produto) > 1 ? " itens" : " item") +
										"\n\nDigite a quantidade itens desejado");
								if(qtd == 0) {
									carrinho.remove(produto);
									Utils.escreve("Item excluído com sucesso!");
									menu();
								}else if(qtd > 0) {
									carrinho.put(produto, qtd);
									Utils.escreve("Item alterado com sucesso!");
									menu();
								}else {
									Utils.escreve("Quantidade inválida");
									menu();
								}
								break; // Obs.: Coloco break pra eliminar um possivel esquecimento em caso de mudanças.
							case 2:
								carrinho.remove(produto);
								Utils.escreve("Item removido com sucesso!");
								menu();
								break;
							case 0:
								menu();
								break;
							default:
								Utils.escreve("Opção inválida");
						}
						
					}while(opcao < 0 || opcao > 3);
					
					break;
					
				}
			}
			
			Utils.escreve("Opção inválida. Item não está no seu carrinho");
			menu();
			
		}else {
			Utils.escreve("Você não possuí nenhum item no carrinho para ser modificado.");
			menu();
		}

		
	}
	
	
	// Lista todas mercadorias que foram adicionadas no carrinho
	private static void listarCarrinho() {
		
		if(carrinho.size() > 0) {
			double total = 0;
			String message = "Itens no carrinho:\n\n";
			for(Produto p: carrinho.keySet()) {
				message += p.getId() + " - " + p.getNome() + " - " + carrinho.get(p) + (carrinho.get(p) == 1 ? " item - " : " itens - ") +
							Utils.doubleToString(p.getPreco() * carrinho.get(p)) + "\n";
				total += p.getPreco() * carrinho.get(p);
			}
			Utils.escreve(message + "\nTotal: " + Utils.doubleToString(total));
		}else {
			Utils.escreve("Seu carrinho está vazio!");
		}
		
		menu();
		
	}
	
	
	// Finaliza a compra e esvazia o carrinho
	private static void finalizarCompra() {
		
		if(carrinho.size() > 0) {
			
			double total = 0;
			for(Produto produto: carrinho.keySet()) {
				total += produto.getPreco();
			}
			
			int value = JOptionPane.showConfirmDialog(null, "Deseja finalizar a compra?\nTotal: " + Utils.doubleToString(total), "CONFIRMA", JOptionPane.YES_NO_OPTION);
			if(value == 0) {
				Utils.escreve("Compra finalizada com sucesso!\nTotal: " + Utils.doubleToString(total) + "\n\nVolte sempre!!!");
				carrinho.clear();
			}else {
				Utils.escreve("Cancelado...");
			}
			
		}else {
			Utils.escreve("Erro. Seu carrinho está vazio!");
		}
		
		menu();
	}
	
	
	// Esvazia todos itens do carrinho
	private static void esvaziarCarrinho() {
		
		if(carrinho.size() > 0) {
			
			int value = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja esvaziar seu carrinho?", "AVISO!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
			if(value == 0) {
				carrinho.clear();
				Utils.escreve("Carrinho esvaziado com sucesso!");
			}else {
				Utils.escreve("Cancelado...");
			}
			
		}else {
			Utils.escreve("O carrinho já está vazio!");
		}
		
		menu();
		
	}
	
	
	// Adicionando itens aleatórios para teste
	public static void addProdutos() {
		
		Produto p1 = new Produto("TV 32", 1600);
		Produto p2 = new Produto("TV 42", 2200);
		Produto p3 = new Produto("TV 52", 3400);
		Produto p4 = new Produto("Notebook", 5000);
		Produto p5 = new Produto("Geladeira", 3100);
		Produto p6 = new Produto("16gb RAM", 450);
		Produto p7 = new Produto("Processador", 1300);
		Produto p8 = new Produto("Arroz", 8.50);
		Produto p9 = new Produto("Feijão", 10.60);
		Produto p10 = new Produto("Massa", 4);
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
		produtos.add(p7);
		produtos.add(p8);
		produtos.add(p9);
		produtos.add(p10);
		
	}
}
