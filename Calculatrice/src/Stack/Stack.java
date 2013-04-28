package Stack;

import java.util.LinkedList;

import parameters.ModeManager;
import token.Float;
import token.Instruction;
import token.Num;
import token.Value;

/**
 * Singleton permettant de modéliser deux piles : l'une pour les entiers, l'une
 * pour les doubles
 * 
 * @author Raoul
 * 
 */
public class Stack {

	/**
	 * On a deux piles : l'une pour les floats, l'autre pour les entiers. Une
	 * HashMap permet de contenir les deux types de piles.
	 */
	private static Stack stack = null;
	
	private MyStack<Num> stackE;
	private MyStack<Float> stackF;

	private Stack() {
		
		super();
		this.stackE = new MyStack<Num>();
		this.stackF = new MyStack<Float>();
		;
		
	}

	private static Stack getInstance() {

		if (stack == null) {
			stack = new Stack();
		}

		return stack;
	}
	
	public void addElement(Float leFloat){
		this.stackF.addElement(leFloat);
	}
	
	public void addElement(Num leNum){
		this.stackE.addElement(leNum);
	}
	
	public Value retrieveValue(){
		if(ModeManager.instruction.equals(Instruction.E)){
			return this.stackE.retrieveValue();
		}
		else{
			return this.stackF.retrieveValue();
		}
	}

	

	private class MyStack<E extends Value> {
		private LinkedList<E> myStackQueue;

		public void addElement(E e) {
			this.myStackQueue.addLast(e);
		}

		public E retrieveValue() {
			return this.myStackQueue.removeLast();
		}

	}

}
