package agencia.programa;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import agencia.excecoes.StringNulaException;
import agencia.excecoes.StringVaziaException;
import agencia.utilities.Utils;

public class AgenciaBancaria {

	static ArrayList<Conta> contasBancarias;
	
	public static void main(String[] args) throws Exception {
		
		contasBancarias = new ArrayList<>();
		
		// Para testes -------------------------------------------------
		Pessoa pessoa = new Pessoa("Gui", "123", "gui@gmail.com");
		Conta conta = new Conta(pessoa);
		
		Pessoa pessoa2 = new Pessoa("Bia", "456", "bia@gmail.com");
		Conta conta2 = new Conta(pessoa2);
		
		Pessoa pessoa3 = new Pessoa("Duda", "789", "duda@gmail.com");
		Conta conta3 = new Conta(pessoa3);
		
		contasBancarias.add(conta);
		contasBancarias.add(conta2);
		contasBancarias.add(conta3);
		//// ----------------------------------------------------
		
		operacoes();
		
	}
	
	
	public static void operacoes() {

		try {
			// Não usei a classe Utils, como nos outros casos, para captar o null e perguntar se usuário deseja sair
			String operacao = JOptionPane.showInputDialog("--- Selecione uma operação ---" + 
							"\nOpção 1 - Criar conta" + 
							"\nOpção 2 - Depositar" + 
							"\nOpção 3 - Sacar" + 
							"\nOpção 4 - Transferir" + 
							"\nOpção 5 - Editar/Excluir conta" +
							"\nOpção 6 - Listar" + 
							"\nOpção 0 - Sair");

			if(operacao != null) {
				
				switch (operacao) {
				case "1":
					criarConta();
					break;
				case "2":
					depositar();
					break;
				case "3":
					sacar();
					break;
				case "4":
					transferir();
					break;
				case "5":
					editarOuExcluir();
					break;
				case "6":
					listar();
					break;
				case "0":
					Utils.paneEscrever("Até a próxima :)");
					System.exit(0);
					break;
				default:
					Utils.paneEscrever("Opção inválida!");
					operacoes();
				}
				
			}else {
				
				String [] regra = {"Sim", "Não"};
				int escolha = JOptionPane.showOptionDialog(null, "Você deseja sair do sistema?", 
									"Opções", 0, JOptionPane.WARNING_MESSAGE, null, regra, "Não");
				
				if(escolha == 0) {
					Utils.paneEscrever("Saindo!\n\nAté a próxima :)");
					System.exit(0);
				}else {
					operacoes();
				}
				
			}
			
			
		} catch (StringVaziaException e) {
			Utils.paneEscrever("Valor inválido!");
			e.printStackTrace();
			operacoes();
		} catch (StringNulaException | NullPointerException e) {
			Utils.paneEscrever("Operação cancelada!");
			e.printStackTrace();
			operacoes();
		} catch (NumberFormatException e) {
			Utils.paneEscrever("O valor digitado deve ser um número!");
			e.printStackTrace();
			operacoes();
		} catch (Exception e) {
			Utils.paneEscrever("Ocorreu um erro!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	
	public static void criarConta() throws RuntimeException {
		
		String nome = Utils.paneInserirString("Nome: ");	
		Validar.stringVazio(nome, "nome");
		
		String cpf = Utils.paneInserirString("CPF: ");
		Validar.stringVazio(cpf, "CPF");
					
		String email = Utils.paneInserirString("Email: ");
		Validar.stringVazio(email, "email");
		
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
	
	
	public static void depositar() throws RuntimeException {
		
		int num = Utils.paneInserirInt("Digite o numero da conta que deseja depositar: ");
		
		Conta conta = encontrarConta(num);
		
		if(conta != null) {
			
			double deposito = 0;
			do {
				
				deposito = Utils.paneInserirDouble("Digite o valor a depositar: \nSaldo atual: " + Utils.doubleToStringMoeda(conta.getSaldo()) +
													"\n\nOu 0 para voltar ao menu.");
//					Validar.stringVazio(Double.toString(deposito), "deposito");
				
				if(deposito > 0) {
					conta.depositar(deposito);
				}else if(deposito == 0) {
					operacoes();
				}else {
					Utils.paneEscrever("Valor inválido!!!");					
				}
				
			}while(deposito <= 0);
			
		}else {
			Utils.paneEscrever("Conta inexistente!");
		}
		
		operacoes();
		
	}
	
	
	public static void sacar() throws RuntimeException {
		
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
	
	
	public static void transferir() throws RuntimeException {
		
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
		
		// Coloquei essa validação por precaução de mudanças futuras
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
	
	
	public static void editarOuExcluir() throws RuntimeException {
		
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
	
	
	public static void listar() throws RuntimeException {
		
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
	
	
	
	
	
	
	
	// Colocar a opção de excluir conta. Para excluir deve esvaziar a conta. Dar as opções (Sacar todo valor / Transferir todo o valor / Cancelar operação)
}
