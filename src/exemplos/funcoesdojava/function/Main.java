package exemplos.funcoesdojava.function;

import java.util.function.Function;

import exemplos.comum.Cachorro;
import exemplos.comum.Pessoa;

public class Main {

	static Pessoa luciano = new Pessoa("Luciano");
	static Pessoa mariana = new Pessoa("Mariana");
	static Pessoa lucas = new Pessoa("Lucas");
	static Pessoa desconhecido = new Pessoa("Dono Desconhecido");
	static Pessoa outraPessoa = new Pessoa("Outra Pessoa");
	static Cachorro cachorroDeRua = new Cachorro("CACHORRO DE RUA");
	static Cachorro cachorroCansado = new Cachorro("CACHORRO CANSADO");
	static BuscaDonoCachorro buscaDonoCachorro = cachorro -> luciano;

	static Function<Cachorro, Pessoa> functionBuscaDonoCachorro1 = cachorro -> {
		if (cachorro.getNome().equals("SEM NOME")) {
			return lucas;
		}
		return mariana;
	};
	static Function<Cachorro, Pessoa> functionBuscaDonoCachorro2 = cachorro -> mariana;

	// compose: APLICA UMA FUNCAO EM CIMA DO PARAMETRO DE ENTRADA, E SO DEPOIS CHAMA
	// A FUNCAO functionBuscaDonoCachorro1
	static Function<Cachorro, Pessoa> functionBuscaDonoCachorro3 = functionBuscaDonoCachorro1.compose(c -> {
		if (c.getNome().equals("SEM NOME")) {
			return cachorroDeRua;
		}
		return c;
	});

	// compose: APLICA UMA FUNCAO NO RETORNO DA FUNCAO CHAMADA
	static Function<Cachorro, Pessoa> functionBuscaDonoCachorro4 = functionBuscaDonoCachorro1.andThen(p -> {
		if (p.getNome().equals("Lucas")) {
			return desconhecido;
		}
		return outraPessoa;
	});

	static Function<Cachorro, Pessoa> functionBuscaDonoCachorro5 = functionBuscaDonoCachorro1.andThen(p -> {
		if (p.getNome().equals("LUCAS")) {
			return null;
		}
		return outraPessoa;
	}).compose(c -> {
		if (c == null) {
			return cachorroDeRua;
		}
		return cachorroCansado;
	});

	public static void main(String[] args) {
		// System.out.println(buscaDonoCachorro.buscarDonoDo(new Cachorro("TÓBI")));
		// System.out.println(functionBuscaDonoCachorro1.apply(new Cachorro("REX")));
		// System.out.println(functionBuscaDonoCachorro2.apply(new Cachorro("BOB")));
		// System.out.println(functionBuscaDonoCachorro3.apply(new Cachorro("SEM
		// NOME")));
		// System.out.println(functionBuscaDonoCachorro4.apply(new Cachorro("SEM
		// NOME")));
		System.out.println(functionBuscaDonoCachorro5.apply(new Cachorro("SEM NOME")));
	}

}