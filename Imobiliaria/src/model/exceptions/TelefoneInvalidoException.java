package model.exceptions;
// Criei essa exceção pra tratar erros no telefone
public class TelefoneInvalidoException extends Exception {
	public TelefoneInvalidoException(String msg) {
		super(msg);
	}
}
