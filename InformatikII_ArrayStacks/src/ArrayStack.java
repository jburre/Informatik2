/**
 * Erzeut eine Datenstruktur Arraystack, die als Eingabe einen Integer verlangt,
 * der ein entsprechendes Array dieser Länge erzeugt, jedoch mit den Funktionen 
 * eines Stacks also, dass das letzte Element zuerst geliefert wird.
 * Liefert bei einem vollen Stack einen Fehler
 * 
 * @author Jan
 *
 * @param <E> Ein beliebiger frei zu wählender Datentyp
 */

class ArrayStack<E> implements Stack<E>{
	
	/**
	 * Das Array welches generiert wird
	 * und den Zeiger auf das oberste Element.
	 */
	private E[] array;
	private int top;
	
	/**
	 * Konstruktor des ArrayStacks
	 * @param kapazität Groesse des ArrayStacks
	 */
	ArrayStack (int kapazität) {
		array = (E[]) new Object[kapazität];
		top = -1;
	}
	
	ArrayStack (ArrayStack<E> s){
		ArrayStack<E> i = new ArrayStack<E>(2*(this.array.length));
		ArrayStack<E> dummy =new ArrayStack<E>(this.array.length);
		
		while (!s.istLeer()){
			dummy.push(s.popTop());
		}
		while (!dummy.istLeer()){
			s.push(dummy.top());
			i.push(dummy.top());
			dummy.pop();
		}
	}
	
	/**
	 * Pruefmethode, ob der Stack leer ist, liefert true, wenn dem so ist.
	 * @return true, wenn Arraystack leer
	 */
	public boolean istLeer() { 
		return top == -1;
		}
	
	/**
	 * Pruefmethode, ob ArrayStack voll ist.
	 * @return true, wenn Arraystack voll
	 */
	public boolean istVoll() { 
		return top+1 == array.length;
		}
	
	/**
	 * Fuegt ein Element dem Arraystack hinzu, liefert eine Fehlermeldung, wenn der Stack voll ist.
	 */
	public void push (E e) throws StackFehler {
		if (istVoll()) throw new StackFehler("Sie wollten auf einen vollen Stack etwas hinzufügen. Bitte leeren Sie den Stack erst wieder.");
		array[++top] = e;
	}
	
	/**
	 * Entnimmt ein Element aus dem Stack ohne es zu lesen, liefert eine Fehlermeldung bei Anwendung
	 * auf leerem Stack.
	 */
	public void pop() throws StackFehler {
		if (istLeer()) throw new StackFehler("Sie wollen ein Stack verringern, der bereits leer ist. Das funktioniert leider nicht.");
		array[top--] = null; // Element löschen
	}
	
	/**
	 * Liefert das oberste Element des Arraystacks. Gibt eine Fehlermeldung bei leerem
	 * Stack zurueck.
	 */
	public E top() throws StackFehler {
		if (istLeer()) throw new StackFehler("Sie wollen von einem leeren Stack das oberste Element ansehen. Bitte fügen Sie dazu erst mindestens eins hinzu.");
		return array[top];
	}

	/**
	 * Kombination aus erst Top- und dann pop-Methode
	 */
	public E popTop() {
		E a = top();
		pop();
		return a;
	}
}