package stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

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

	public static void addElement(Value value) {
		System.out.println(value);
		if(Instruction.E.equals(ModeManager.instruction)){
			getInstance().stackE.addElement((Num)value);
		}
		else{
			getInstance().stackF.addElement((Float)value);
		}
	}
	
	public static int size(){
		if(Instruction.E.equals(ModeManager.instruction)){
			return getInstance().stackE.size();
		}
		else{
			return getInstance().stackF.size();
		}
	}

	

	public static Value retrieveValue() throws NoSuchElementException{
		if (ModeManager.instruction.equals(Instruction.E)) {
			return getInstance().stackE.retrieveValue();
		} else {
			return getInstance().stackF.retrieveValue();
		}
	}

	private class MyStack<E extends Value> {
		private LinkedList<E> myStackQueue;
		
		public MyStack() {
			super();
			this.myStackQueue = new LinkedList<E>();
		}

		public void addElement(E e) {
			this.myStackQueue.addLast(e);
		}

		public E retrieveValue() throws NoSuchElementException{
			return this.myStackQueue.removeLast();
		}
		
		public int size(){
			return this.myStackQueue.size();
		}

	}

}
