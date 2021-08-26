package exemplos.funcoesdojava.predicate;

import java.util.function.Predicate;

public class Main {

	static ValidaValor validaValor = valor -> valor > 0;
	static Predicate<Double> predicate = valor -> valor > 5;

	static Predicate<Double> valorBruto = valor -> valor >= 100;
	static Predicate<Double> valorLiquido = valor -> valor <= 100;
	static Predicate<Double> valorDesconto = valor -> valor <= 10;

	static Predicate<Double> validaVenda = valorBruto.and(valorLiquido).or(valorDesconto);

	public static void main(String[] args) {
		System.out.println(validaValor.validar(0));
		System.out.println(validaValor.validar(1));
		System.out.println();
		System.out.println(valorBruto.test(100.00));
		System.out.println(valorLiquido.test(99.00));
		System.out.println(valorDesconto.test(9.00));
		System.out.println();
		System.out.println(validaVenda.test(100.00));
	}

}