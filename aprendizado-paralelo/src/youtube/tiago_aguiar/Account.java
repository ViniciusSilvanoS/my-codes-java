package youtube.tiago_aguiar;

public class Account {

	private String ag;
	private String cc;
	private String name;
	private double saldo;
	private boolean aberto;
	
	public static final int MAX_LENGTH = 12;

	// --------------------
	
//	sacar();
	
	// --------------------
	
	public Account(String ag, String cc, String name) {
		super();
		this.ag = ag;
		this.cc = cc;
		setName(name);
	}
	public String getAg() {
		return ag;
	}
	public void setAg(String ag) {
		this.ag = ag;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() > MAX_LENGTH) {
			this.name = name.substring(0, MAX_LENGTH);
		}else {
			this.name = name;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
	
	
	
}
