package AST;

import java.util.NoSuchElementException;

import parameters.ModeManager;
import stack.Stack;
import token.Instruction;
import token.Num;
import token.Op;
import token.Token;
import token.Value;

public class CalculInt<E extends Value> implements AST {

	public void parse(Token token) throws OperationException {

		if (Stack.size() >= 2) {
			try {
				E value1 = (E) Stack.retrieveValue();
				E value2 = (E) Stack.retrieveValue();
				this.proceedOperation(value1, value2, (Op) token);
			} catch (NoSuchElementException e) {
				throw new ArgumentException((Op) token);
			}
		} else {
			throw new ArgumentException((Op) token);
		}

	}

	private void proceedOperation(E num1, E num2, Op op) {
		double result = 0;
		switch (op) {
		case PLUS:
			result = num1.getValue() + num2.getValue();
			break;
		case MOINS:
			result = num1.getValue() - num2.getValue();
			break;
		case FOIS:
			result = num1.getValue() * num2.getValue();
			break;
		case DIVISE:
			try {
				result = num1.getValue() / num2.getValue();
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
			}
			break;

		}
		
		if(Instruction.E.equals(ModeManager.instruction)){

			Stack.addElement(new Num((int)result));
		}
		else{
			Stack.addElement(new token.Float((double)result));
		}

	}

}
