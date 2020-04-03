package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class RulesTests {

	@Test
	public void AA() {
		LRule rule = new A_A();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void AAA() {
		LRule rule = new A_AA();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void ABC() {
		LRule rule = new A_BC();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void AQ() {
		LRule rule = new A_Q();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void AX() {
		LRule rule = new A_X();
		assertEquals('A', rule.getMatch());
	}
	
	@Test
	public void BA() {
		LRule rule = new B_A();
		assertEquals('B', rule.getMatch());
	}
	
	@Test
	public void CB() {
		LRule rule = new C_B();
		assertEquals('C', rule.getMatch());
	}

}
