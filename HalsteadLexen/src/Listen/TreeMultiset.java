package Listen;
import java.util.Iterator;

/**
 * Eine Multiset auf der Basis eines binären Suchbaums
 * @author Lyz
 *
 * @param <E> frei wählbarer aber vergleichbarer Datentyp
 */

public class TreeMultiset <E extends Comparable<E>> implements Multiset<E>{

	/**
	 * Datenfelder zum Halten des Baumes auf Basis von Items,
	 * die Anzahl unterschiedlicher Elemente,
	 * die Größe des Baumes
	 */
	private Suchbaum<Item<E>> all;
	private int distinct;
	private int size;
	
	/**
	 * Konstruktor
	 */
	public TreeMultiset(){
		all = new Suchbaum<Item<E>>();
		this.distinct=0;
		this.size=0;
	}


	/**
	 * Prüfmethode, ob es leer ist.
	 */
	public boolean isEmpty() {
		return all.istLeer();
	}

	/**
	 * Prüfmethode, ob ein Element vorhanden ist
	 */
	public boolean contains(E e) {
		Item<E> it = new Item<E>(e);
		if(all.suche(it)!=null)return true;
		else {
			return false;
		}
	}

	/**
	 * Hinzufügeoperation
	 */
	public void add(E e) {
		 Item<E> it = new Item<E>(e);
		 if (all.istLeer()){
			   all.einfuegen(it);
			   distinct++;
		 }
		 else {
			 if (!contains(it.getContent())){
				 all.einfuegen(it);
				 distinct++;
			 }
			 else {
				 all.suche(it).inc();
			 }
		 }
		 size++;
		 
	}

	/**
	 * Methode zum Entfernen
	 */
	public void remove(E e) {
		  Item<E> it = new Item<E>(e);
		  if(isEmpty()){
			  return;
		  }
		  else{
			  if(it.count()==1){
				  all.loesche(it);
			  }
			  else{
				  it.dec();
			  }
		  }
		  size--;
	}

	/**
	 * Löscht den Gesamten Baum
	 */
	public void clear() {
		all.loescheBaum();
		this.size=0;
		this.distinct=0;
	}

	/**
	 * Iteratormethode
	 */
	public Iterator<E> iterator() {
		return null;
	}

	/**
	 * Zählmethode für den Baum anhand eines Elementes
	 */
	public int count(E element) {
		int i = 0;
		for (Item<E> item: all){
			if (item.getContent().compareTo(element)==0){
				i++;
			}
		}
		return i;
	}

	/**
	 * getterMethode für Distinct
	 */
	public int distinct() {
		return this.distinct;
	}
	/**
	 * Gettermethode für Size
	 */
	public int size() {
		return this.size;
	}
	/**
	 * Erstellt eine Stringrepräsentation
	 */
	public String toString(){
		return all.toString();
	}
}
