package exemplos.funcoesdojava.supplier;

import java.util.function.Supplier;

import exemplos.Pessoa;

public class Main {

	static PessoaFactory pessoaFactory = () -> new Pessoa("Luciano");
	static Supplier<Pessoa> supplier = () -> new Pessoa("Luciano Ortiz");
	static Supplier<Pessoa> supplier2 = () -> null;

	public static void main(String[] args) {
		Pessoa p = pessoaFactory.get();
		System.out.println(p);
		Pessoa p2 = supplier.get();
		System.out.println(p2);
		Pessoa p3 = supplier2.get();
		System.out.println(p3);
	}

}