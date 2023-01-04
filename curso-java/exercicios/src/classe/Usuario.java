package classe;

public class Usuario {

	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {
		
		 if(objeto instanceof Usuario) { 
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.nome.equals(this.nome);
			
			return nomeIgual && emailIgual;
		 }else {
			 return false;
		 }
}
	
	// O HashCode irá ser comentado em outra aula
//	@Override
//	public int hashCode() {
//
//		return this.nome.length();
//	}
	
	
}
