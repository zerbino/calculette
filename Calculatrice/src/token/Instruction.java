package token;

public enum Instruction implements Token {
	E("E"), F("F"), M("M"), R("R");

	private String value;

	private Instruction(String value) {
		this.value = value;
	}

	public String toString() {
		return this.value;
	}

	public static boolean isModeInstruction(Object o) {
		return (o instanceof Instruction)
				&& (((Instruction) o).equals(E) || ((Instruction) o).equals(F));
	}

}
