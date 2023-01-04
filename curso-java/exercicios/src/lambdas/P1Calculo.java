package lambdas;

@FunctionalInterface
public interface P1Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
}
