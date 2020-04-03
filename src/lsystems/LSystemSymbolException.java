package lsystems;

public class LSystemSymbolException extends Exception {
	
	private char symbol;
	
	public LSystemSymbolException(char c) {
		this.symbol = c;
	}
	
	public char getSymbol() {
		return symbol;
	}

}
