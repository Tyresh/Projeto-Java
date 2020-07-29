package model.exceptions;
// Criei essa exceção pra tratar erros no cpf
public class CpfInvalidoException extends Exception {
	public CpfInvalidoException(String msg) {
		super(msg);
	}
}
