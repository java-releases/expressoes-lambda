package exemplos.funcoesdojava.supplier;

import java.util.function.Supplier;

/**
 * 
 * Pode ser substituida por {@link Supplier}
 *
 */
@FunctionalInterface
public interface PessoaFactory {

	Pessoa get();

}