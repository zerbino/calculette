package lexer;

import java.io.IOException;

import AST.NoInputException;

import token.Token;

public class TestLexer extends Lexer{
	
	private String[] inputs;
	private int index=0;
	private static TestLexer testLexer = new TestLexer("1\r2\r3\r+\r-");
	
	public TestLexer(String input){
		inputs = input.split("\r");
		
	}

	@Override
	protected String getInputString() throws IOException {
		if(index>=inputs.length){
			return null;
		}
		String toRet = inputs[index];
		index++;
		return toRet;
	}
	
	public static Token getToken() throws UnexistingToken, IOException, NoInputException{
		return testLexer.nextToken();
	}

}
