package exemplos.funcoesdojava.bipredicate;

import java.util.function.BiPredicate;

public class Main {

	static ValidaPagamento validaPagamento = (valorCompra, valorPagamento) -> valorPagamento >= valorCompra;
	static BiPredicate<Double, Double> biPredicate1 = (valorCompra, valorPagamento) -> valorPagamento.doubleValue() == valorCompra.doubleValue();
	static BiPredicate<Double, Double> biPredicate2 = (valorCompra, valorPagamento) -> valorPagamento.doubleValue() > valorCompra.doubleValue();
	static BiPredicate<Double, Double> biPredicate3 = biPredicate1.or(biPredicate2);

	public static void main(String[] args) {
		System.out.println(validaPagamento.isValid(12.00, 23.75));
		System.out.println(validaPagamento.isValid(214.89, 87.11));
		System.out.println();
		System.out.println(biPredicate1.test(123.45, 63.11));
		System.out.println(biPredicate2.test(11.00, 11.01));
		System.out.println();
		System.out.println(biPredicate3.test(100.00, 99.00));
		System.out.println(biPredicate3.test(100.00, 100.00));
		System.out.println(biPredicate3.test(100.00, 101.00));
	}

}