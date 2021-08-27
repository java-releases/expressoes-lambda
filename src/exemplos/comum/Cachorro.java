package exemplos.comum;

public class Cachorro {

	private String nome;

	public Cachorro(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + "]";
	}

}