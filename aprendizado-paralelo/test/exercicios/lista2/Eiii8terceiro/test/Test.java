package exercicios.lista2.Eiii8terceiro.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import exercicios.lista2.Eiii8terceiro.Aplicacao;
import exercicios.lista2.Eiii8terceiro.modelo.Empresa;

class Test {

	private Aplicacao aplicacao;
//	List<Empresa> empresas = new ArrayList<>();
	

	
	@org.junit.jupiter.api.Test
	void testeCadastroCorreto() {
		
		Empresa e1 = new Empresa("Primeiro Teste", "111");
		Empresa e2 = new Empresa("Segundo Teste", "22222222222222");
		
		aplicacao.empresas.add(e1);
		aplicacao.empresas.add(e2);
		
		String cnpj = "333333333333333";
		
		assertFalse(aplicacao.isCnpjCadastrado(cnpj));
		
	}
	

	@org.junit.jupiter.api.Test
	void testeCadastroErro() {
		
		Empresa e1 = new Empresa("Primeiro Teste", "111");
		Empresa e2 = new Empresa("Segundo Teste", "22222222222222");
		
		aplicacao.empresas.add(e1);
		aplicacao.empresas.add(e2);
		
		String cnpj = "22222222222222";
		
		assertTrue(aplicacao.isCnpjCadastrado(cnpj));
		
	}
	
	
}
