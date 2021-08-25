package exemplos;

@FunctionalInterface
public interface ValidaCpf {

	public abstract boolean isValid(String cpf);

}