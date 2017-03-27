/**
 * Eine Datenstruktur zur Erstellung von Liststacks.
 * @author Jan
 *
 * @param <E> frei waehlbarer Datentyp zur Nutzung der Datenstruktur
 */
class ListStack<E> implements Stack<E>{
	
	/**
	 * Die oberste Zelle als Top festgelegt.
	 */
	private Zelle<E> top;
	
	/**
	 * Eine Pruefmethode, ob der Stack leer ist.
	 * @return true, wenn Stack leer ist.
	 */
	public boolean istLeer() {
		return top == null;
	}
	
	/**
	 * Fuegt eine neue Zelle ans Ende des Stacks hinzu.
	 */
	public void push(E e) {
		Zelle<E> neueZelle = new Zelle<E>(e);
		neueZelle.next=top;
		top=neueZelle;
	}
	
	/**
	 * Entfernt die oberste Zelle vom Stack, gibt bei
	 * leerem Stack eine Fehlermeldung aus.
	 */
	public void pop() {
		if (istLeer()) throw new StackFehler("Aus einem leeren Stack kann man nichts entfernen.");
		top=top.next;
	}
	
	/**
	 * Kombinationsmethode aus pop und top
	 */
	public E popTop() {
		if (istLeer()) throw new StackFehler("Aus einem leeren Stack kann man nichts entfernen und nichts auslesen.");
		E e = top();
		pop();
		return e;
		
	}
	
	/**
	 * Liest die oberste Zelle eines Stacks, gibt bei leerem Stack eine
	 * Fehlermeldung aus.
	 */
	public E top() throws StackFehler {
		if (istLeer()) throw new StackFehler("Stack ist leer!");
		return top.inhalt;
	}
}

