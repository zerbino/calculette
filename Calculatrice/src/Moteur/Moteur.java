package Moteur;

import java.io.IOException;

import lexer.UnexistingToken;
import parameters.MemoryException;
import parameters.ModeManager;
import token.Instruction;
import token.Num;
import AST.MyInput;
import AST.NoInputException;
import AST.OperationException;
import AST.UnexpectedType;
import AST.WrongTypeException;

public class Moteur {
	
	public static void main(String[] args) {
		boolean isInput= true;
		do{
			@SuppressWarnings("rawtypes")
			MyInput input; 
			if(Instruction.E.equals(ModeManager.instruction)){
				input = new MyInput<Num>();
			}
			else{
				input = new MyInput<token.Float>();
			}
			
			try {
				input.parse();
			} catch (UnexistingToken | IOException | MemoryException
					| WrongTypeException |UnexpectedType | OperationException e) {
				System.out.println(e.toString());
			} catch (NoInputException e) {
				isInput = false;
			} 
		}while(isInput);
	}

}
