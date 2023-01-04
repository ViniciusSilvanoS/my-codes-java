package Banco;

/* 
 * O programa consiste em criar contas bancária, sendo ela polpança ou corrente
 * O programa fará as validações para poder fechar conta, sacar dinheiro e etc..
 * */

public class Sistema {

	public static void main(String[] args) {
		
		Banco c1 = new Banco(123, "cc", "Roberto");
		Banco c2 = new Banco(567, "cp", "Maria");
		
		c1.abrirConta("cc");
		System.out.println(c1.imprimeSaldo());
		c1.abrirConta("cp");
		c1.depositar(300);
		System.out.println(c1.imprimeSaldo());
		c1.sacar(1000);
		c1.sacar(220);
		System.out.println(c1.imprimeSaldo());
		c1.pagarMensal();
		System.out.println(c1.imprimeSaldo());
		c1.fecharConta();
		c1.sacar(118);
		c1.pagarMensal();
		c1.fecharConta();
		System.out.println(c1.imprimeSaldo());
		
		
		System.out.println("-------------");
		
		c2.sacar(200);
		System.out.println(c2.imprimeSaldo());
		
		c2.fecharConta();
		System.out.println(c2.imprimeSaldo());
		
	}
	
}
