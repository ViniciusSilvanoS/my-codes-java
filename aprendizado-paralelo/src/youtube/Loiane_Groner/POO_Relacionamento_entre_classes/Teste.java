package youtube.Loiane_Groner.POO_Relacionamento_entre_classes;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
//		contato.setEndereco("Kings Landing");
//		contato.setTelefone("11 99999-9999");
		
		//Criando endereco
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua Game of Thrones");
		endereco.setNumero("n/a");
		endereco.setComplemento("-");
		endereco.setCidade("Kings Landing");
		endereco.setEstado("RS");
		endereco.setCep("999999999");
		
		contato.setEndereco(endereco);
		
		//relacionamento tem-um telefone
		Telefone tel = new Telefone();
		tel.setTipo("Residencial");
		tel.setDdd("51");
		tel.setNumero("91234-5678");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Residencial");
		tel2.setDdd("51");
		tel2.setNumero("98888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
//		contato.setTelefone(tel);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
//		System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
		
	}
	
}
