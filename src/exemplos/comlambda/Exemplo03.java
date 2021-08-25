package exemplos.comlambda;

import exemplos.ValidaCpf;

public class Exemplo03 {

	public static void main(String[] args) {
		imprimirValidacaoCPF(cpf -> cpf.startsWith("123"), "123456789");
		imprimirValidacaoCPF((var cpf) -> cpf.endsWith("789"), "123456789");
		imprimirValidacaoCPF((String cpf) -> cpf.contains("6"), "123456");
		imprimirValidacaoCPF(cpf -> {return cpf.startsWith("123");}, "0123456789");
	}
	
	static void imprimirValidacaoCPF(ValidaCpf validaCpf, String cpf) {
		boolean isValid = validaCpf.isValid(cpf);
		if (isValid) {
			System.out.println("CPF VALIDO:   " + cpf);
		} else {
			System.out.println("CPF INVALIDO: " + cpf);
		}
	}
	
}