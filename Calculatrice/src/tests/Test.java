package tests;

import java.io.IOException;
import java.util.ArrayList;

import lexer.UnexistingToken;
import AST.NoInputException;
import AST.UnexpectedType;

import token.Num;
import token.Value;

public class Test {

	public static void main(String[] args) {

		Test test = new Test();
		try {
			test.test28();
		} catch (UnexistingToken e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnexpectedType e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test28() throws UnexistingToken, IOException, UnexpectedType, NoInputException {

	    if (true) System.out.printf("%nRandoopTest0.test28");


	    AST.Base var0 = new AST.Base();
	    var0.parse();
	    token.Float var3 = new token.Float((-1.0d));
	    boolean var4 = parameters.ModeManager.rightType((token.Value)var3);
	    // The following exception was thrown during execution.
	    // This behavior will recorded for regression testing.
	    try {
	      var0.parse((token.Token)var3);
	    } catch (AST.UnexpectedType e) {
	      // Expected exception.
	    	e.printStackTrace();
	    }
	    
	    
	    // Regression assertion (captures the current behavior of the code)

	  }

}
