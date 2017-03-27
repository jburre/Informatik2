import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Mainklasse zum Auslesen des Faust I auf Basis einer Multimenge
 * @author Jan-Henrik Burre
 *
 */
public class WcMultiset {

	/**
	 * Mainmethode
	 * @param args Leere Argumente
	 * @throws FileNotFoundException wenn die Datei nicht gefunden wurde.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		VerlinkteListeMultiset<String> m = new VerlinkteListeMultiset<String>();
		Scanner scanner = new Scanner(new FileReader("C:/Users/Lyz/Desktop/Faust.txt"));
		
		while (scanner.hasNext()) {
			String t = scanner.next();
			
			if (t.endsWith("!")||t.endsWith(",")||t.endsWith(".")||t.endsWith(":")||t.endsWith(";")||t.endsWith("?")||t.endsWith("'")||t.endsWith(")")){
				t=t.substring(0, t.length()-1);
			}
			if (t.endsWith(".)")){
				t=t.substring(0,t.length()-2);
				
			}
			 
			//t=t.replaceAll("!,.:;?'()-", "");
			m.add(t);
		}
		
		System.out.println(m); // gib alle Wörter aus
		System.out.println(m.distinct()); // gib Vokabulargröße aus
		System.out.println(m.getTotal()); // gib Textlänge aus
		scanner.close();
	}
}

