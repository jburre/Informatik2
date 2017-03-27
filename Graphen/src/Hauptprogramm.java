import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Mainklasse zur Erstellung und Ausgabe eines Graphen
 * @author Lyz
 *
 */
public class Hauptprogramm {

	/**
	 * Hauptfunktion
	 * @param args Leere Argumente
	 * @throws FileNotFoundException wirft eine Exception, wenn die zu lesende
	 * Datei nicht gefunden wurde
	 */
	public static void main (String[] args) throws FileNotFoundException{
		//Kreiere Graph
		Graph g = new Graph();
		//Initialisiere den Reader
		File f = new File("C:/Users/Lyz/Desktop/Test.txt");
		FileReader reader = new FileReader(f);
		BufferedReader buffer =new BufferedReader(reader);
		Scanner sc = new Scanner(buffer);
		//Lese aus
		while (sc.hasNext()){
			String a = sc.next();
			String b = sc.next();
			double d = Double.parseDouble(sc.next());
			g.addEdge(a, b, d);
		}
		sc.close();
		//Hole mir aufgrund einer gleichen Gewichtung die Knoten und sortiere sie
		Vertex v = g.getKnoten("1");
		System.out.println(g.topoSort(v));
	}
}
