package Listen;
import java.util.Iterator;

/**
 * Eine Klasse zur Erstellung einer verlinkten Liste.
 * @author Jan-Henrik Burre
 *
 * @param <E> frei w�hlbarer Datentyp.
 */
class VerlinkteListe<E extends Comparable<E>> implements Liste<E>{
	
	/**
	 * Datenfelder zur Speicherung des Ankers, des Cursors und der L�nge
	 * der Liste.
	 */
	private Zelle<E> anker;
	private Cursor cursor;
	private int length;
	
	/**
	 * Konstruktor.
	 * Legt einen Anker und Cursor an und setzt die L�nge auf 0.
	 */
	public VerlinkteListe(){
		anker=new Zelle <E>(null,null);
		cursor = new Cursor(anker);
		this.length=0;
	}
	
	/**
	 * Private Klasse zur Erstellung eines Cursors
	 * @author Jan-Henrik Burre
	 *
	 */
	private class Cursor implements Iterator<E>{
		
		/**
		 * Datenfeld zur Speicherung des Cursors.
		 */
		private Zelle<E> z;
		
		/**
		 * Konstruktor
		 * @param z Eine Zelle, auf welcher der Cursor steht.
		 */
		private Cursor(Zelle<E> z){ 
			this.z = z; 
			}
		// Navigation
		/**
		 * Methode zum Setzen auf das erste Feld.
		 */
		private void goToFirst(){
			z = anker; 
			}
		
		/**
		 * Methode zum Pr�fen, ob der Cursor am Ende der Liste ist.
		 * @return Boolscher WErt, ob der Cursor am Ende der Liste ist.
		 */
		private boolean atEnd() { 
			return z.next == null; 
			}
		
		/**
		 * Setzt den Cursor eine Zelle weiter.
		 */
		private void goToNext() { 
			if (!atEnd()) {
				z=z.next; 
			}
		}
		/**
		 * Setzt den Cursor auf eine bestimmte Zelle.
		 * @param e die Zelle, auf die der Cursor gesetzt werden soll.
		 */
		private void goTo(E e) { 
			goToFirst();
			while(!atEnd() && e.compareTo(get())!= 0){
				goToNext(); 
			}
		}
		
		// Listenmodifikation und Inspektion
		/**
		 * Hinzuf�geoperation
		 * @param e hinzuzuf�gendes Element
		 */
		private void add(E e) { 
			z.next=new Zelle<E>(e,z.next);
			goToNext();
		}
		
		/**
		 * Entfernt das Element, auf das der Cursor zeigt.
		 */
		public void remove() {
			if(z.next != null) z.next = z.next.next; 
			}
		
		/**
		 * Getmethode f�r den Zeiger
		 * @return Liefert einen Wert f�r den aktuellen Zeiger.
		 */
		public E get() { 
			return z.next.inhalt; 
			}
		
		/**
		 * Pr�ft ob der Zeige nicht am Ende ist.
		 */
		public boolean hasNext() {
			return !atEnd();
		}

		/**
		 * Liefert das n�chste Element aus.
		 */
		public E next() {
			E e = get(); 
			goToNext(); 
			return e;
		}
	}

	/**
	 * gettermethode f�r die L�nge der Liste.
	 */
	public int size() {
		return this.length;
	}

	/**
	 * Pr�fmethode, ob die Liste leer ist.
	 */
	public boolean isEmpty() {
		return anker == null&&cursor.atEnd();
	}

	/**
	 * Pr�fmethode, ob ein Element in der Liste vorhanden ist.
	 */
	public boolean contains(E e) {
		if (this.isEmpty()){
			return false;
		}
		Zelle<E> z = anker.next;
		while (z!=null){
			if (z.inhalt.compareTo(e)==0){
				return true;
			}
			z=z.next;
		}
		return false;
	}
	/**
	 * Methode zum Entfernen eines Elementes.
	 */
	public void remove(E e) {
		if (!this.contains(e)){
			return;
		}
		else{
			cursor.goTo(e);
			cursor.remove();
		}
	}

	/**
	 * Leert die Liste
	 */
	public void clear() {
		while(!this.isEmpty()){
			this.remove();
		}
	}
	/**
	 * Setzt den Zeiger auf den Anfang der Liste
	 */
	public void goToFirst() { 
		cursor.goToFirst(); 
		}
	
	/**
	 * setzt den Zeiger ein Feld weiter.
	 */
	public void goToNext() {
		cursor.goToNext(); 
		}
	
	/**
	 * Setzt den Cursor auf ein Element
	 * @param e das Element auf das der Zeiger zeigen soll
	 */
	public void goTo(E e) { 
		cursor.goTo(e);
	}
	/**
	 * Pr�ft, ob der Cursor am Ende der Liste ist.
	 */
	public boolean atEnd() { 
		return cursor.atEnd(); 
	}
	/**
	 * F�gt ein Element der Liste hinzu und erh�ht die L�nge der
	 * Liste.
	 */
	public void add(E e) { 
		cursor.add(e); 
		length++;
	}
	/**
	 * Entfernt ein Element aus der Liste und verringert die L�nge um 1.
	 */
	public void remove() { 
		cursor.remove(); 
		length--;
	}
	/**
	 * Getmethode
	 */
	public E get() { 
		if (cursor.atEnd()) {
			return null;
		}
		else {
			return cursor.get();
		}
	}
	/**
	 * Iteratorkonstruktor
	 */
	public Iterator<E> iterator(){ 
		return new Cursor(anker); 
		}
	/**
	 * Erstellt eine Stringrepres�ntation der Liste.
	 */
	public String toString(){
		String ret="(";
		Iterator<E> it = this.iterator();
		while (it.hasNext()){
			ret+=it.next()+", ";
		}
		ret = ret.substring(0, ret.length()-2)+")";
		return ret;
	}
}