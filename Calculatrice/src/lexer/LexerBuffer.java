package lexer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import AST.NoInputException;

import token.Token;


public class LexerBuffer extends Lexer{
	
	private static BufferedReader input = new BufferedReader(new InputStreamReader(
			System.in));
	
		
	@Override
	public String getInputString() throws IOException {
		return input.readLine();
	}
	
	public static Token getToken() throws UnexistingToken, IOException, NoInputException{
		return new LexerBuffer().nextToken();
	}
	
	
	
	

}
