/**
 * Erzeugt ein Interface zur Implementierung der unterschiedlichen Stackarten.
 * 
 * 
 * @author Jan
 *
 * @param <E> Ein generischer Datentyp, der noch vom Programmierer zu wählen ist.
 */

public interface Stack<E> {
	boolean istLeer();
	void push(E e);
	void pop();
	E top();
	E popTop();
}