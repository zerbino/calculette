package token;

public class Float implements Token, Value{
	
	private double value;

	public Float(double value) {
		this.value = value;
	}
	
	public double getValue(){
		return this.value;
	}
	
	

}
