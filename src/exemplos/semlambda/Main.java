package exemplos.semlambda;

import exemplos.ValidaCpf;

public class Main {

	public static void main(String[] args) {
		final ValidaCpf validaCpf = new ValidaCpfImpl();
		final boolean isValid = validaCpf.isValid("0");
		System.out.println(isValid);

		final ValidaCpfImpl validaCpfImpl = new ValidaCpfImpl();
		final boolean isValid2 = validaCpfImpl.isValid("10");
		System.out.println(isValid2);
	}

}