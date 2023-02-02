package youtube.Loiane_Groner.aula88gregorian_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AGregorianCalendar {

	public static void main(String[] args) {
		
		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();
		
		imprimirData(hoje);
		
		System.out.println(hoje.isLeapYear(2017));
		
		GregorianCalendar hoje2 = new GregorianCalendar(2017, 0, 1); // Criando uma data definida manualmente
		
		imprimirData(hoje2);
	}
	
	private static void imprimirData(Calendar hoje) {
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é: %d/%02d/%02d %d:%d:%d", ano, (mes + 1), dia, hora, minutos, segundos);
		
		hoje.add(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
	}
	
}
