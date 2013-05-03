package AST;

import token.Op;

public class ArgumentException extends OperationException {
	
	private Op op;
	
	public ArgumentException(Op op){
		this.op = op;
	}
	
	public String toString(){
		return "illegal attempt to perform operation "+op.toString()+" (wrong number of argument)";
	}

}
