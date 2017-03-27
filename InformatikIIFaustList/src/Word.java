/**
 * Wordklasse
 * @author Jan
 *
 */
public class Word implements Comparable<Word>{
	private String content; // das Wort als Zeichenkette
	private int n; // die Anzahl des Auftretens dieses Wortes im Text
	
	
	public Word(String s) {
	// s als content �bernehmen,
	// z�hler auf 1 setzen (erstes Auftreten)
		this.content=s;
		n=1;
	}
	
	public int count() { 
		return this.n; 
	}
	
	public void inc() { 
		// erh�he Z�hler f�r dieses Wort um 1 
		n++;
		}
	
	public int compareTo(String s) {
	// Die Methode compareTo liefert
	// einen Wert kleiner 0, wenn das Objekt �kleiner�;
	// gr��er 0, wenn es �gr��er�,
	// und gleich 0, wenn es �gleich�
	// dem als Argument �bergebenen Objekt w ist.
		return this.content.compareTo(s);
	}
	
	public String toString(){
	// liefert f�r dieses Wort die Zeichenkette: "H�ufigkeit : Wort"
		return n+" : "+content;
	}
	
	public String getContent(){
		return this.content;
	}

	public int compareTo(Word w) {
		return this.content.compareTo(w.getContent());
	}
}