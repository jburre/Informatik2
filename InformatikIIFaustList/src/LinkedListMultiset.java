import java.util.Iterator;

/**
 * Eine Klasse Multiset auf der Basis der VerlinktenListe und dem Multiset-Interface
 * @author Jan-Henrik Burre
 *
 * @param <E> frei wählbarer Datentyp.
 */
public class LinkedListMultiset<E extends Comparable<E>> implements Multiset<E>{
	
	/**
	 * Datenfelder zur Speicherung der Liste, der Größe der Liste
	 * und der Anzahl unterschiedlicher Elemente.
	 */
	private VerlinkteListe<E> all;
	private int distinct;
	private int size;
	
	/**
	 * Konstruktor
	 */
	public LinkedListMultiset(){
		all=new VerlinkteListe<E>();
		this.distinct=0;
		this.size=0;
	}

	/**
	 * Liefert die Größe der Liste.
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Prüfmethode, ob die Liste leer ist.
	 */
	public boolean isEmpty() {
		return all.isEmpty();
	}

	public void clear() {
		all.clear();
	}

	/**
	 * Iteratorkonstruktor.
	 */
	public Iterator<E> iterator() {
		return all.iterator();
	}

	/**
	 * Liefert die Anzahl unterschiedlicher Elemente.
	 */
	public int distinct() {
		return this.distinct;
	}

	/**
	 * Zaehlmethode zur Bestimmung der Anzahl der unter-
	 * schiedlichen Elemente.
	 */
	public int count(E element) {
		int i = 0;
		for (E e : all) {
			if (e.equals(element)) {
				i++;
			}
		}
		return i;
	}
	
	/**
	 * Prüfmethode, ob die Liste leer ist.
	 */
	public boolean contains(E e) {
		return all.contains(e);
	}

	/**
	 * Hinzufügeoperation.
	 */
	public void add(E e) {
		if (!all.contains(e)){
			this.distinct++;
		}
		all.add(e);
		size++;
	}

	/**
	 * Methode zum Entfernen eines Elementes.
	 */
	public void remove(E e) {
		all.goTo(e);
		all.remove();
		size--;
	}
	/**
	 * Liefert eine Stringdarstellung des Vorkommens der
	 * gespeicherten Elemente.
	 * @return Eine Stringdarstellung.
	 */
	public String vorkommen(){
		VerlinkteListe<E> dummy = new VerlinkteListe<E>();
		
		for (E e : all){
			dummy.add(e);
		}
		
		String ret="";
		for (E e : dummy){
			int anzahl = this.count(e);
			ret+=e.toString()+" : "+anzahl+"\n";
			while (dummy.contains(e)){
				dummy.remove(e);
			}
			
		}
		return ret;
	}
	
	/**
	 * Einfache toStringmethode zum Auslesen der Liste.
	 */
	public String toString(){
		return all.toString();
		
	}
	

}
