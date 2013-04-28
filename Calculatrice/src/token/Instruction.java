package token;

public enum Instruction implements Token {
	E("E"), F("F"), M("M"), R("R");
	
	private String value;

	private Instruction(String value) {
		this.value = value;
	}
	
	public String toString(){
		return this.value;
	}
	
	
	
	
	
	

}
