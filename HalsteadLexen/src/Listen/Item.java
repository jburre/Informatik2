package Listen;

/**
 * Itemklasse
 * @author Lyz
 *
 * @param <E> frei wählbarer Datentyp
 */
public class Item <E extends Comparable<E>>implements Comparable<Item<E>>{

	/**
	 * Datenfelder zum Halten des Contents und der Anzahl der Elemente.
	 */
	private E content;
	private int anzahl;
	
	/**
	 * Konstruktor
	 * @param e übergebenes Element. 
	 */
	public Item(E e){
		this.content=e;
		this.anzahl=1;
	}
	
	/**
	 * Gettermethode für Anzahl.
	 * @return Einen Integerwert über die Anzahl
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
	 * Inkrementiermethode für Anzahl.
	 */
	public void inc(){
		this.anzahl++;
	}
	
	/**
	 * Dekrementiermethode für Anzahl.
	 */
	public void dec(){
		this.anzahl--;
	}
	
	/**
	 * Erstellt eine Stringrepräsentation.
	 */
	public String toString(){
		return content+" : "+anzahl;
	}
	
	/**
	 * Comparemethode für Elemente
	 * @param neu Element vom Typ E
	 * @return Einen Vergleichswert, ob E gleich (0) oder nicht gleich dem Content
	 * des Items ist. 
	 */
	public int compareTo(E neu) {
		return this.content.compareTo(neu);
	}

	/**
	 * Comparemethode für Items. 
	 */
	public int compareTo(Item<E> it) {
		return this.content.compareTo(it.content);
	}

}
