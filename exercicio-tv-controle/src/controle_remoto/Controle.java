package controle_remoto;

import javax.swing.JOptionPane;

public class Controle implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;
	private boolean playPause;
	
	public void ligaDesliga() {
		if(!isLigado()) {
			setPlayPause(true);
			setTocando(true);
			setLigado(true);
			JOptionPane.showMessageDialog(null, "Ligou a TV!");
		}else {
			setPlayPause(false);
			setTocando(false);
			setLigado(false);
			JOptionPane.showMessageDialog(null, "Desligou a TV");
		}
	}
	
	public String statusTV() {
		String text = "Ligado: " + isLigado() + "\nMutado: " + isTocando() + "\nPlay: " + isPlayPause() + "\nVolume: " + getVolume();
		return text;
	}
	
	public void maisVolume() {
		if(isLigado()) {
			if(getVolume() <= 95) {
				if(!isTocando()) {
					setTocando(true);
				}
				setVolume(getVolume() + 5);
			}else {
				JOptionPane.showMessageDialog(null, "Já está no volume máximo");
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "TV está desligada");
		}

	}
	
	public void menosVolume() {
		if(isLigado()) {
			if(getVolume() >= 5) {
				if(!isTocando()) {
					setTocando(true);
				}
				setVolume(getVolume() - 5);
			}else {
				JOptionPane.showMessageDialog(null, "O volume já está no mínimo");
			}
		}else {
			JOptionPane.showMessageDialog(null, "TV está desligada");
		}

	}
	
	public void tocaMuta() {
		if(isLigado()) {
			if(isTocando()) {
				setTocando(false);
			}else {
				setTocando(true);
			}
		}else {
			JOptionPane.showMessageDialog(null, "TV está desligada");
		}

	}
	
	public void playPause() {
		if(isLigado()) {
			if(isPlayPause()) {
				setPlayPause(false);
			}else {
				setPlayPause(true);
			}
		}else {
			JOptionPane.showMessageDialog(null, "TV está desligada");
		}

	}

	// ----------------------------------------------------

	public Controle() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;	
		this.playPause = false;
	}
	
	// ----------------------------------------------------
	
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean isLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean isTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	private boolean isPlayPause() {
		return playPause;
	}
	private void setPlayPause(boolean playPause) {
		this.playPause = playPause;
	}
	
}
