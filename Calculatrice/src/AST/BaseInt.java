package AST;

import java.io.IOException;
import java.util.ArrayList;

import lexer.Lexer;
import lexer.UnexistingToken;
import parameters.Memory;
import parameters.MemoryException;
import parameters.ModeManager;
import token.Instruction;
import token.Num;
import token.Token;

public class BaseInt implements AST {
	
	private Num leInt;
	
	public void parse() throws MemoryException{
		
		boolean askAgain = false;
		
		
		do{
			
			
		try {
			Token token = Lexer.getToken();
			boolean isInt = token instanceof Num && ModeManager.rightType((Num)token);
			boolean isRetour = Instruction.R.equals(token);
			
			if(isInt){
				leInt = (Num)token;
			}
			else{
				if(isRetour){
					leInt = new Num(Memory.retourneInt());
				}
				else{
					ArrayList<String> expectedTypes = new ArrayList<String>();
					expectedTypes.add("Integer");
					expectedTypes.add("R");
					askAgain = true;
				}
			}
		} catch (UnexistingToken | IOException e) {
			System.out.println(e.toString());
			askAgain = true;
		}
		
		
		}while(askAgain);
	}

}
