/**
 * Wordklasse
 * @author Jan
 *
 */
public class Word implements Comparable<Word>{
	private String content; // das Wort als Zeichenkette
	private int n; // die Anzahl des Auftretens dieses Wortes im Text
	
	
	public Word(String s) {
	// s als content übernehmen,
	// zähler auf 1 setzen (erstes Auftreten)
		this.content=s;
		n=1;
	}
	
	public int count() { 
		return this.n; 
	}
	
	public void inc() { 
		// erhöhe Zähler für dieses Wort um 1 
		n++;
		}
	
	public int compareTo(String s) {
	// Die Methode compareTo liefert
	// einen Wert kleiner 0, wenn das Objekt »kleiner«;
	// größer 0, wenn es »größer«,
	// und gleich 0, wenn es »gleich«
	// dem als Argument übergebenen Objekt w ist.
		return this.content.compareTo(s);
	}
	
	public String toString(){
	// liefert für dieses Wort die Zeichenkette: "Häufigkeit : Wort"
		return n+" : "+content;
	}
	
	public String getContent(){
		return this.content;
	}

	public int compareTo(Word w) {
		return this.content.compareTo(w.getContent());
	}
}