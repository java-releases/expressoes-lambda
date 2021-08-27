package exemplos.semlambda;

import exemplos.comum.ValidaCpf;

public class ValidaCpfImpl implements ValidaCpf {

	@Override
	public boolean isValid(String cpf) {
		return cpf.startsWith("0");
	}

}