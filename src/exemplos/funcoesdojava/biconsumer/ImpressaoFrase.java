package exemplos.funcoesdojava.biconsumer;

import java.util.function.BiConsumer;

/**
 * 
 * Pode ser substituida por {@link BiConsumer}
 *
 */
@FunctionalInterface
public interface ImpressaoFrase {

	void imprimir(String mensagem1, String mensagem2);

}