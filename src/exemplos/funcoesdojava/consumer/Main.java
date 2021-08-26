package exemplos.funcoesdojava.consumer;

import java.util.function.Consumer;

public class Main {

	static ImpressaoMensagem impressaoMensagem1 = mensagem -> {};
	static ImpressaoMensagem impressaoMensagem2 = mensagem -> System.out.println(mensagem);
	static ImpressaoMensagem impressaoMensagem3 = mensagem -> {System.out.println(mensagem);};
	static ImpressaoMensagem impressaoMensagem4 = System.out::print;
	
	static Consumer<String> consumer1 = mensagem -> {};
	static Consumer<String> consumer2 = mensagem -> System.out.print("Olá ");
	static Consumer<String> consumer3 = mensagem -> {System.out.println("Mundo");};
	static Consumer<String> consumer4 = System.out::print;
	static Consumer<String> consumerSteps = consumer3.andThen(consumer2);
	
	public static void main(String[] args) {
		impressaoMensagem1.imprimir("MENSAGEM 1");
		impressaoMensagem2.imprimir("MENSAGEM 2");
		impressaoMensagem3.imprimir("MENSAGEM 3");
		impressaoMensagem4.imprimir("MENSAGEM 4");
		System.out.println();
		consumer1.accept("CONSUMIDOR 1");
		consumer2.accept(null);
		consumer3.accept(null);
		consumer4.accept("CONSUMIDOR 4");
		System.out.println();
		consumerSteps.accept(null);
		System.out.println();
		imprimir(System.out::printf, msg -> System.out.println("Consumer executado com sucesso!"), "IMPRIMIR: ");
	}
	
	static void imprimir(Consumer<String> consumer1, Consumer<String> consumer2, String mensagem) {
		consumer1.andThen(consumer2).accept(mensagem);
	}
	
}