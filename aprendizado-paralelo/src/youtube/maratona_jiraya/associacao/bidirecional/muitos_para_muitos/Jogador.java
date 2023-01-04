package youtube.maratona_jiraya.associacao.bidirecional.muitos_para_muitos;

public class Jogador {

	private String nome;
	private Time time;
	
	public void imprime() {
		System.out.print(this.nome);
		if(time != null) {
			System.out.println(": " + time.getNome());
		}else {
			System.out.println();
		}
	}
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
}
