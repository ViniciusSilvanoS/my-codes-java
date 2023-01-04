package youtube.robson_medeiros.composicao;

// https://www.youtube.com/watch?v=kaOZJfNhHgQ&ab_channel=RobsonMedeiros

public class Programa {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		Endereco enderecoFuncionario1 = new Endereco("Rua um", 80, "Bairro de Minuto", "Cidade do Teste", "PE", "50.000-000");
		Endereco enderecoFuncionario2 = new Endereco("Rua dois", 99, "Bairro de Três", "Nova Cidade", "PE", "50.000-000");
		
		funcionario1.setEndereco(enderecoFuncionario1);
		funcionario2.setEndereco(enderecoFuncionario2);
		
		funcionario1.setNome("Robson Medeiros");
		funcionario1.setSalario(1500.00f);
		
		funcionario2.setNome("Wagner Medeiros");
		funcionario2.setSalario(2000.00f);
		
		System.out.println("O nome do funcionário1 é " + funcionario1.getNome());
		System.out.println("O salario do funcionario1 é " + funcionario1.getSalario());
		
		System.out.println("O nome do funcionário2 é " + funcionario2.getNome());
		System.out.println("O salario do funcionario2 é " + funcionario2.getSalario());
		
		
	}
	
}
