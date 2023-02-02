package youtube.Loiane_Groner.aula87Calendar;

import java.util.Calendar;

public class ACalendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance(); // singleton
		
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
