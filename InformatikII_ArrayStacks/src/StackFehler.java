/**
 * 
 * @author Jan
 *
 *Eine Klasse zur Ausgabe von Stackfehlern, die durch Aufruf der verschiedenen Stackarten entstehen k�nnen.
 */

class StackFehler extends RuntimeException{
	String message;
	StackFehler(String m) {
		message = m;
	}
}