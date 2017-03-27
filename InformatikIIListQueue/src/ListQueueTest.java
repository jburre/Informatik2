import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Pruefklasse fuer die Klasse ListQueue
 * @author Jan
 *
 */

public class ListQueueTest {

	/**
	 * Pruefmethode, ob eine Queue richtig angelegt wurde.
	 */
	@Test
	public void testListQueueExistence() {
		ListQueue<Character> a = new ListQueue<Character>();

		assertTrue(a.istLeer());
	}
	/**
	 * Prueft, ob die Methode dequeue richtig funktioniert.
	 */
	@Test
	public void testQueueDequeue() {
		String s ="Hello";
		ListQueue<Character> a = new ListQueue<Character>();
		
		char [] c = s.toCharArray();
		
		for (int i=0;i<s.length();i++){
			a.enQueue(c[i]);
		}
		assertTrue(a.deQueue()=='H');
		assertTrue(a.deQueue()=='e');
	}
	@Test
	public void testQueueLength() {
		char b ='b';
		char a='a';
		ListQueue<Character> ab = new ListQueue<Character>();
		ab.enQueue(b);
		ab.enQueue(a);

		assertTrue(ab.size()==2);
	}

}
