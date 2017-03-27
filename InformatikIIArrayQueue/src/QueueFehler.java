/**
 * Klasse zur Erstellung von QueueFehlern, die Runtime basiert sind.
 * @author Jan
 *
 */
public class QueueFehler extends RuntimeException {
	/**
	 * Zu belegender String.
	 */
	String message;
	
	/**
	 * Konstruktor
	 * @param s Stringnachricht
	 */
	public QueueFehler(String s){
		this.message=s;
	}

}
