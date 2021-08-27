package exemplos.funcoesdojava.binaryOperator;

import java.util.function.BinaryOperator;

import exemplos.comum.Pessoa;

public class Main {

	static Pessoa luciano = new Pessoa("Luciano");
	static Pessoa mariana = new Pessoa("Mariana");
	static Pessoa lucas = new Pessoa("Lucas");
	static Pessoa desconhecido = new Pessoa("Dono Desconhecido");
	static Pessoa outraPessoa = new Pessoa("Outra Pessoa");

	static BinaryOperator<Pessoa> buscarPessoaResponsavelPor = (p1, p2) -> outraPessoa;

	public static void main(String[] args) {
		System.out.println(buscarPessoaResponsavelPor.apply(luciano, mariana));
	}

}