package youtube.ze_codes_projetos.agencia.Programa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AgenciaBancaria {

	static ArrayList<Conta> contasBancarias;
	
	public static void main(String[] args) {
		
		contasBancarias = new ArrayList<>();
		operacoes();
		
	}
	
	public static void operacoes() {
		
		int operacao = Integer.parseInt(Utils.paneInserir("--- Selecione uma operação ---" +
				"\nOpção 1 - Criar conta" +
				"\nOpção 2 - Depositar" + 
				"\nOpção 3 - Sacar" +
				"\nOpção 4 - Transferir" +
				"\nOpção 5 - Listar" +
				"\nOpção 6 - Sair"));
		
		switch(operacao) {
			case 1:
	//			criarConta();
				break;
			case 2:
	//			depositar();
				break;
			case 3:
	//			sacar();
				break;
			case 4:
	//			transferir();
				break;
			case 5:
	//			listar();
				break;
			case 6:
				Utils.paneEscrever("Até a próxima :)");
				System.exit(0);
				break;
			default:
				Utils.paneEscrever("Opção inválida");
				operacoes();
		}
		
		
	}
	
}
