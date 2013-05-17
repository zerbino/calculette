package parameters;

public class MemoryException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public MemoryException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString(){
		return "No "+this.message+" value registered";
	}

}
