package exemplos.funcoesdojava.function;

import exemplos.Cachorro;
import exemplos.Pessoa;

@FunctionalInterface
public interface BuscaDonoCachorro {

	Pessoa buscarDonoDo(Cachorro cachorro);
	
}