package exceptions;

public class ValorInvalido extends Exception{
	public String getMessage() {
		return "Somente números são aceitos neste campo!";
	}

}
