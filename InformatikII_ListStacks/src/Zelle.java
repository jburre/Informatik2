/**
 * Eine Klasse Zelle, die einen Inhalt und einen Verweis auf die naechste
 * Zelle beinhaltet.
 * @author Jan
 *
 * @param <E> Generischer Datentyp, welcher noch frei waehlbar ist.
 */

class Zelle<E>{
	E inhalt;
	Zelle<E> next;
	
	Zelle(E e) { 
		inhalt = e;
		}
}