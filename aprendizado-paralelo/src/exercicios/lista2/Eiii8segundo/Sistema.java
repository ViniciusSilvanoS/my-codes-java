package exercicios.lista2.Eiii8segundo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	public static void main(String[] args) {

		Departamento dep1 = new Departamento("RH");
		
		List<Empresa> empresas = new ArrayList<>();
		empresas.add(new Empresa("Zaffari", "1234"));
		
		System.out.println(empresas.toString());
		
//		Departamento dep2 = new Departamento("Produção");
//		Departamento dep3 = new Departamento("TI");
		
		
		empresas.get(0).addDep(dep1);
//		empresas.get(0).setDepartamentos(dep2);
//		empresas.get(0).setDepartamentos(dep3);
		
		System.out.println(empresas.toString());
		
	}
	
}
