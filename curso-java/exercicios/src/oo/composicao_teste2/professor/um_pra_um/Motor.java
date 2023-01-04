package oo.composicao_teste2.professor.um_pra_um;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
	
}
