package exemplos.comlambda;

import exemplos.comum.ProcessaArquivo;
import exemplos.comum.ValidaCpf;

public class Exemplo01 {

	static String numeroInvalido = "2";

	static ValidaCpf validaCpf1 = cpf -> true;
	static ValidaCpf validaCpf2 = cpf -> cpf.length() == 5;
	static ValidaCpf validaCpf3 = (String cpf) -> cpf.length() == 5;
	static ValidaCpf validaCpf4 = (var cpf) -> cpf.length() == 5;
	static ValidaCpf validaCpf5 = cpf -> cpf.length() >= 1 && cpf.startsWith("1");

	static ValidaCpf validaCpf6 = cpf -> {
		String numeroValido = "1";
		//
		//
		//
		return cpf.contains(numeroValido) && !cpf.contains(numeroInvalido);
	};
	
	static ProcessaArquivo processa = (final String arquivo) -> {};

	public static void main(String[] args) {
		System.out.println(validaCpf1.isValid("12345"));
		System.out.println(validaCpf2.isValid("1234"));
		System.out.println(validaCpf3.isValid("12345"));
		System.out.println(validaCpf4.isValid("1234"));
		System.out.println(validaCpf5.isValid("12345"));
		System.out.println(validaCpf6.isValid("12345"));
		processa.processar("");
	}

}