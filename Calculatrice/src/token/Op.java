package token;

public enum Op implements Token{

	PLUS("+"), MOINS("-"), DIVISE("/"), FOIS("*");
	private String value;
	
	private Op(String value){
		this.value = value;
	}
	
	@Override
	public String toString(){
		return this.value;
	}
}
