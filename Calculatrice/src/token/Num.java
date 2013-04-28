package token;


public class Num implements Token{
	
	protected int num;

	public Num(int num) {
		super();
		this.num = num;
	}

	public int getValue(){
		return this.num;
	}
	

}
