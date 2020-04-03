package lsystems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		ArrayList<Character> letters = new ArrayList<>();
		for (char c : line) {
			for (LRule rule : rules) {
				if (c == rule.getMatch()) {
					for (char x : rule.getBody()) {
						letters.add(x);
					}
					if (rule.getBody().length < 1) {
						throw new LSystemLengthException();
					}
				}
			}
		}
		line = listToArray(letters);
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
