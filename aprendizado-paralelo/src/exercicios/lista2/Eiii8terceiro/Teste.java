package exercicios.lista2.Eiii8terceiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exercicios.lista2.Eiii8terceiro.modelo.Empresa;

public class Teste {

	public static void main(String[] args) {
		
//		List<Empresa> empresas = new ArrayList<>();
//		
//		Empresa e1 = new Empresa("Primeiro Teste", "111");
//		Empresa e2 = new Empresa("Segundo Teste", "222");
//		
//		empresas.add(e1);
//		empresas.add(e2);
//		
//		String cnpj = "111";
//		
//		boolean valor = empresas.stream()
//				.anyMatch(e -> e.getCNPJ() == cnpj);
//		
//		System.out.println("Tem? " + valor);
		
		Map<Integer, Empresa> empresas = new HashMap<>();
		
		Empresa e1 = new Empresa("Primeiro Teste", "111");
		Empresa e2 = new Empresa("Segundo Teste", "222");
		
		empresas.put(1, e1);
		empresas.put(2, e2);
		
		String cnpj = "121";
		
		boolean valor = empresas.values().stream()
				.anyMatch(e -> e.getCNPJ() == cnpj);
		
		System.out.println(valor);
		
	}
	
}
