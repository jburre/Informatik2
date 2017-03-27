import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Klasse zur Uberpruefung der Postfixmethoden
 * @author Jan
 *
 */
public class PostfixTest {

	/**
	 * Methode, die auf korrekte Addition prueft.
	 */
	@Test
	public void testPostfixAddition() {
		String s="3 3 + \n";
		Postfix p =new Postfix(s);
		assertTrue(p.evalPostFix()==6.0);
	}
	/**
	 * Methode, die auf korrekte Subtraktion prueft.
	 */
	@Test
	public void testPostfixSubtraktion() {
		String s="3 3 - \n";
		Postfix p =new Postfix(s);
		assertTrue(p.evalPostFix()==0.0);
	}
	/**
	 * Methode, die auf korrekte Multiplikation prueft.
	 */
	@Test
	public void testPostfixMultiplikation() {
		String s="3 3 * \n";
		Postfix p =new Postfix(s);
		assertTrue(p.evalPostFix()==9.0);
	}
	/**
	 * Methode, die auf korrekte Division prueft.	
	 */
	@Test
	public void testPostfixDivision() {
		String s="3 3 / \n";
		Postfix p =new Postfix(s);
		assertTrue(p.evalPostFix()==1.0);
	}
	/**
	 * Methode, die auf korrekte Potenzierung prueft.
	 */
	@Test
	public void testPostfixPow() {
		String s="3 3 ^ \n";
		Postfix p =new Postfix(s);
		assertTrue(p.evalPostFix()==27.0);
	}
	
	/**
	 * Methode, die auf korrekte Verwertung des binaeren Operators prueft.
	 */
	@Test
	public void testPostfixBinaryOp() {
		String s="3 # \n";
		Postfix p =new Postfix(s);
		assertTrue(p.evalPostFix()==-3.0);
	}
	

}
