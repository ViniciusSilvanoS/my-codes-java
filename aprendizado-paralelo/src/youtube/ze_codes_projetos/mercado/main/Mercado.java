package youtube.ze_codes_projetos.mercado.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import youtube.ze_codes_projetos.mercado.model.Produto;
import youtube.ze_codes_projetos.mercado.utils.Utils;

// https://www.youtube.com/watch?v=zVIowfVcT3M&ab_channel=Z%C3%A9codes

public class Mercado {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;
	
	public static void main(String[] args) {
		
		produtos = new ArrayList<>();
		carrinho = new HashMap<>();
		
		menu();		
	}
	
	private static void menu() {
		
		System.out.println("--------------------------------------------------");
		System.out.println("---------------Welcome to Zé Market---------------");
		System.out.println("--------------------------------------------------");
		System.out.println("*** Selecione uma operação que deseja realizar ***");
		System.out.println("--------------------------------------------------");
		System.out.println("|		Opção 1 - Cadastrar		|");
		System.out.println("|		Opção 2 - Listar		|");
		System.out.println("|		Opção 3 - Comprar		|");
		System.out.println("|		Opção 4 - Carrinho		|");
		System.out.println("|		Opção 5 - Sair			|");
		
		int option = scanner.nextInt();
		
			switch (option) {
			case 1:
				cadastrarProdutos();
				break;
			case 2:
				listarProdutos();
				break;
			case 3:
				comprarProdutos();
				break;
			case 4:
				verCarrinho();
				break;
			case 5:
				System.out.println("Volte sempre!!!");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida!");
				menu();
			}
		
	}
	
	private static void cadastrarProdutos() {
		System.out.println("Nome do produto: ");
		String nome = scanner.next();
		
		System.out.println("Preço do produto: ");
		double preco = scanner.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		produtos.add(produto);
		
		System.out.println(produto.getNome() + " cadastrado com sucesso!");
		menu();
		
	}
	
	private static void listarProdutos() {
		if(produtos.size() > 0) {
			System.out.println("Lista de produtos:");
			
			for(Produto produto: produtos) {
				System.out.println(produto.getNome() + ": " + Utils.doubleToString(produto.getPreco()));
				
			}
		}else {
			System.out.println("Nenhum produto cadastrado!");
		}
		
		menu();
	}
	
	private static void comprarProdutos() {
		if(produtos.size() > 0) {
			System.out.println("Código do produto: \n");
			
			System.out.println("---------------Produtos Disponíveis---------------");
			
			for(Produto produto: produtos) {
				System.out.println(produto.getId() + " - " + produto.getNome() + " | " + produto.getPreco());
			}
			
			int id = scanner.nextInt();
			boolean isPresent = false;
			
			for(Produto produto: produtos) { // ideia = verificar se o item colocado já esta no carrinho, caso tenha perguntar se deseja mudar quantidade
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
					
					System.out.println(produto.getNome() + " adicionado ao carrinho.");
					isPresent = true;
					
					if(isPresent) {
						System.out.println("Deseja adicionar outro produto? ");
						System.out.println("Digite 1 para sim, ou 0 para finalizar a compra. \n");
						int option = scanner.nextInt();
						
						if(option == 1) {
							comprarProdutos();
						}else {
							finalizarCompra();
						}
						
					}
					
				}
			}
			System.out.println("Produto não encontrado.");
			menu();
			
			
		}else {
			System.out.println("Não existem produtos cadastrados!");
			menu();
		}
	}
	
	private static void verCarrinho() {
		System.out.println("---Produtos no seu carrinho!---");
		if(carrinho.size() > 0) {
			for(Produto produto: carrinho.keySet()) {
				System.out.println("Produto: " + produto + " | Quantidade: " + carrinho.get(produto));
			}
		}else {
			System.out.println("Nenhum produto no carrinho!");
		}
		
		menu();
	}
	
	private static void finalizarCompra() {
		double valorTotal = 0;
		
		System.out.println("Seus produtos: ");
		for(Produto produto: carrinho.keySet()) {
			int qtd = carrinho.get(produto);
			valorTotal += produto.getPreco() * qtd;
			System.out.println("ID: " + produto.getId() + "Item: " + produto.getNome() + " | Quantidade: " + qtd);
			System.out.println("---------------------------");
		}
		System.out.println("O valor da sua compra é: " + Utils.doubleToString(valorTotal));
		carrinho.clear();
		System.out.println("Obrigado pela preferência!!!");
		menu();
	}
	
}