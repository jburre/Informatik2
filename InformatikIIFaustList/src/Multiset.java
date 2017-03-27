/**
 * Multisetinterface
 * @author Jan-Henrik Burre
 *
 * @param <E> frei wählbarer Datentyp.
 */

public interface Multiset <E extends Comparable<E>> extends Collection2<E> {
	
	int count(E element); // liefert die Häufigkeit des Elementes
	int distinct(); // liefert die Anzahl der verschiedenen Elemente
	String toString(); // liefert eine Stringrepräsentation der Multimenge

}