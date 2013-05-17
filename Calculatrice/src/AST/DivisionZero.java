package AST;

public class DivisionZero extends OperationException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString(){
		return "You cannot divide by zero";
	}

}
