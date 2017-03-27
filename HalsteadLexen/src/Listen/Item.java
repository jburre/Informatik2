package Listen;

/**
 * Itemklasse
 * @author Lyz
 *
 * @param <E> frei w�hlbarer Datentyp
 */
public class Item <E extends Comparable<E>>implements Comparable<Item<E>>{

	/**
	 * Datenfelder zum Halten des Contents und der Anzahl der Elemente.
	 */
	private E content;
	private int anzahl;
	
	/**
	 * Konstruktor
	 * @param e �bergebenes Element. 
	 */
	public Item(E e){
		this.content=e;
		this.anzahl=1;
	}
	
	/**
	 * Gettermethode f�r Anzahl.
	 * @return Einen Integerwert �ber die Anzahl
	 * bisher gespeicherter Elemente dieses Typs. 
	 */
	public int count (){
		return this.anzahl;
	}
	
	/**
	 * Liest den Content aus.
	 * @return Den Content des Items. 
	 */
	public E getContent(){
		return this.content;
	}
	
	/**
	 * Inkrementiermethode f�r Anzahl.
	 */
	public void inc(){
		this.anzahl++;
	}
	
	/**
	 * Dekrementiermethode f�r Anzahl.
	 */
	public void dec(){
		this.anzahl--;
	}
	
	/**
	 * Erstellt eine Stringrepr�sentation.
	 */
	public String toString(){
		return content+" : "+anzahl;
	}
	
	/**
	 * Comparemethode f�r Elemente
	 * @param neu Element vom Typ E
	 * @return Einen Vergleichswert, ob E gleich (0) oder nicht gleich dem Content
	 * des Items ist. 
	 */
	public int compareTo(E neu) {
		return this.content.compareTo(neu);
	}

	/**
	 * Comparemethode f�r Items. 
	 */
	public int compareTo(Item<E> it) {
		return this.content.compareTo(it.content);
	}

}
