package youtube.gustavo_guanabara.poo09Livro;

public class Livro implements UsoDoLivro {

	private String titulo;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	private Autor autor;
	
	
	public void abrir() {
		this.aberto = true;
		
	}


	public void fechar() {
		
		this.aberto = false;
		
	}


	public void folhear(int p) {
		
		if(this.aberto == false) {
			abrir();
		}
		
		if(p > totPaginas) {
			this.pagAtual = totPaginas;
		}else {
			this.pagAtual = p; 
		}
		
	}


	public void avancarPag() {
		
		if(this.aberto == false) {
			abrir();
		}
		
		this.pagAtual++;
		
	}


	public void voltarPag() {
		if(pagAtual > 1) {
			this.pagAtual--;
		}else {
			this.pagAtual = 0;
			fechar();
		}
		
	}
	
	// -----------------------------------------------------
	

	public String detalhaLivro() {
		return "Titulo: " + titulo + 
				"\nAutor: " + autor.getNome() + 
				"\nTotal de páginas: " + totPaginas + 
				"\nPagina atual: " + pagAtual + 
				"\nAberto: " + aberto + 
				"\nLeitor -> nome: " + leitor.getNome() +
				" | Idade: " + leitor.getIdade() +
				" | Sexo: " + leitor.getSexo() + "\n";
	}


	public Livro(String titulo, Autor autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public int getTotPaginas() {
		return totPaginas;
	}


	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}


	public int getPagAtual() {
		return pagAtual;
	}


	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}


	public boolean isAberto() {
		return aberto;
	}


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public Pessoa getLeitor() {
		return leitor;
	}


	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	
	
	
	
	
}
