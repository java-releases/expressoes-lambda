package exemplos.comlambda;

import exemplos.comum.ValidaCpf;

public class Exemplo02 {

	private String valorSecreto;

	public static void main(String[] args) {
		Exemplo02 main = new Exemplo02();
		System.out.println(main.cpfIsValid("123456"));
	}

	public boolean cpfIsValid(String valor) {
		valorSecreto = "11";
		var outroValorSecreto = "33";
		// outroValorSecreto = "33"; NAO COMPILA
		ValidaCpf validaCpf8 = cpf -> (valorSecreto + outroValorSecreto).length() > 1;
		return validaCpf8.isValid(valor);
	}

}