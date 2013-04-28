package AST;

import java.util.ArrayList;

public class UnexpectedType extends Exception {

	private ArrayList<String> expectedTypes;
	
	public UnexpectedType(ArrayList<String> types){
		expectedTypes = types;
	}
	
	public String toString(){
		String toRet;
		toRet = "Unexpected token: ";
		toRet += expectedTypes.get(0);
		for(int i=1;i<expectedTypes.size();i++){
			if(i == expectedTypes.size()-1){
				toRet += " or "+expectedTypes.get(i);
			}
			else{
				toRet += ", "+expectedTypes.get(i);
			}
		}
		toRet += " expected!";
		
		return toRet;
	}
	
}
