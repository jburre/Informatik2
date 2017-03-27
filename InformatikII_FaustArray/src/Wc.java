import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Wc {
	public static void main(String[] args) throws FileNotFoundException {
	AllWords words = new AllWords(9000);
	Scanner scanner = new Scanner(new FileReader("C:/Users/Lyz/Desktop/Faust.txt"));
	
	while (scanner.hasNext()) {
		String t = scanner.next();
		if (t.endsWith("!")||t.endsWith(",")||t.endsWith(".")||t.endsWith(":")||t.endsWith(";")||t.endsWith("?")||t.endsWith("'")){
			t=t.substring(0, t.length()-1);
		}
		words.add(t);
	}
	
	System.out.println(words); // gib alle Wörter aus
	System.out.println(words.distinctWords()); // gib Vokabulargröße aus
	System.out.println(words.totalWords()); // gib Textlänge aus
	}
}