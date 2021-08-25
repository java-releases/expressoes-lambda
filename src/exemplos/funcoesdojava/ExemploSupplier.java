package exemplos.funcoesdojava;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ExemploSupplier {

	public static void main(String[] args) {

		Supplier<LocalDate> d1 = LocalDate::now;
		Supplier<LocalDate> d2 = () -> LocalDate.now();

		System.out.println("Data Atual  I: " + d1.get());
		System.out.println("Data Atual II: " + d2.get());

	}

}