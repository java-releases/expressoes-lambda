package exemplos.funcoesdojava.supplier;

import java.util.function.Supplier;

import exemplos.comum.Pessoa;

/**
 * 
 * Pode ser substituida por {@link Supplier}
 *
 */
@FunctionalInterface
public interface PessoaFactory {

	Pessoa get();

}