package exemplos.funcoesdojava.bifunction;

import java.util.function.BiFunction;

import exemplos.comum.Cachorro;
import exemplos.comum.Pessoa;

public class Main {

	static Pessoa luciano = new Pessoa("LUCIANO");
	static Pessoa vanessa = new Pessoa("VANESSA");
	static Pessoa mariana = new Pessoa("MARIANA");
	static Pessoa lucas = new Pessoa("LUCAS");
	static Cachorro tobi = new Cachorro("TÓBI");
	static Cachorro rex = new Cachorro("REX");
	static Cachorro bob = new Cachorro("BOB");
	static Cachorro peludo = new Cachorro("PELUDO");
	static BuscarDonoAnimal buscarDonoAnimal = (tobi, rex) -> luciano;

	static BiFunction<Cachorro, Cachorro, Pessoa> buscarDonoCachorroComSarna = (c1, c2) -> vanessa;
	static BiFunction<Cachorro, Cachorro, Pessoa> buscarDonoCachorroSujo = (c1, c2) -> mariana;
	static BiFunction<Cachorro, Cachorro, Pessoa> buscarUmNovoDonoParaCachorroComProblema = buscarDonoCachorroComSarna
			.andThen(p -> {
				if (p.getNome().equals("VANESSA")) {
					return new Pessoa("DONO NOVO 1");
				}
				return new Pessoa("DONO NOVO 2");
			});

	public static void main(String[] args) {
		System.out.println(buscarDonoAnimal.getDonoDe(tobi, rex));

		final Pessoa donoDoCachorroComSarna = buscarDonoCachorroComSarna.apply(tobi, bob);
		System.out.println(donoDoCachorroComSarna);

		final Pessoa donoCachorroSujo = buscarDonoCachorroSujo.apply(rex, peludo);
		System.out.println(donoCachorroSujo);

		final Pessoa novoDono = buscarUmNovoDonoParaCachorroComProblema.apply(tobi, peludo);
		System.out.println(novoDono);
	}

}