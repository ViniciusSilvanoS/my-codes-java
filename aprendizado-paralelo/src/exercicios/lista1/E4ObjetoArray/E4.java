package exercicios.lista1.E4ObjetoArray;

public class E4 {

	private int id;
	private double valor;
	private int quantidade;
	
	E4(int id){
		this.id = id;
	}
	
	double total() {
		return valor * quantidade;
	}
	
	double totalIPI(float porcentIPI) {
		return (valor * quantidade) * porcentIPI;
	}
	
	public int getId() {
		return id;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Foram com ";
	}
	
	
}
