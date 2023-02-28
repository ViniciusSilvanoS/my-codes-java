package exercicios.lista2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
//		String minhaData = "20/02/2000";
//		
//		
//		try {
//			Date minhaDataEmDate = sdf1.parse(minhaData);
//			
//			System.out.println(sdf1.format(minhaDataEmDate));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		List<Integer> valores = Arrays.asList(1, 5, 8, 120, 85);
		
		Collections.sort(valores);
		
		for (Integer integer : valores) {
			System.out.println(integer);
		}
		
		
	}
	
}
