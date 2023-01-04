package youtube.gustavo_guanabara.poo09Livro;

public class Sistema {
	public static void main(String[] args) {
		// criar classe autor e ligar ao seu livro
	
		Pessoa[] p = new Pessoa[2];
		Autor[] a = new Autor[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("João", 25, 'm');
		p[1] = new Pessoa("Maria", 22, 'f');
		
		a[0] = new Autor("Eric Freeman");
		a[1] = new Autor("Kathy Sierra");
		
		l[0] = new Livro("Head first Java", a[1], 1629, p[0]);
		l[1] = new Livro("Head first JavaScript", a[0], 1105, p[1]);
		l[2] = new Livro("Design Patterns", a[0], 669, p[0]);
		
		System.out.println(p[0].detalhaPessoa());
		
		System.out.println(l[1].detalhaLivro());
		
		l[1].folhear(200);
		l[1].avancarPag();
		l[1].avancarPag();
		p[1].fazAniversario();
		System.out.println(l[1].detalhaLivro());
		
		l[1].fechar();
		System.out.println(l[1].detalhaLivro());
		
	}
}
