package AST;

import token.Op;

/**
 * This exception is thrown when an operation is performed when the number of arguments 
 * is not enough. Ex : 1 +
 * @author Raoul
 *
 */
public class ArgumentException extends OperationException {
	
	private Op op;
	
	public ArgumentException(Op op){
		this.op = op;
	}
	
	public String toString(){
		return "illegal attempt to perform operation "+op.toString()+" (wrong number of argument)";
	}

}
