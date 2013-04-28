package Moteur;

import java.io.IOException;

import lexer.Lexer;
import lexer.UnexistingToken;

public class Moteur {
	
	public static void main(String[] args) {
		do{
			try {
				System.out.println(Lexer.getToken().toString());
			} catch (UnexistingToken e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
			}
		}while(true);
	}

}
