package exemplos.funcoesdojava.bipredicate;

import java.util.function.BiPredicate;

/**
 * 
 * Pode ser substituida por {@link BiPredicate} 
 *
 */
@FunctionalInterface
public interface ValidaPagamento {

	boolean isValid(double valorCompra, double valorPagamento);

}