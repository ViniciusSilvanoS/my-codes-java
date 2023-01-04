package youtube.gustavo_guanabara.poo06Encapsulamento;

/*
 	O programa representa as funcionalidades de um controle remoto.
 	Possui validações para não serem aceitas funcionalidades de acordo com o estado atual da TV
 	
 	Elabora o conceito de encapsulamento
 */

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {
		Controle c1 = new Controle();
		
		int escolha;
		
		do {
			String status = c1.statusTV();
			escolha = Integer.parseInt(JOptionPane.showInputDialog(status + "\n\n(1) Liga/Desliga\n(2) Muta/Desmuta\n(3) Play/Pause" + 
		"\n(4) Aumenta volume\n(5) Baixa volume\n(0) Para sair"));
			
			switch(escolha) {
				case 1:
					c1.ligaDesliga();
					break;
				case 2:
					c1.tocaMuta();
					break;
				case 3:
					c1.playPause();
					break;
				case 4:
					c1.maisVolume();
					break;
				case 5:
					c1.menosVolume();
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Saindo...");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (escolha != 0);
		
		System.out.println("Finalizando...");
		
	}
	
}
