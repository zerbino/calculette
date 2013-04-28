package AST;

import java.io.IOException;

import lexer.Lexer;
import lexer.UnexistingToken;
import token.Num;
import token.Token;
import Stack.Stack;

public class CalculInt implements AST {
	
	public void parse(){
		
		Token firstToken;
		try {
			firstToken = Lexer.getToken();
			
			if(firstToken instanceof Num){
				BaseInt baseInt = new BaseInt();
				baseInt.parse(firstToken);
			}
		} catch (UnexistingToken | IOException e) {
			System.out.println(e.toString());
		}
		
		
	}

}
