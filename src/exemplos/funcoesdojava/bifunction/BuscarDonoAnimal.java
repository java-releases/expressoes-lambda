package exemplos.funcoesdojava.bifunction;

import exemplos.comum.Cachorro;
import exemplos.comum.Pessoa;

@FunctionalInterface
public interface BuscarDonoAnimal {

	Pessoa getDonoDe(Cachorro c1, Cachorro c2);

}