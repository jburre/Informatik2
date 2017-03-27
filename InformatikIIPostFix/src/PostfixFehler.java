/**
 * Klasse zur Ausgabe einer Fehlermeldung der Postfix-Klasse
 * @author Jan
 *
 */
public class PostfixFehler extends RuntimeException{

	private String message;
	
	/**
	 * Konstruktor
	 * @param m Stringrepresaentation des Fehlers
	 */
	public PostfixFehler(String m){
		this.message=m;
	}
}
