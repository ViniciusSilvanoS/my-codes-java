package classe;

public class DesafioDataTeste {
	
	public static void main(String[] args) {
		DesafioData d1 = new DesafioData();
		d1.dia = 10;
		d1.mes = 10;
		d1.ano = 1992;
		
		DesafioData d2 = new DesafioData();
		d2.dia = 15;
		d2.mes = 12;
		d2.ano = 1968;
		
		System.out.println(d1.dataCompleta());
		System.out.println(d2.dataCompleta());
	}
	
}
