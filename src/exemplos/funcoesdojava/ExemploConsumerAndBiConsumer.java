package exemplos.funcoesdojava;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExemploConsumerAndBiConsumer {

	public static void main(String[] args) {

		Consumer<String> functionPrint = System.out::println;
		Consumer<String> functionPrint2 = x -> System.out.println(x);
		functionPrint.accept("Luciano");
		functionPrint2.accept("Ortiz");

		var map = new HashMap<String, String>();
		BiConsumer<String, String> functionToAddInMap = map::put;
		BiConsumer<String, String> functionToAddInMap2 = (k, v) -> map.put(k, v);
		functionToAddInMap.accept("Nome", "Luciano Ortiz");
		functionToAddInMap2.accept("Email", "lucianoortizsilva@gmail.com");
		System.out.println(map);

	}

}