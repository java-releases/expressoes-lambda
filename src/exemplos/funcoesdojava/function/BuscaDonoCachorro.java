package exemplos.funcoesdojava.function;

import exemplos.comum.Cachorro;
import exemplos.comum.Pessoa;

@FunctionalInterface
public interface BuscaDonoCachorro {

	Pessoa buscarDonoDo(Cachorro cachorro);
	
}