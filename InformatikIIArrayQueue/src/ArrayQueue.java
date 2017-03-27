/**
 * Eine Klasse, die eine Queue auf der Basis eines Arrays implementiert.
 * @author Jan
 *
 * @param <E> frei waehlbarer Parameter.
 */
class ArrayQueue<E> implements Queue<E>{
	
	/**
	 * Das zugrunde liegende Array.
	 * Die Speichervariable, ob das Array voll ist.
	 * Die Integerwerte, die den Anfang und das Ende der Queue darstellen.
	 */
	private E[] array;
	private boolean voll;
	private int anfang, ende;
	
	/**
	 * Ein Konstruktor.
	 * @param kapazität Laenge der Queue.
	 */
	ArrayQueue(int kapazität) {
		array = (E[]) new Object[kapazität];
		anfang = 0; ende = -1;
	}
	
	/**
	 * Eine Methode zum Inkrementieren einer Variable.
	 * @param i der zu inkrementierende Integerwert.
	 * @return den inkrementierten Integerwert.
	 */
	private int inc(int i) {
		if (++i == array.length) i = 0;
		return i;
	}
	
	/**
	 * Eine Methode, die ein Objekt der Queue hinzufuegt.
	 */
	public void enQueue(E e){

		ende = inc(ende);
		array[ende] = e;
		voll = (anfang == inc(ende));
	}
	
	/**
	 * Eine Methode, die ein Element am Anfang der Queue entnimmt und bei einer
	 * leeren Queue eine Fehlermeldung auswirft.
	 */
	public E deQueue() throws QueueFehler{
		if (istLeer()){throw new QueueFehler("Anwendung auf einer leeren Queue nicht möglich.");}
		E e = array[anfang];
		anfang = inc(anfang);
		voll = false;
		return e;
	}
	
	/**
	 * Pruefmethode, ob die Queue leer ist.
	 */
	public boolean istLeer() {
		return (anfang == inc(ende) && !voll);
	}
	
	/**
	 * Pruefmethode, ob die Queue voll ist.
	 */
	public boolean istVoll() { 
		return voll; 
		}
}