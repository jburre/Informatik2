import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Eine Klasse zum Testen von ListStack
 * @author Jan
 *
 */

public class ListStackTest {

	/**
	 * Prueft, ob ein Stack korrekt angelegt wurde
	 */
	@Test
	public void testListStackCreation() {
		ListStack a= new ListStack();
		assertTrue(a.istLeer());
	}
	
	/**
	 * Prueft, ob die Methode pop richtig funktioniert und Top 
	 * einen richtigen WErt zurueck gibt.
	 */
	@Test
	public void testListStackPop(){
		ListStack<Integer> a = new ListStack<Integer>();
		a.push(1);
		a.push(2);
		a.push(3);
		a.pop();
		assertTrue(a.top()==2);
	}
	
	/**
	 * Prueft die Methode PopTop auf korrekte Arbeitsweise.
	 */
	@Test
	public void testListStackPopTop(){
		ListStack<Integer> a = new ListStack<Integer>();
		a.push(1);
		a.push(2);
		a.push(3);
		assertTrue(a.popTop()==3);
	}
	
	/**
	 * Gibt einen String zeichenweise auf den ListStack und 
	 * prueft, ob er korrekt abgelegt worden ist und ob
	 * die Methode popTop ihn auch wieder leert.
	 */
	@Test
	public void testListStackWithChars(){
		ListStack<Character> b = new ListStack<Character>();
		String s= "zeichenweise";
		char[]a= s.toCharArray();
		
		for (int i=0;i<s.length();i++){
			b.push(a[i]);
		}
		
		assertTrue(b.top()=='e');
		
		for (int j =0; j<s.length();j++){
			b.popTop();
		}
		assertTrue(b.istLeer());
	}
	
	

}
