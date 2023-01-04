package controle_remoto;

public interface Controlador {

	public void ligaDesliga(); // ligar e desligar
	public String statusTV(); // abrirMenu e fecharMenu ou abrirFecharMenu
	public void maisVolume();
	public void menosVolume();
	public void tocaMuta(); // ligarMudo e desligarMudo
	public void playPause(); //play e pause
	
}
