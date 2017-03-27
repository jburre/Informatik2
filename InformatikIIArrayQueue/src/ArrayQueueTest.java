import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Pruefklasse fuer ArrayQueue
 * @author Jan
 *
 */

public class ArrayQueueTest {

	/**
	 * Prueft, ob eine Queue richtig angelegt wurde.
	 */
	@Test
	public void testQueueExistence() {
		String s ="Hello";
		ArrayQueue<Character> a = new ArrayQueue<Character>(s.length());
		
		char [] c = s.toCharArray();
		
		for (int i=0;i<s.length();i++){
			a.enQueue(c[i]);
		}
		assertTrue(a.istVoll());
	}
	
	/**
	 * Prueft, ob die Entnahme aus der Queue richtig funktioniert.
	 */
	@Test
	public void testQueueDequeue() {
		String s ="Hello";
		ArrayQueue<Character> a = new ArrayQueue<Character>(s.length());
		
		char [] c = s.toCharArray();
		
		for (int i=0;i<s.length();i++){
			a.enQueue(c[i]);
		}
		assertTrue(a.deQueue()=='H');
	}

}
