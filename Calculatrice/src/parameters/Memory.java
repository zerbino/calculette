package parameters;

public class Memory {
	
	private static int intRegistered;
	private static boolean isRegisteredInt = false;
	
	private static double floatRegistered;
	private static boolean isRegisteredFloat = false;
	
	public static void remember(int intValue){
		isRegisteredInt = true;
		intRegistered = intValue;
	}
	
	public static int retourneInt() throws MemoryException{
		if(isRegisteredInt){
			return intRegistered;
		}
		else{
			throw new MemoryException("int");
		}
	}
	
	public static double retourneDouble() throws MemoryException{
		if(isRegisteredFloat){
			return floatRegistered;
		}
		else{
			throw new MemoryException("float");
		}
	}

}
