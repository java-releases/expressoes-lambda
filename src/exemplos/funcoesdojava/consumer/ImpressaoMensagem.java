package exemplos.funcoesdojava.consumer;

import java.util.function.Consumer;

/**
 * 
 * Pode ser substituida por {@link Consumer}
 *
 */
@FunctionalInterface
public interface ImpressaoMensagem {

	void imprimir(String mensagem);

}