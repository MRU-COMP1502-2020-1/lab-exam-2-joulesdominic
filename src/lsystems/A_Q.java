package lsystems;

public class A_Q extends LRule {

	@Override
	public char getMatch() {
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] c = {'Q'};
		return c;
	}

}
