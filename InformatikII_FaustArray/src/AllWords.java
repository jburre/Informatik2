public class AllWords {
	private Word words[]; // das Array, in dem alle W�rter erfasst
	private int size;
	
	public AllWords (int max) { 
		this.words=new Word[max];
		size =1;
	}
	
	public void add(String s) {
	// Vergleiche mit allen bereits im Array erfassten W�rtern.
	// Falls s bereits als Wort enthalten ist, erh�he den Z�hler
	// dieses Wortes.
	// Ansonsten erzeuge neues Wort und trage es in das Array ein.
	// Falls kein Platz f�r neue W�rter mehr ist (bereits
	// max W�rter eingetragen) erzeuge Fehlerausschrift und beende
	// Programm mit System.exit(-1).
		  if (size > 0) {
			   for (Word w : words) {
			    if (w != null) {
			     if (s.equals(w.getContent())) {
			      w.inc();
			      return;
			     }
			    }
			    
			   }

			  }

			  if (size >= words.length) {
			   System.out.println("Das Array ist voll!");
			   //System.exit(-1);
			   return;
			  }
			  Word dummy = new Word(s);
			  words[size++] = dummy;

	}
	
	public int distinctWords() {
	// liefere Anzahl der unterschiedlichen W�rter
		int j=0;
		for (int i = 0; i<words.length;i++){
			if (words[i]!=null){
				j++;
			}
			}
		return j;
	}
	
	public int totalWords() {
	// liefere Gesamtzahl aller W�rter
		int j=0;
		for (int i = 0; i<words.length;i++){
			if (words[i]!=null){
			j+=words[i].count();
			}
		}
		return j;
	}
	
	public String toString() {
	// liefere Stringrepraesentation aller W�rter
		String ret="";
		for (int i =0; i<words.length;i++){
			ret+= words[i]+"\n";
		}
		return ret;
	}
}