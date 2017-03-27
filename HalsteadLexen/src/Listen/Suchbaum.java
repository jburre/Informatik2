package Listen;
/**
 * Suchbaum, der den Binbaum erweitert
 * @author Jan
 *
 * @param <E> w�hlbarer Datentyp, der vergleichbar sein muss
 */
public class Suchbaum<E extends Comparable<E>> extends BinBaum<E>{

	/**
	 * Konstruktor
	 */
	public Suchbaum(){
		super();
	}
	
	/**
	 * Pr�fmethode, ob leer
	 */
	public boolean istLeer(){
		return super.istLeer();
	}
	
	/**
	 * Methode zum Einf�gen, pr�ft, ob Element vorhanden
	 * @param e Einzuf�gendes Element
	 * @return true, wenn eingef�gt wurde
	 */
	//log(n)
	public boolean einfuegen(E e){
		if (wurzel == null) {
		wurzel = new Knoten<E>(e);
		return true;
		}
		else return einfuegen(e, wurzel);
		}
	
	/**
	 * Rekursive Hilfsmethode zum Einf�gen
	 * @param e Element
	 * @param k Knoten zum Einf�gen
	 * @return true, wenn eingef�gt wurde
	 */
	// O (1) || O (log(n))
	private boolean einfuegen(E e, Knoten<E> k){
		if (e.compareTo(k.inhalt)== 0) return false;
		if (e.compareTo(k.inhalt) < 0)
		if (k.links == null) k.links = new Knoten<E>(e, k);
		else einfuegen(e, k.links);
		else
		if (k.rechts == null) k.rechts = new Knoten<E>(e, k);
		else einfuegen(e, k.rechts);
		return true;
		}
	
	/**
	 * Suchfunktion eines Elementes, liefert es selbst zur�ck, wenn Vorhanden.
	 * @param e Zu Suchendes Element
	 * @return es selbst, wenn vorhanden
	 */
	public E suche(E e){
		Knoten<E> k = suche(e, wurzel);
		return k==null ? null : k.inhalt;
		}
	
	/**
	 * Hilfsmethode zum Suchen des Knotens
	 * @param e Das zu �bergebende Element
	 * @return Den Knoten, in welchem das Element liegt
	 */
	private Knoten<E> sucheKnoten(E e){
		Knoten <E> k = suche(e,wurzel);
		return k== null? null: k;
	}
	
	/**
	 * Rekursive Methode zum Suchen des Elementes in einem Baum
	 * @param e zu suchendes Element
	 * @param k zu besuchender Knoten
	 * @return den Knoten, in welchem e liegt
	 */
	//O(log(n))
	private Knoten<E> suche(E e, Knoten<E> k){
		if (k == null) return null;
		if (e.compareTo(k.inhalt) == 0) return k;
		if (e.compareTo(k.inhalt) < 0) return suche(e, k.links);
		else return suche(e, k.rechts);
		}
	/**
	 * Suchmethode
	 * @return liefert das Minimum im Baum
	 */
	public E sucheMin(){
		Knoten<E>k =sucheMin(wurzel);
		return k==null? null:k.inhalt;
	}

	/**
	 * Rekursive Hilfsmethode zum Suchen des Minimum
	 * @param k der zu durchsuchende Knoten
	 * @return der Knoten mit dem kleinsten Element
	 */
	private Knoten<E> sucheMin(Knoten<E> k) {
		if (k==null)return k;
		while (k.links!=null)k=k.links;
		return k;
	}
	/**
	 * Suchmethode
	 * @return liefert das Maximum im Baum
	 */
	public E sucheMax(){
		Knoten<E> k =sucheMax(wurzel);
		return k==null? null:k.inhalt;
	}

	/**
	 * Rekursive Hilfsmethode zum Suchen des Maximum
	 * @param k der zu durchsuchende Knoten
	 * @return der Knoten mit dem gr��ten Element
	 */
	private Knoten<E> sucheMax(Knoten<E> k) {
		if (k==null) return k;
		while (k.rechts!=null)k=k.rechts;
		return k;
	}
	/**
	 * L�schfunktion des gesamten Baumes
	 */
	public void loescheBaum(){
		wurzel=null;
	}
	/**
	 * Lokale L�schfunktion
	 * @param e zu l�schendes Element
	 * @return True, wenn l�schen erfolgreich war
	 */
	public boolean loesche(E e){
		Knoten <E> k= sucheKnoten(e);
		if (k== null){
			return false;
		}
		//ist Baum?
		if (k.links!=null && k.rechts!= null){
			loesche1(k);
		}
		else {
			loesche2(k);
		}
		return true;
	}
	
	/**
	 * Hilfsfunktion zum L�schen
	 * @param k der zu L�schende Knoten
	 */
	private void loesche1(Knoten<E> k) {
		Knoten<E>kn = nachfolger(k);
		k.inhalt = kn.inhalt;
		kn=null;
	}
	
	/**
	 * Hilfsl�schmethode
	 * @param sohn ZU l�schendes Element
	 */
	private void loesche2(Knoten<E> sohn) {
		// Bestimme den Enkel - kann null sein
		Knoten<E> enkel = (sohn.links == null) ? sohn.rechts : sohn.links;
		// sohn hat keinen Vater also soll die Wurzel gel�scht werden
		if (sohn == wurzel) {
			wurzel = enkel;
			wurzel.oben = null;
			return;
		}
		// Ab hier ist klar: Vater existiert
		Knoten<E> vater = sohn.oben;
		// Verbinde Vater zum Enkel
		if (vater.links == sohn) vater.links = enkel;
		else vater.rechts = enkel;
		// Verbinde Enkel zum Vater
		if (enkel != null) enkel.oben = vater;
	}

	/**
	 * Sucht den Nachfolger eines Knotens
	 * @param k den Vater
	 * @return den Nachfolger
	 */
	private Knoten<E> nachfolger(Knoten<E> k){
		if (k == null) return k;
		if (k.rechts != null) return sucheMin(k.rechts);
		Knoten<E> vater = k.oben;
		while((vater != null) && (vater.rechts == k)) {
			k = vater;
			vater = k.oben;
			}
		return vater;
	}
	

	/**
	 * Liefert den Vorg�nger eines Knotens
	 * @param k zu betrachtender Knoten
	 * @return den Vorg�nger eines Elementes
	 */
	private Knoten<E> vorgaenger(Knoten<E> k) {
		if (k==null)return k;
		if (k.links!=null) return sucheMax(k.links);
		Knoten <E> vater = k.oben;
		while ((vater!=null)&&(vater.links==k)){
			k=vater;
			vater = k.oben;
		}
		return vater;
	}
	
	/**
	 * Ausgabe in Aufsteigender Form
	 */
	public void ausgabeVorw(){
		Knoten <E> k = sucheMin(wurzel);
		while (k!=null){
			System.out.print(k+" ");
			k = nachfolger(k);
		}
		System.out.println();
	}

	/**
	 * Ausgabe in Absteigender Form
	 */
	public void ausgabeRueckw(){
		Knoten <E> k = sucheMax(wurzel);
		while (k!=null){
			System.out.print(k+" ");
			k = vorgaenger(k);
		}
		System.out.println();
	}

	/**
	 * Erstellt eine Stringrepr�sentation in Inorder
	 */
	public String toString(){
		super.setOrder(Order.INORDER);
		return super.toString();
	}
}
