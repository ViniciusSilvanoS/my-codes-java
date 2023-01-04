package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		
		System.out.println("---------");
		
		System.out.println(usuarios.keySet()); // Mostra todas as chaves presente no programa
		System.out.println(usuarios.values()); // Mostra o que contém dentro
		System.out.println(usuarios.entrySet()); // Puxa os dois, tanto id quanto nome 
		
		System.out.println("---------");
		
		System.out.println(usuarios.containsKey(20)); // Vê se existe esse ID
		System.out.println(usuarios.containsValue("Rebeca")); // Vê se existe esse valor
		
		System.out.println("---------");
		
		System.out.println(usuarios.get(20));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(3, "Rafaela"));
		
		System.out.println("--------- (4)"); // O 4 que coloquei foi só pra me achar onde estava no console essa parte
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		
		System.out.println("---------");
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println("---------");
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
		
	}
	
}
