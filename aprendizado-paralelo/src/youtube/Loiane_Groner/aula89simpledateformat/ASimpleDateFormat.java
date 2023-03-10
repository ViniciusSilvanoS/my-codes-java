package youtube.Loiane_Groner.aula89simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class ASimpleDateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a z");

		Calendar data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
		
		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		System.out.println(sdf.format(hoje));
		
		// Transformar String para data
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		
		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);
			
			System.out.println(minhaDataEmDate);
			
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}
