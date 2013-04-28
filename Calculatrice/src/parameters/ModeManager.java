package parameters;

import token.Float;
import token.Instruction;
import token.Num;
import token.Value;

public class ModeManager {
	
	static{
		// Valeur par défaut : mode entier
		instruction = Instruction.E;
	}
	
	public static Instruction instruction;
	
	public static boolean rightType(Value value){
		return (value instanceof Num && instruction.equals(Instruction.E)) ||
				(value instanceof Float && instruction.equals(Instruction.F));
	}
	
	

}
