package Listen;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Binärbaum
 */

/**
 * @author Jan
 *
 */
public class BinBaum<E extends Comparable <E>> implements Iterable<E> {
 
 /**
  * Wurzel des Baumes
  */
 public Knoten<E> wurzel;
 
 /**
  * Datenfeld zum Halten der Ordnung
  */
 private Order order;
 
 /**
  * Konstruktor
  */
 public BinBaum(){
  wurzel = null;
 }
 
 /**
  * Neuanlegen der Wurzel
  * @param w Wurzel des Baums
  */
 public BinBaum(Knoten<E> w){
  wurzel = w;
 }
 
 /**
  * Prüfmethode, ob Baum leer ist
  * @return true wenn der Baum leer ist
  */
 public boolean istLeer(){
  if(wurzel == null){
	  return true;
  }
  else {
	  return false;
  }
 }
 
 /**
  * Zählt die Anzahl von Blättern im Baum mit einer Hilfsmethode
  * @return Anzhal der Blätter als Int
  */
 public int anzBlaetter(){
  return anzBlaetter(wurzel);
 }
 
 /**
  * Rekursive Methode zum Bestimmen der Anzahl der Blätter
  * @param k Anfang des Baumes
  * @return Anzahl der Blätter als Int
  */
 private int anzBlaetter(Knoten<E> k){
	 if(k==null)return 0;
  
	 if(k.rechts ==null && k.links ==null){
		 return 1;
	 }
	 return anzBlaetter(k.links) + anzBlaetter(k.rechts);
 }
 
 /**
  * Zählt die Knoten in einem Baum mit einer Hilfsmethode
  * @return Anzahl der Knoten als Int
  */
 public int anzKnoten(){
  return anzKnoten(wurzel);
 }
 
 /**
  * Methode zum rekursiven Bestimmen der Knotenanzahl
  * @param k Anfang des Baumes
  * @return Anzahl der Knoten als Int
  */
 public int anzKnoten(Knoten<E> k){
	 if(k== null) return 0;
	 return 1 +anzKnoten(k.links) + anzKnoten(k.rechts);
 }
 
 /**
  * Zählt die inneren Knoten des Baumes mit einer Hilfsmethode
  * @return Anzahl der inneren Knoten als Int
  */
 public int anzInnereKnoten(){
	 return anzInnereKnoten(wurzel);
 }
 
 /**
  * Zählt rekursiv die inneren Knoten eines Baumes
  * @param k Anfang des Baumes
  * @return Anzahl der inneren Knoten als Int
  */
 public int anzInnereKnoten(Knoten<E> k){
 
  
	 if((k.links != null && k.rechts != null)){
		 return 1 +anzInnereKnoten(k.links) + anzInnereKnoten(k.rechts); 
	 }
	 if((k.links != null && k.rechts ==null)){
		 return 1 + anzInnereKnoten(k.links);
	 }
	 if((k.links == null && k.rechts !=null)){
		 return 1 + anzInnereKnoten(k.rechts);
	 }
	 else{
		 return 0;
	 }
 }
 
 
 /**
  * Gibt die Höhe des Baumes  mit einer Hilfsmethode aus
  * @return -1 wenn der Baum leer ist, sonst die Höhe
  */
  int hoehe(){
	 return hoehe(wurzel);
 }
 
 /**
  * Gibt rekursiv die Höhe des Baumes aus 
  * @param k Anfang des Baumes
  * @return -1 wenn der Baum leer ist, sonst die Höhe
  */
 public int hoehe(Knoten<E> k){
	 if(k==null) return -1;
  
	 return 1 + Math.max(hoehe(k.links), hoehe(k.rechts));
 }

 
 /**
  * Ausgabe des Baumes in Inordertraversierung aus
  * @param k Anfang des Baumes
  * @param liste Liste in die die Elemente des Baumes eingefügt werden sollen
  */
 public void inOrder(Knoten<E> k, List<E> liste){
	 if(k != null){
		 inOrder(k.links, liste);
		 liste.add(k.inhalt);
		 inOrder(k.rechts, liste);
	 }
 }
 
 /**
  * Ausgabe des Baumes in Preordertraversierung aus
  * @param k Anfang des Baumes
  * @param liste Liste in die die Elemente des Baumes eingefügt werden sollen
  */
 public void preOrder(Knoten<E> k, List<E> liste){
	 if(k != null){
   
		 liste.add(k.inhalt);
		 preOrder(k.links,liste);
		 preOrder(k.rechts, liste);
	 }
 }
 
 /**
  * Ausgabe des Baumes in Postordertraversierung aus
  * @param k Anfang des Baumes
  * @param liste Liste in die die Elemente des Baumes eingefügt werden sollen
  */
 public void postOrder(Knoten<E> k, List<E> liste){
	 if(k != null){
		 postOrder(k.links, liste);
		 postOrder(k.rechts, liste);
		 liste.add(k.inhalt);
	 }
 }
 
 
 /**
  * Settermethode zum Bestimmen der Ordnung
  * @param o Ordnung nach der, der Baum durchlaufen werden soll
  */
 public void setOrder(Order o){
	 this.order = o;
 }
 
 /**
  * Iterator des Baumes, gibt je nach Order eine andere Liste zurück
  */
 public Iterator<E> iterator() {
	 List<E> l = new LinkedList<E>();
	 
	 switch(order){
	 case PREORDER:  
		 preOrder(wurzel, l); 
		 break;
	 case POSTORDER:  
		 postOrder(wurzel, l); 
		 break;
	 case INORDER: 
		 inOrder(wurzel, l); 
		 break; 
	 case LEVELORDER:
		 levelOrder(wurzel,l);
		 break;  
	 }
  return l.iterator();
 }

 /**
  * Levelordertraversierung durch den Baum
  * @param wurzel Wurzel des Baumes
  * @param liste Liste, in die eingefügt wird.
  */
 private void levelOrder(Knoten<E> wurzel, List<E> liste) {
	Queue<Knoten<E>> q = new ListQueue<Knoten<E>>();
	q.enQueue(wurzel);
	while (!q.istLeer()){
		Knoten<E> k = q.deQueue();
		liste.add(k.inhalt);
		if (k.links!=null){
			q.enQueue(k.links);
		}
		if (k.rechts!=null){
			q.enQueue(k.rechts);
		}
	}
}

/**
  * Methode zum Erstellen eines Strings aus einem Baum. 
  * @return Baum als String
  */
 public String toString(){
	StringBuilder sb = new StringBuilder();
  	for(E e : this) sb.append(e+ " ");
  	return sb.toString();
 }

}