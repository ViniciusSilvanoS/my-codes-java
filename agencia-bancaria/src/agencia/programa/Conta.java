package agencia.programa;

import agencia.utilities.Utils;

public class Conta {

	static private int contadorDeContas = 1;
	
	private int numeroConta;
	private Pessoa pessoa;
	private double saldo = 100;
	
	
	public Conta(Pessoa pessoa) {
		this.numeroConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;
	}
	
	//// ----------------------------------------------------
	
	public void depositar(double valor) {
		
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			Utils.paneEscrever("Deposito de " + Utils.doubleToStringMoeda(valor) + " realizado com sucesso!\n\nTotal de saldo: " +
									Utils.doubleToStringMoeda(this.getSaldo()));
		}else {
			Utils.paneEscrever("Erro ao depositar. Valor inválido!");
		}
		
	}
	
	public void sacar(double valor) {
		
		if(valor > 0 && this.getSaldo() >= valor) {
			this.setSaldo(getSaldo() - valor);
			Utils.paneEscrever("Saque de " + Utils.doubleToStringMoeda(valor) + " realizado com sucesso!\n\nSaldo restante: " +
									Utils.doubleToStringMoeda(this.getSaldo()));
		}else {
			Utils.paneEscrever("Erro ao sacar. Valor inválido!");
		}
		
	}
	
	public void transferir(double valor, Conta contaDestinatario) {
		
		if(this.saldo >= valor) {
			
			this.setSaldo(this.getSaldo() - valor);
			contaDestinatario.setSaldo(contaDestinatario.getSaldo() + valor);
			Utils.paneEscrever("Tranferência de " + Utils.doubleToStringMoeda(valor) + " realizada com sucesso!\n\nSaldo restante: " +
									Utils.doubleToStringMoeda(this.getSaldo()));
			
		}else {
			Utils.paneEscrever("Valor inválido!");
		}
		
	}
	
	public String listar () {
		
		return "Nº conta: " + this.getNumeroConta() + 
				" | Nome: " + pessoa.getNome() +
				" | CPF: " + pessoa.getCpf() +
				" | Email: " + pessoa.getEmail() +
				" | Saldo: " + Utils.doubleToStringMoeda(this.getSaldo()) + "\n";
		
	}
	
	public String listarSemSaldo () {
		
		return "Nº conta: " + this.getNumeroConta() + 
				" | Nome: " + pessoa.getNome() +
				" | CPF: " + pessoa.getCpf() +
				" | Email: " + pessoa.getEmail() + "\n";
		
	}

	//// ----------------------------------------------------

	public int getNumeroConta() {
		return numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//// ----------------------------------------------------

	@Override
	public String toString() {
		return "Numero da conta: " + numeroConta + 
				"\nNome: " + pessoa.getNome() +
				"\nCPF: " + pessoa.getCpf() +
				"\nEmail: " + pessoa.getEmail() +
				"\nSaldo: " + Utils.doubleToStringMoeda(this.getSaldo()) + "\n";
	}
	
	
	
	
}
