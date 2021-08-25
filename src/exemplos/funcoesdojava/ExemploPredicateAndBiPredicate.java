package exemplos.funcoesdojava;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ExemploPredicateAndBiPredicate {

	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));

		// Usando metodo default "AND"
		Predicate<String> luciano = nome -> nome.contains("LUCIANO");
		Predicate<String> ortiz = sobrenome -> sobrenome.contains("ORTIZ");
		Predicate<String> nomeSobrenome = s -> s.contains("LUCIANO") && s.contains("ORTIZ");
		Predicate<String> nomeSobrenomeMelhorado = luciano.and(ortiz);
		Predicate<String> nomeSobrenomeOutro = luciano.and(ortiz.negate());
		System.out.println("contains nomeSobrenome: " + nomeSobrenome.test("LUCIANOORTIZ"));
		System.out.println("contains nomeSobrenomeMelhorado: " + nomeSobrenomeMelhorado.test("LUCIANO ORTIZ"));
		System.out.println("contains nome e n�o sobrenome: " + nomeSobrenomeOutro.test("LUCIANO ORTIZ"));
		////////////////////////////////////////////////////////////

		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
		System.out.println(b1.test("Ortiz", "Outro"));
		System.out.println(b2.test("Luciano", "Lu"));
	}

}