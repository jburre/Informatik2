import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
/**
 * Klasse zur Erstellung und Repräsentation eines Graphen
 * @author Lyz
 *
 */
public class Graph {
	
	private Map<String,Vertex> vertexMap = new HashMap<String,Vertex>();
	/* If vertexName is not present, add it to vertexMap.
	* In either case, return the Vertex. */
	/**
	 * liefere den Knoten
	 * @param vertexName Name des Knoten
	 * @return den Knoten selbst
	 */
	private Vertex getVertex(String vertexName) {
		Vertex v = vertexMap.get(vertexName);
		if (v == null) {
			v = new Vertex(vertexName);
			vertexMap.put(vertexName, v);
		}
		return v;
	}
	
	/* Add a new edge to the graph. */
	public void addEdge(String sourceName, String destName, double weight){
		Vertex u = getVertex(sourceName);
		Vertex v = getVertex(destName);
		u.adj.add(new Edge(v, weight));
	}
	
	/**
	 * Rekursive Tiefensuche nach einem Knoten
	 * @param v der gesuchte Knoten
	 */
	public void recDepthFirst(Vertex v){
		v.visited=true;
		System.out.println(v);
		for (Edge e: v.adj){
			Vertex u = e.dest;
			if(!u.visited){
				recDepthFirst(u);
			}
		}
	}
	/**
	 * Tiefensuche auf der Basis eines Stacks
	 * @param v Knoten, der gesucht ist
	 */
	public void depthFirst(Vertex v){
		Stack<Vertex> s = new Stack<Vertex>();
		s.push(v);
		while (!s.isEmpty()){
			Vertex u = s.pop();
			if (!u.visited){
				u.visited=true;
				System.out.println(u);
				for(Edge e: u.adj){
					Vertex w = e.dest;
					if (!w.visited){
						s.push(w);
					}
				}
			}
		}
	}
	
	/**
	 * Tiefensuche auf der Basis einer Queue
	 * @param v gesuchter Knoten 
	 */
	public void breadthFirst(Vertex v){
		Queue <Vertex> q = new ListQueue<Vertex>();
		q.enQueue(v);
		while (!q.istLeer()){
			Vertex u = q.deQueue();
			System.out.println(u);
			for(Edge e: u.adj){
				Vertex w = e.dest;
				if (!w.visited){
					q.enQueue(w);
				}
			}
		}
	}
	
	/**
	 * Sortierverfahren des Graphen
	 * @param v Knoten
	 * @return Eine geordnete Liste von Knoten
	 */
	public List<Vertex> topoSort(Vertex v){
		List<Vertex> l = new LinkedList<Vertex>();
		rekTiefensuche(v,l);
		return l;
	}
	/**
	 * Rekursive Tiefensuche mit Knoten und Liste
	 * @param v Knoten
	 * @param l Liste
	 */
	private void rekTiefensuche(Vertex v, List<Vertex> l){
		v.visited=true;
		for (Edge e: v.adj){
			Vertex u = e.dest;
			if (!u.visited){
				rekTiefensuche(u,l);
			}
		}
		l.add(0,v);
	}
	
	/**
	 * Gettermethode für den Knoten
	 * @param s Stringname des Knoten
	 * @return den Knoten selbst
	 */
	public Vertex getKnoten(String s){
		Vertex v = vertexMap.get(s);
		return v;
	}
}