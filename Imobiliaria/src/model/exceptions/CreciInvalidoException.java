package model.exceptions;
//Criei essa exceção pra tratar erros no creci
public class CreciInvalidoException extends Exception {
	public CreciInvalidoException(String msg) {
		super(msg);
	}
}
