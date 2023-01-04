package exercicios.lista2.Eiii8segundo;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		List<Departamento> departamentos = new ArrayList<>();
		List<Departamento> departamentos1 = new ArrayList<>();
		
//		Collections.addAll(departamentos, "RH", "Produção", "TI");
		departamentos.add(new Departamento("RH"));
		departamentos.add(new Departamento("Produção"));
		departamentos.add(new Departamento("TI"));
		departamentos.add(new Departamento("TI"));
		
		
		System.out.println(departamentos.size());
		
		for(Departamento departamento: departamentos) {
			System.out.print(departamento.getNome() + " | ");
		}
		
		departamentos1.add(new Departamento("Contabilidade"));
		departamentos1.add(new Departamento("Logistica"));
		departamentos1.add(new Departamento("Transporte"));
		
		departamentos.addAll(departamentos1);
		
		System.out.println("\n----------------");
		
		System.out.println(departamentos.size());
		
		for(Departamento departamento: departamentos) {
			System.out.print(departamento.getNome() + " | ");
		}
		
	}
	
}
