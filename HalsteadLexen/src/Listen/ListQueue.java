package Listen;
/**
 * Klasse zum Anlegen einer Queue auf der Basis einer List, die
 * zirkulaer organisiert ist.
 * @author Jan
 *
 * @param <E> frei waehlbarer Objekttyp
 */
public class ListQueue <E> implements Queue <E>{
	
	/**
	 * Zeiger fuer Anfang und Ende der Queue, sowie
	 * einen Integerwert, der die Laenge der Queue ausgibt.
	 */
	private Zelle <E> ende;
	private Zelle <E> anfang;
	private int laenge;
	
	/**
	 * Konstruktor
	 */
	public ListQueue(){
		anfang=null;
		ende=null;
		laenge=0;
	}
	
	/**
	 * Pruefmethode, ob die Queue leer ist.
	 */
	public boolean istLeer() {
		return ende == null;
	}

	/**
	 * Ungenutzte Pruefmethode, da eine Queue auf der
	 * Basis einer Liste nicht voll werden kann.
	 * Jedoch aufgrund des Interfaces mit zu implementieren.
	 */
	public boolean istVoll() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Hinzufuegen eines Elementes zum Ende der Queue.
	 */
	public void enQueue(E e) {
		if (istLeer()){
			Zelle<E> neueZelle = new Zelle<E>(e);
			neueZelle.next=neueZelle;
			anfang = neueZelle;
			ende=neueZelle;
		}
		else {
			Zelle<E> neueZelle = new Zelle<E>(e);
			neueZelle.next=anfang;
			ende.next=neueZelle;
			ende=neueZelle;
		}
		if (laenge++==0)ende=anfang;

	}
	
	/**
	 * Entnahme eines Elementes vom Anfang der Queue.
	 */
	public E deQueue() throws QueueFehler{
		if (istLeer()){
			throw new QueueFehler("Aus einer leeren Warteschlange kann man nix entfernen");
		}
		E e = anfang.inhalt;
		anfang=anfang.next;
		if (--laenge==0)ende=null;
		return e;
	}
	
	/**
	 * Methode zum Auslesen der Laenge der Queue.
	 * @return Integerwert, der die Laenge der Queue enthaelt.
	 */
	public int size(){
		return this.laenge;
	}

}
