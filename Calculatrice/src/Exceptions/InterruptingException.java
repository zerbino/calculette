package Exceptions;

/**
 * This kind of exception interrupts the calculation and starts a new one.
 * This kind of exception appears when R is called and that no values are recorded for
 * the selected mode (Integer or float)
 * @author Raoul
 *
 */
public class InterruptingException extends Exception {
	
	private String message;

	public InterruptingException(String message) {
		super();
		this.message = message;
	}
	
	public String toString(){
		return "No value is recorded for "+this.message+" mode \n Please start a new calculation";
	}

}
