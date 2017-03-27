/**
 * Multisetinterface
 * @author Jan-Henrik Burre
 *
 * @param <E> frei w�hlbarer Datentyp.
 */

public interface Multiset <E extends Comparable<E>> extends Collection2<E> {
	
	int count(E element); // liefert die H�ufigkeit des Elementes
	int distinct(); // liefert die Anzahl der verschiedenen Elemente
	String toString(); // liefert eine Stringrepr�sentation der Multimenge

}