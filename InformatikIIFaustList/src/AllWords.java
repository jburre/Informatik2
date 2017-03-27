import java.util.Iterator;

/**
 * Eine Klasse Allwords zum Speichern von Worten
 * @author Jan-Henrik Burre
 *
 * @param <E> Frei waehlbarer Datentyp
 */
public class AllWords<E> {
	
	/**
	 * Datenfeld VerlinkteListe
	 */
	private VerlinkteListe<Word> all;
	
	/**
	 * Konstruktor
	 */
	public AllWords () { 
		all= new VerlinkteListe<Word>();
	}
	
	/**
	 * Hinzufügeoperation.
	 * @param s zu Übergebender String.
	 */
	public void add(String s) {
		  if (all.size() > 0) {
			   for (Word w : all) {
			    if (w != null) {
			     if (s.equals(w.getContent())) {
			      w.inc();
			      return;
			     }
			    }
			   }
			  }
			  Word dummy = new Word(s);
			  all.add(dummy);	  
	}
	
	/**
	 * Liefert die Anzahl der Unterschiedlichen Worte im abgespeicherten Feld.
	 * @return Anzahl der unterschiedlichen Worte.
	 */
	public int distinctWords() {
	// liefere Anzahl der unterschiedlichen Wörter
		return all.size();
	}
	
	/**
	 * Liefert die Gesamtanzahl
	 * @return Gesamtanzahl unterschiedlicher Worte.
	 */
	public int totalWords() {
	// liefere Gesamtzahl aller Wörter
		int j=0;
		Iterator<Word> it = all.iterator();
		while (it.hasNext()){
			j+=it.next().count();
		}
		return j;
	}
	/**
	 * Liefert eine Stringdarstellung der Liste.
	 */
	public String toString() {
	// liefere Stringrepraesentation aller Wörter
		return this.all+"";
	}
}