package youtube.maratona_jiraya.associacao.bidirecional.muitos_para_muitos;

public class Time {
	
	private String nome;
	private Jogador[] jogadores;
	
	
	
	public Time(String nome, Jogador[] jogadores) {
		super();
		this.nome = nome;
		this.jogadores = jogadores;
	}

	public Time(String nome) {
		super();
		this.nome = nome;
	}
	
	// ----------------------------
	
	public void imprime() {
		System.out.println(this.nome);
		if(jogadores != null) {
			for(Jogador jogador: jogadores) {
				System.out.print(jogador.getNome() + " | ");
			}
		}
	}
	
	// ----------------------------
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
	
	
	
}
