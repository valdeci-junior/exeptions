package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
		// para permitir que eu possa instanciar minha exceção personalizada passando
		//uma mensagem para ela
	}
	

}
