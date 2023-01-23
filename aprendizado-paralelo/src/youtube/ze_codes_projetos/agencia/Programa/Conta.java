package youtube.ze_codes_projetos.agencia.Programa;

import youtube.ze_codes_projetos.agencia.utilitarios.Utils;

public class Conta {

	private static int contadorDeContas = 1;
	
	private int numeroConta;
	private Pessoa pessoa;
	private Double saldo = 0d;
	
	public Conta(Pessoa pessoa) {
		this.numeroConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Numero Conta: " + this.getNumeroConta() +
				"\nNome: " + this.pessoa.getNome() +
				"\nCPF: " + this.pessoa.getCpf() +
				"\nEmail: " + this.pessoa.getEmail() +
				"\nSaldo: " + Utils.doubleToString(this.getSaldo()) + 
				"\n";
	}
	
	public void depositar(Double valor) {
		if(valor > 0) {
			this.setSaldo(valor);
			Utils.paneEscrever("Valor inserirdo com sucesso!");
		}else {
			Utils.paneEscrever("Não foi possível realizar o depósito!");
		}
	}
	
	public void sacar (Double valor) {
		if(valor > 0 && valor < this.getSaldo()) {
			setSaldo(getSaldo() - valor);
			Utils.paneEscrever("Saque realizado com sucesso!");
		}else {
			Utils.paneEscrever("Valor inválido!");
		}
	}
	
	public void transferir(Conta contaParaDeposito, double valor) {
		if(valor < this.getSaldo()) {
			contaParaDeposito.setSaldo(contaParaDeposito.getSaldo() + valor);
			Utils.paneEscrever("Transferência efetuada com êxito!");
		}else {
			Utils.paneEscrever("Falha na transferência!");
		}
	}
	
	public static void criarConta() {
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
