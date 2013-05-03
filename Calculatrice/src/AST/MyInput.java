package AST;

import java.io.IOException;

import lexer.Lexer;
import lexer.UnexistingToken;
import parameters.Memory;
import parameters.MemoryException;
import parameters.ModeManager;
import stack.Stack;
import token.Instruction;
import token.Num;
import token.Op;
import token.Token;
import token.Value;

public class MyInput<E extends Value> implements AST {
	
	public void parse() throws UnexistingToken, IOException, MemoryException, WrongTypeException, OperationException, UnexpectedType{
		
		Token token = Lexer.getToken();
		
		if(Instruction.E.equals(token) || Instruction.F.equals(token)){
			ModeManager.setInstruction((Instruction)token);
		}
		else{
			if(Instruction.M.equals(token)){
				Memory.remember(Stack.retrieveValue());
				
			}
			else{
				if(Instruction.F.equals(token)){
					ModeManager.setInstruction((Instruction)token);
				}
				else{
					if(Instruction.R.equals(token)){
						BaseInt<E> baseInt = new BaseInt<E>();
						baseInt.parse(Memory.retourne());
					}
					else{
						if(token instanceof Value){
								BaseInt<E> baseInt = new BaseInt<E>();
								baseInt.parse(token);
							
							
						}
						else{
							if(token instanceof Op){
									CalculInt<E> cal = new CalculInt<E>();
									cal.parse(token);
								
							}
						}
					}
				}
			}
		}
		
		
		
		
	}

}
