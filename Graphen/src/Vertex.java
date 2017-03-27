import java.util.LinkedList;
import java.util.List;

/**
 * Klasse zur Erstellung von Knoten
 * @author Lyz
 *
 */
public class Vertex {
	/**
	 * Datenfelder mit dem Namen,
	 * der Liste an Kanten,
	 * und einem Feld, ob dieser Knoten schon besucht wurde
	 */
	public String name;
	public List<Edge> adj;
	public boolean visited;
	
	/**
	 * Konstruktor
	 * @param nm String mit dem Namen
	 */
	public Vertex(String nm) {
		name = nm;
		adj = new LinkedList<Edge>();
		visited = false;
	}
	
	/**
	 * ToString-Methode
	 */
	public String toString(){
		return this.name;
	}
}