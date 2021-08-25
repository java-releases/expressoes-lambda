package exemplos.funcoesdojava;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExemploConsumerAndBiConsumer {

	public static void main(String[] args) {

		Consumer<String> consumer1 = System.out::println;
		Consumer<String> consumer2 = x -> System.out.println(x);
		consumer1.accept("Luciano");
		consumer2.accept("Ortiz");

		// Usando metodo default andThen()
		Consumer<String> combined = consumer1.andThen(consumer2);
		combined.accept("Luciano");
		/////////////////////////////////

		var map = new HashMap<String, String>();
		BiConsumer<String, String> functionToAddInMap = map::put;
		BiConsumer<String, String> functionToAddInMap2 = (k, v) -> map.put(k, v);
		functionToAddInMap.accept("Nome", "Luciano Ortiz");
		functionToAddInMap2.accept("Email", "lucianoortizsilva@gmail.com");
		System.out.println(map);

	}

}