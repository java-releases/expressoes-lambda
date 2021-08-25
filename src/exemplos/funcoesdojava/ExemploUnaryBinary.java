package exemplos.funcoesdojava;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ExemploUnaryBinary {

	public static void main(String[] args) {

		UnaryOperator<String> f1 = a -> a.concat(" é o meu nome");
		UnaryOperator<String> f2 = String::toUpperCase;
		System.out.println(f1.apply("Luciano"));
		System.out.println(f2.apply("Luciano"));

		BinaryOperator<String> f3 = String::concat;
		BinaryOperator<String> f4 = (nome, sobrenome) -> nome.concat(" " + sobrenome);
		System.out.println(f3.apply("Luciano ", "Ortiz"));
		System.out.println(f4.apply("Luciano", "Ortiz"));
	}

}