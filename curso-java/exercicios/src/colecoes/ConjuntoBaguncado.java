package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
	
	HashSet conjunto = new HashSet();
	
	//Como o colections não aceite tipos primitivos, aqui ele converte automaticamente
	conjunto.add(1.2);	// double -> Double
	conjunto.add(true);
	conjunto.add("Teste");
	conjunto.add(1);
	conjunto.add('x');
	
	System.out.println("Tamanho é " + conjunto.size());

	conjunto.add("Teste");
	conjunto.add("Sim");
	System.out.println("Tamanho é " + conjunto.size());
	
	System.out.println(conjunto.remove("Sim"));
	System.out.println(conjunto.contains("Sim"));
	
	
	
	Set nums = new HashSet();
	
	nums.add(1);
	nums.add(2);
	nums.add(3);
	
	System.out.println(nums);
	System.out.println(conjunto);
	
	// Adiciona todos do NUMS para dentro de CONJUNTO
//	conjunto.addAll(nums);
//	System.out.println(conjunto);
	
	System.out.println("AQUI");
	// Mantém somente os valores iguais
	conjunto.retainAll(nums);
	System.out.println(conjunto);
	
	conjunto.clear();
	System.out.println(conjunto);
	
	
	
	
	}
}
