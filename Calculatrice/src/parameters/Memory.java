package parameters;

import token.Instruction;
import token.Num;
import token.Value;

/**
 * This class is a representation of the memory of the calculator.
 * @author Raoul
 *
 */

public class Memory {
	
	private static int intRegistered;
	private static boolean isRegisteredInt = false;
	
	private static double floatRegistered;
	private static boolean isRegisteredFloat = false;
	
	private static void remember(int intValue){
		isRegisteredInt = true;
		intRegistered = intValue;
	}
	
	private static void remember(Double value){
		isRegisteredFloat = true;
		floatRegistered = value;
	}
	
	public static void remember(Value value){
		
		if(Instruction.E.equals(ModeManager.instruction)){
			remember((int)((Num)value).getValue());
		}
		else{
			remember(((token.Float)value).getValue());
		}
	
	}
	
	public static Value retourne() throws MemoryException{
		if(Instruction.E.equals(ModeManager.instruction)){
			return new Num(retourneInt());
			
		}
		else{
			return new token.Float(retourneDouble());
		}
	}
	
	private static int retourneInt() throws MemoryException{
		if(isRegisteredInt){
			return intRegistered;
		}
		else{
			throw new MemoryException("int");
		}
	}
	
	private static double retourneDouble() throws MemoryException{
		if(isRegisteredFloat){
			return floatRegistered;
		}
		else{
			throw new MemoryException("float");
		}
	}

}
