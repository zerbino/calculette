package AST;

import token.Instruction;

public class WrongTypeException extends Exception {
	
	private Instruction message;

	public WrongTypeException(Instruction message) {
		super();
		this.message = message;
	}
	
	public String toString(){
		return "Wrong type : "+this.message.toString()+" expected";
	}

}
