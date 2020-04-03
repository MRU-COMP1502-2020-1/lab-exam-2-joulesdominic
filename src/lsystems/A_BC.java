package lsystems;

public class A_BC extends LRule {

	@Override
	public char getMatch() {
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] c = {'B', 'C'};
		return c;
	}

}
