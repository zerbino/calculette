package AST;

import java.io.IOException;
import java.rmi.UnexpectedException;
import java.util.ArrayList;

import lexer.Lexer;
import lexer.UnexistingToken;
import parameters.ModeManager;
import token.Instruction;
import token.Num;
import token.Token;
import token.Value;

public class BaseInt<E extends Value> implements AST {
	
	private E leInt;
	
	
	public void parse() throws UnexistingToken, IOException, UnexpectedType{
		Token token = Lexer.getToken();
		this.parse(token);
		
	}
	
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
