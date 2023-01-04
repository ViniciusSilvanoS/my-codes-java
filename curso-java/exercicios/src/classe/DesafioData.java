package classe;

public class DesafioData {
	
	int dia, mes, ano;
	
	String dataCompleta () {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
