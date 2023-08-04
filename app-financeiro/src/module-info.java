module app.financeiro {
	
	requires java.base; // Por padrão sempre colocar esse
//	requires app.calculo;
	requires app.api;
	uses br.com.cod3r.app.Calculadora;
	
}