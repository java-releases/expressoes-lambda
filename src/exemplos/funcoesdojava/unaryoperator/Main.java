package exemplos.funcoesdojava.unaryoperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import exemplos.comum.Cachorro;

public class Main {

	static Cachorro tobi = new Cachorro("TÓBI");
	static Cachorro rex = new Cachorro("REX");
	static Cachorro bob = new Cachorro("BOB");
	static Cachorro peludo = new Cachorro("PELUDO");

	static UnaryOperator<Cachorro> buscarIrmaoCachorro = c -> {
		if (c.getNome().startsWith("R")) {
			return peludo;
		} else if (c.getNome().startsWith("T")) {
			return bob;
		}
		return tobi;
	};

	static UnaryOperator<Cachorro> buscarPaiCachorro = c -> {
		if (c.getNome().startsWith("P")) {
			return peludo;
		} else if (c.getNome().startsWith("R")) {
			return bob;
		}
		return rex;
	};

	static Function<Cachorro, Cachorro> buscarCachorroLimpo = c -> bob;
	// static UnaryOperator<Cachorro> buscarFamiliaCachorro =
	// buscarIrmaoCachorro.andThen(null); ??bug API / verificar isso ???

	public static void main(String[] args) {
		System.out.println("Irmao do Rex: " + buscarIrmaoCachorro.apply(rex));
		System.out.println(" Pai do Rex: " + buscarPaiCachorro.apply(rex));
	}

}