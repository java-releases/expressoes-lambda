package exemplos.funcoesdojava.biconsumer;

import java.util.function.BiConsumer;

public class Main {

	static ImpressaoFrase impressaoFrase1 = (msg1, msg2) -> System.out.println(msg1 + " " + msg2);
	static ImpressaoFrase impressaoFrase2 = (msg1, msg2) -> {
		System.out.print(msg1);
		System.out.print(msg2);
	};

	static BiConsumer<String, String> biConsumer1 = (msg1, msg2) -> System.out.println(msg1 + " " + msg2);
	static BiConsumer<String, String> biConsumer2 = System.out::printf;
	static BiConsumer<String, String> biConsumer3 = (a, b) -> {
		System.out.print("biConsumer3 ");
		System.out.print("executado ");
		System.out.print("com sucesso!");
	};
	
	static BiConsumer<String, String> biConsumerCombinado = biConsumer1.andThen(biConsumer2).andThen(biConsumer3);

	public static void main(String[] args) {
		impressaoFrase1.imprimir(null, null);
		impressaoFrase2.imprimir("Olá ", "Mundo");
		System.out.println();
		biConsumerCombinado.accept("frase 1 ", "frase 2");

	}
}