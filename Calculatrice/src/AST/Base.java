package AST;

/**
 * 
 * Abstract representation of the operand input (can be a number : integer or float, the value
 * corresponding to a "R" call).
 */

import java.io.IOException;
import java.util.ArrayList;

import lexer.Lexer;
import lexer.UnexistingToken;
import parameters.ModeManager;
import token.Instruction;
import token.Token;
import token.Value;

public class Base<E extends Value> implements AST {
	
	private E leInt;
	
	
	public void parse() throws UnexistingToken, IOException, UnexpectedType, NoInputException{
		Token token = Lexer.getToken();
		this.parse(token);
		
	}
	
	@SuppressWarnings("unchecked")
	public void parse(Token token) throws UnexpectedType{					

			boolean isInt = token instanceof Value && ModeManager.rightType((E)token);
			
			if(isInt){
				leInt = (E)token;
				stack.Stack.addElement(leInt);

			}
			else{
				if(Instruction.F.equals(token) || Instruction.E.equals(token)){
					ModeManager.setInstruction((Instruction)token);
				}
				else{
					ArrayList<String> array = new ArrayList<String>();
					array.add("Double or integer");
					array.add("R");
					array.add("M");
					throw new UnexpectedType(array);
				}
				
			}	
			
			
		
	}
	
	



}
