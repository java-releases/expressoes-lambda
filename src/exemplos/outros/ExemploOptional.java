package exemplos.outros;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExemploOptional {

	public static void main(String[] args) throws Throwable {

		Optional<Double> optComValor = Optional.of(10.00);
		System.out.println("get(): " + optComValor.get());

		Consumer<Double> consumer = valor -> System.out.println(valor);
		System.out.print("ifPresent(null): ");
		optComValor.ifPresent(consumer);

		System.out.println("isPresent(): " + optComValor.isPresent());
		System.out.println("orElse(50.00): " + optComValor.orElse(50.00));
		Supplier<Double> supplier = () -> Double.valueOf(100);
		System.out.println("orElseGet(supplier): " + optComValor.orElseGet(supplier));
		System.out.println("orElseThrow(): " + optComValor.orElseThrow());

		Supplier<Throwable> supplierOutro = Exception::new;
		optComValor.orElseThrow(supplierOutro);
		System.out.println("orElseThrow(....): " + supplierOutro);

		Optional<Double> optSemValor = Optional.empty();
		System.out.println(optSemValor.get());

	}

}