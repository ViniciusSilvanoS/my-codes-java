package exercicioVetor;

public class TrabalhoDeDados {

	//Procura as posições consecutivas com valores mais distantes
	static int diferencaEntreDados(int[] vet){
		int aux = -1;
		int posicao = -1;
		for(int i = 0; i < vet.length - 1; i++) {
			if(aux < (vet[i] - vet[i + 1])) {
				aux = vet[i] - vet[i + 1];
				posicao = i + 1;
			}else if(aux < vet[i + 1] - vet[i]) {
				aux = vet[i + 1] - vet[i];
				posicao = i + 1;
			}
		}
		return posicao;
	}
	
	// Verifica ordem do vetor
	static int ordem (int[] vet){
		int cont = 0;
		
		for(int i = 0; i < (vet.length - 1); i++) {
			if(vet[i] < vet[i + 1])  { // Conta se for crescente
				cont++;
			}
		}
		
		if(cont == (vet.length - 1)) {
			return 1; // 1 Ordem crescente
		}else {
			cont = 0;
			for(int i = (vet.length - 1); i > 0; i--) { 
				if(vet[i] < vet[i - 1]) { // Conta se for decrescente
					cont++;
				}
			}
			
			if(cont == (vet.length - 1)) {
				return -1; // -1 Ordem decrescente
			}else {
				return 0; // 0 Sem ordem
			}
		}
	}
	
	// Comparações feitas com o valor X
	static int[] comparacao(int x, int[] vet) {
		int[] compara = new int[3]; // (vetor posição 1 é o centro) compara[0] valores abaixo | compara[1] valores iguais | compara[2] valores maiores
		
		for(int vetor: vet) {
			if(vetor == x) {
				compara[1]++; // igual
			}else if(vetor < x) {
				compara[0]++; // menor
			}else {
				compara[2]++; // maior
			}
		}
		
		return compara;
	}
	
}
