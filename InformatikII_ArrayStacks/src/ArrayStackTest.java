import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Jan
 *
 */

public class ArrayStackTest {

	/**
	 * Testet, ob ein Arraystack richtig angelegt wird.
	 */
	@Test
	public void testStackCreation() {
		ArrayStack <Integer>a = new ArrayStack<Integer>(3);
		assertTrue(a.istLeer());
	}
	
	/**
	 * Prueft, ob ein Stack mit Zeichen richtig befuellt wird,
	 * ob dieser dann voll ist und ob der oberste Char dann auch
	 * der Eingabe entspricht.
	 */
	@Test 
	public void testStackWithChars(){
		String s= "zeichenweise";
		int l=s.length();
		ArrayStack<Character>b= new ArrayStack<Character>(l);
		char[]a= s.toCharArray();
		for (int i=0;i<l;i++){
			b.push(a[i]);
			
		}
		
		assertTrue(b.istVoll());
		assertTrue(b.top()=='e');
		for (int j =0; j<l;j++){
			b.popTop();
		}
		assertTrue(b.istLeer());
	}
	

}
