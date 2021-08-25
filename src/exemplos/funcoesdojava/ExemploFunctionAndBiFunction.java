package exemplos.funcoesdojava;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ExemploFunctionAndBiFunction {

	public static void main(String[] args) {

		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		System.out.println(f1.apply("Luciano"));
		System.out.println(f2.apply("Ortiz"));

		BiFunction<String, String, Integer> f3 = (texto1, texto2) -> (texto1 + texto2).length();
		BiFunction<String, String, String> f4 = String::concat;
		System.out.println(f3.apply("Luciano", "Ortiz"));
		System.out.println(f4.apply("Luciano", " Ortiz"));
	}

}