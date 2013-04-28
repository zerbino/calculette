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
	
	
	public void parse() throws UnexistingToken, IOException{
		Token token = Lexer.getToken();
		this.parse(token);
		
	}
	
	public void parse(Token token){					

			boolean isInt = token instanceof Num && ModeManager.rightType((Num)token);
			boolean isRetour = Instruction.R.equals(token);
			
			if(isInt){
				leInt = (Num)token;
			}
			else{
				if(isRetour){
					try {
						leInt = new Num(Memory.retourneInt());
					} catch (MemoryException e) {
						System.out.println(e.toString());
					}
				}
				else{
					ArrayList<String> expectedTypes = new ArrayList<String>();
					expectedTypes.add("Integer");
					expectedTypes.add("R");
				}
			}		
		
	}

	public Num getLeInt() {
		return leInt;
	}



}
