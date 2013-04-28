package token;


public class Num implements Token, Value{
	
	protected int num;

	public Num(int num) {
		super();
		this.num = num;
	}

	public int getValue(){
		return this.num;
	}
	
	public String toString(){
		return ""+this.num;
	}
	

}
