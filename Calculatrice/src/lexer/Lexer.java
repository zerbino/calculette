package lexer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import parameters.ModeManager;

import token.Float;
import token.Instruction;
import token.Num;
import token.Op;
import token.Token;

public class Lexer {

	static BufferedReader input = new BufferedReader(new InputStreamReader(
			System.in));

	public static Token getToken() throws IOException, UnexistingToken {
		System.out.flush();

		String toIdentify = input.readLine();

		switch (toIdentify) {
		case "E":
			return Instruction.E;
		case "M":
			return Instruction.M;
		case "R":
			return Instruction.R;
		case "F":
			return Instruction.F;
		case "+":
			return Op.PLUS;
		case "-":
			return Op.MOINS;
		case "*":
			return Op.FOIS;
		case "/":
			return Op.DIVISE;
		default:
			try {
				if (ModeManager.instruction.equals(Instruction.E)) {
					return new Num(Integer.parseInt(toIdentify));
				} else {
					return new Float(Double.parseDouble(toIdentify));
				}

			} catch (Exception e) {
				throw new UnexistingToken(toIdentify);

			}
		}
	}

}
