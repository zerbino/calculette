package Stack;

import java.util.LinkedList;

import token.Value;

public class Stack {

	private LinkedList<Value> myStackQueue;
	private static Stack myStack = null;

	private Stack() {
		super();
		this.myStackQueue = new LinkedList<>();
	}
	
	private static Stack getInstance(){
		
		if(myStack == null){
			myStack = new Stack();
		}
		
		return myStack;
	}
	
	private LinkedList<Value> getStackQueue(){
		return this.myStackQueue;
	}
	
	public static void addElement(Value value){
		getInstance().getStackQueue().addLast(value);
	}
	
	public static Value retrieveValue(){
		return getInstance().getStackQueue().removeLast();
	}
	
	
	
	
}
