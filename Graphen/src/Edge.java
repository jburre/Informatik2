/**
 * Klasse zur Repräsentation von Kanten in einem Graphen
 * @author Lyz
 *
 */
public class Edge {
	/**
	 * Gewicht und zweiter Knoten im Graph
	 */
	public Vertex dest; // Second vertex in Edge
	public double weight; // Edge weigth
	
	/**
	 * Konstruktor
	 * @param v Zweiter Knoten
	 * @param w Gewicht der Kante
	 */
	public Edge(Vertex v, double w) {
	dest = v;
	weight = w;
	}
}
