package exemplos.funcoesdojava.predicate;

import java.util.function.Predicate;

/**
 * 
 * Pode ser substiuida por {@link Predicate}
 *
 */
@FunctionalInterface
public interface ValidaValor {

	boolean validar(double valor);

}