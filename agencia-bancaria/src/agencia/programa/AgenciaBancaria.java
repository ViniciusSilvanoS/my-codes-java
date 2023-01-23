package agencia.programa;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import agencia.utilities.Utils;

public class AgenciaBancaria {

	static ArrayList<Conta> contasBancarias;
	
	public static void main(String[] args) {
		
		contasBancarias = new ArrayList<>();
		operacoes();
		
	}
	
	
	public static void operacoes() {

		int operacao = Utils.paneInserirInt("--- Selecione uma operação ---" + 
						"\nOpção 1 - Criar conta" + 
						"\nOpção 2 - Depositar" + 
						"\nOpção 3 - Sacar" + 
						"\nOpção 4 - Transferir" + 
						"\nOpção 5 - Editar/Excluir conta" +
						"\nOpção 6 - Listar" + 
						"\nOpção 0 - Sair");

		switch (operacao) {
		case 1:
			criarConta();
			break;
		case 2:
			depositar();
			break;
		case 3:
			sacar();
			break;
		case 4:
			transferir();
			break;
		case 5:
			editarOuExcluir();
			break;
		case 6:
			listar();
			break;
		case 0:
			Utils.paneEscrever("Até a próxima :)");
			System.exit(0);
			break;
		default:
			Utils.paneEscrever("Opção inválida!");
			operacoes();
		}

	}
	
	
	public static void criarConta() {
		
		String nome = Utils.paneInserirString("Nome: ");
		String cpf = Utils.paneInserirString("CPF: ");
		String email = Utils.paneInserirString("Email: ");

		Pessoa pessoa = new Pessoa(nome, cpf, email);
		
		Conta conta = new Conta(pessoa);
		
		contasBancarias.add(conta);
		
		Utils.paneEscrever("Conta criada com sucesso!");
		operacoes();
		
	}
	
	
	public static Conta encontrarConta(int numeroConta) {
		
		Conta conta = null;
		
		if(contasBancarias.size() > 0) {
			for(Conta c: contasBancarias) {
				if(numeroConta == c.getNumeroConta()) {
					conta = c;
				}
			}
		}	
		
		return conta;
		
	}
	
	
	public static void depositar() {
		
		int num = Utils.paneInserirInt("Digite o numero da conta que deseja depositar: ");
		
		Conta conta = encontrarConta(num);
		
		if(conta != null) {
			
			double valor = 0;
			do {
				
				valor = Utils.paneInserirDouble("Digite o valor a depositar: \nSaldo atual: " + Utils.doubleToStringMoeda(conta.getSaldo()) +
													"\n\nOu 0 para voltar ao menu.");
				if(valor > 0) {
					conta.depositar(valor);
				}else if(valor == 0) {
					operacoes();
				}else {
					Utils.paneEscrever("Valor inválido!!!");					
				}
				
			}while(valor < 0);
			
		}else {
			Utils.paneEscrever("Conta inexistente!");
		}
		
		operacoes();
		
	}
	
	
	public static void sacar() {
		
		int num = Utils.paneInserirInt("Digite o numero da sua conta: ");
		
		Conta conta = encontrarConta(num);
		
		if(conta != null) {
			
			double valor;
			do {
				
				valor = Utils.paneInserirDouble("Digite o valor a sacar: \nValor disponível: " + Utils.doubleToStringMoeda(conta.getSaldo()) +
													"\n\nOu 0 para voltar ao menu.");
				if(valor > 0) {
					conta.sacar(valor);
				}else if(valor == 0) {
					operacoes();
				}else {
					Utils.paneEscrever("Valor inválido!");
				}
				
			}while(valor <= 0);
			
		}else {
			Utils.paneEscrever("Conta inexistente!");
		}
		
		operacoes();
		
	}
	
	
	public static void transferir() {
		
		int num1 = Utils.paneInserirInt("Digite o numero da sua conta: ");
		
		Conta contaRemetente = encontrarConta(num1);
		if(contaRemetente == null) {
			Utils.paneEscrever("Conta inexistente!");
			operacoes();		
		}
		
		int num2 = Utils.paneInserirInt("Digite o número da conta do destinatário: ");
		
		Conta contaDestinatario = encontrarConta(num2);
		if(contaDestinatario == null) {
			Utils.paneEscrever("Conta do destinatário é inexistente!");
			operacoes();
		}
		
		// Coloquei essa validação por precaução de mudanças futuras. Já que o programa já faz essa validação logo acima
		if(contaRemetente != null || contaDestinatario != null) {
			
			double valor;
			do {
				
				valor = Utils.paneInserirDouble("Digite o valor a ser transferido: \nValor disponível: " + Utils.doubleToStringMoeda(contaRemetente.getSaldo()) +
													"\n\nOu 0 para voltar ao menu.");
				if(valor > 0) {
					contaRemetente.transferir(valor, contaDestinatario);
				}else if(valor == 0) {
					operacoes();
				}else {
					Utils.paneEscrever("Valor inválido!");
				}
				
			}while(valor <= 0);
			
		}else {
			Utils.paneEscrever("Erro no número da conta!");
		}
		
		operacoes();
		
	}
	
	
	public static void editarOuExcluir() {
		
		Conta conta;
		int numeroConta;
		
		numeroConta = Utils.paneInserirInt("Digite o número da conta: ");
		conta = encontrarConta(numeroConta);
		
		// Confirmando decisão
		int escolha = 2;
		if(conta != null) {
			String [] regra = {"Editar", "Exlcuir", "Cancelar"};
			escolha = JOptionPane.showOptionDialog(null, "Deseja editar ou excluir?", 
							"Opções", 0, JOptionPane.QUESTION_MESSAGE, null, regra, "Cancelar");			
		}else {
			Utils.paneEscrever("Conta não encontrada!");
			operacoes();
		}
		
		if(escolha == 0) { // EDITAR
			
			if(conta != null) {
				
				int escolha2 = 3;
				do {
					
					String [] regra2 = {"Nome", "CPF", "Email", "Sair"};
					escolha2 = JOptionPane.showOptionDialog(null, conta.listarSemSaldo() + "O que deseja editar?", "Opções", 0, JOptionPane.QUESTION_MESSAGE, null, regra2, "Sair");
					
					if(escolha2 == 0) {
						
						String novoNome = Utils.paneInserirString("Digite o novo nome: ");
						if(novoNome != "" || novoNome != null) {
							
							Pessoa pessoa = conta.getPessoa();
							Pessoa pessoaEditada = new Pessoa(novoNome, pessoa.getCpf(), pessoa.getEmail());
							conta.setPessoa(pessoaEditada);
							
							Utils.paneEscrever("Nome alterado com sucesso!");
							
						}else {
							Utils.paneEscrever("Nome inválido!");
						}
						
					}else if(escolha2 == 1) {
						
						String novoCpf = Utils.paneInserirString("Digite o novo CPF: ");
						if(novoCpf != "" || novoCpf != null) {
							
							Pessoa pessoa = conta.getPessoa();
							Pessoa pessoaEditada = new Pessoa(pessoa.getNome(), novoCpf, pessoa.getEmail());
							conta.setPessoa(pessoaEditada);
							
							Utils.paneEscrever("CPF alterado com sucesso!");
							
						}else {
							Utils.paneEscrever("CPF inválido!");
						}
						
					}else if(escolha2 == 2) {
						
						String novoEmail = Utils.paneInserirString("Digite o novo email: ");
						if(novoEmail != "" || novoEmail != null) {
							
							Pessoa pessoa = conta.getPessoa();
							Pessoa pessoaEditada = new Pessoa(pessoa.getNome(), pessoa.getCpf(), novoEmail);
							conta.setPessoa(pessoaEditada);
							
							Utils.paneEscrever("Email alterado com sucesso!");
							
						}else {
							Utils.paneEscrever("Email inválido!");
						}
						
					}
					
				}while(escolha2 != 3);
				
			}else {
				Utils.paneEscrever("Conta não encontrada!");
			}
			
		}else if(escolha == 1) { // EXCLUIR
			
			if(conta != null) {
					
				if(conta.getSaldo() > 0) {
					
					String [] regra = {"Sacar tudo", "Transferir", "Cancelar"};
					int escolha2 = JOptionPane.showOptionDialog(null, "ERRO!\n\nA conta ainda possui saldo.\nSaldo: " + 
										Utils.doubleToStringMoeda(conta.getSaldo()), 
										"Opções", 0, JOptionPane.QUESTION_MESSAGE, null, regra, "Cancelar");
					
					if(escolha2 == 0) {
						conta.setSaldo(0);
						Utils.paneEscrever("Todo o valor foi sacado!");
					}else if(escolha2 == 1) {
						
						Conta contaDestinatario;
						int numeroContaDestinatario = Utils.paneInserirInt("Digite o número da conta do destinatário: ");
						contaDestinatario = encontrarConta(numeroContaDestinatario);
						if(contaDestinatario != null) {
							
							double valorParaTransferir = conta.getSaldo();
							
							conta.transferir(valorParaTransferir, contaDestinatario);
							conta.setSaldo(0);
							
						}else {
							Utils.paneEscrever("Conta do destinatário não encontrada!");
							operacoes();
						}

					}else {
						Utils.paneEscrever("Voltando ao menu!");
						operacoes();
					}
					
				}
			
				for(int i = 0; i < contasBancarias.size(); i++) {
					if(contasBancarias.get(i) == conta) {
						
						int escolha3 = JOptionPane.showConfirmDialog(null, "CONFIRMAR EXCLUSÃO?", "Aviso!", JOptionPane.WARNING_MESSAGE,
										JOptionPane.YES_NO_OPTION);
						if(escolha3 == 0) {
							contasBancarias.remove(i);
							Utils.paneEscrever("Conta removida."); // Colocar validação de dinheiro
							break;
						}else {
							Utils.paneEscrever("Operação cancelada! Voltando ao menu");
							operacoes();
						}
						
					}
				}
				
			}else {
				Utils.paneEscrever("Conta não encontrada!");
			}
			
		}else {
			Utils.paneEscrever("Cancelado.\n\nVontando ao menu.");
		}
		
		operacoes();
		
	}
	
	
	public static void listar() {
		
		if(contasBancarias.size() > 0) {
			
			String listaDeContas = "";
			for(Conta c: contasBancarias) {
				listaDeContas += c.listar();
			}
			
			Utils.paneEscrever(listaDeContas);
			
		}else {
			Utils.paneEscrever("Nenhuma conta registrada!");
		}
		
		operacoes();
		
	}
	
	
}
