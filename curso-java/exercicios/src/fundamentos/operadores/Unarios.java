package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); // Quando o operador (++ ou --) vem antes "++a",
		//ele tem mais pressa e executa a função dele e compara antes mesmo que o operador b-- possa ser executado, 
		//isso causo o valor A(1) receber + 1 (ficando A=2) e comparar com o B que ainda não subtraiu (ficando A=2 == B=2)
		
		System.out.println(a);
		System.out.println(b);
	}
	
}
