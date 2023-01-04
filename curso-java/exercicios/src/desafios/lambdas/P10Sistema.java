package desafios.lambdas;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class P10Sistema {


	public static void main(String[] args) {
		
		Function<P10Produto, Double> precoComDesconto = produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? (valor * 1.085) : valor;
		
		UnaryOperator<Double> frete = valor -> valor >= 300 ? (valor + 100) : (valor + 50);
		
		UnaryOperator<Double> arredonda = valor ->{
//			valor = Double.parseDouble(String.format("%.2f", valor));
			
			DecimalFormat dfmt = new DecimalFormat("0.00");
			String format = dfmt.format(valor);
			valor = Double.parseDouble(format);
			
			return valor;
		};
		
		Function<Double, String> formata = valor -> {
			Locale localeBR = new Locale("pt","BR");
			
			NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
			String format = dinheiro.format(valor);
			
			return format;
		};
		
		
		P10Produto p = new P10Produto("iPad", 3235.89, 0.13);
		
		String precoFinal = precoComDesconto.andThen(impostoMunicipal).andThen(frete).andThen(arredonda).andThen(formata).apply(p);
		System.out.println("O preco final é: " + precoFinal);
		
	}
	
}

/*
 * 1. A partir do produto calcular o preço real (com desconto)
 * 2. Imposto Municipal: >= 2500 (8,5) /  < 2500 (Isento)
 * 3. Frete: >= 3000 (100) / < 3000 (50)
 * 4. Arredondar: Deixar dias casas decimais
 * 5. Formatar: R$1234,56
 */
