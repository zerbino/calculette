package lexer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
				double toRet = Double.parseDouble(toIdentify);
				return new token.Float(toRet);
			} catch (Exception e) {
				try {
					int toRet = Integer.parseInt(toIdentify);
					return new Num(toRet);
				} catch (Exception ex) {
					throw new UnexistingToken(toIdentify);

				}

			}
		}
	}

}
