package exemplos.comlambda;

import java.util.ArrayList;
import java.util.List;

public class Exemplo04 {

	static List<String> nomes = new ArrayList<>();

	static {
		nomes.add("ORTIZ");
		nomes.add("VANESSA");
		nomes.add("KIRINUS");
		nomes.add("MARLON");
		nomes.add("UILSON");
		nomes.add("PEDRO");
		nomes.add("ANTONIO");
		nomes.add("RAFAEL");
	}

	public static void main(String[] args) {
		System.out.println(nomes);
		
		nomes.sort((a, b) -> a.compareTo(b));
		
		System.out.println(nomes);
	}
	
}