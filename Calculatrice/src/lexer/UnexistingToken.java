package lexer;

public class UnexistingToken extends InputException{
	
	private String message;

	public UnexistingToken(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "The token you entered ("+this.message+") doesn't match any token of the grammar";
	}
	
	 

}
