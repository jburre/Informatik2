import java.util.Iterator;

/**
 * Multiset
 * @author Lyz
 *
 * @param <E> frei wählbarer Datentyp
 */
public class VerlinkteListeMultiset<E extends Comparable<E>> implements Multiset<E> {
	
	/**
	 * Datenfelder zum Halten der Liste vom Typ Item,
	 * sowie der Gesamtzahl gespeicherter Elemente.
	 */
	 private Liste<Item<E>> storage;
	 private int total;
	 
	 /**
	  * Konstruktor
	  */
	 public VerlinkteListeMultiset(){
		 storage = new VerlinkteListe<Item<E>>();
		 this.total=0;
	 }
	 
	 /**
	  * Liefert die Größe der Liste.
	  */
	 public int size() {
		 return storage.size();
	 }

	 /**
	  * Prüft, ob die Liste leer ist.
	  */
	 public boolean isEmpty() {
		 return storage.isEmpty();
	 }
	
	 /**
	  * Leert die Liste.
	  */
	 public void clear() {
		 storage.clear();
		 this.total=0;
	 }
	
	 /**
	  * Iteratorkonstruktor
	  */
	 public Iterator<E> iterator() {
		 return null;
	 }
	
	 /**
	  * Liefert die Anzahl unterschiedlicher Elemente.
	  */
	 public int distinct() {
		 return storage.size();
	 }
	
	 /**
	  * Prüfmethode, ob ein Element in der Liste vorhanden ist.
	  */
	 public boolean contains(E e) {
		 Item<E> it = new Item<E>(e);
		 return storage.contains(it);
	 }

	 /**
	  * Methode zum Hinzufügen von Elementen. 
	  */
	 public void add(E e) {
		 Item<E> it = new Item<E>(e);
		  if(isEmpty()){
			   storage.add(it);
			   total++;
			   return;
		  }
		  else{
			  if(storage.contains(it)){ 
				  storage.goTo(it);
				  storage.get().inc();
				  total++;
				  return;
			  }
			  else{
				  storage.add(it);
				  total++;
			  }
		   }
	 }
	
	 /**
	  * Methode zum Entfernen eines Elementes. 
	  */
	 public void remove(E e) {
		  Item<E> it = new Item<E>(e);
		  if(isEmpty()){
			  return;
		  }
		  else{
			  if(it.count()==1){
				  storage.remove(it);
			  }
			  else{
				  it.dec();
			  }
		  }
		  total--;
	 }
	
	 /**
	  * Gettermethode für Total.
	  * @return Den Integerwert von Total. 
	  */
	 public int getTotal(){
		 return this.total;
	 }
	
	 /**
	  * Liest die Anzahl des jeweiligen Elementes aus. 
	  */
	 public int count(E element) {
		  Item<E> it = new Item<E>(element);
		  int i= 0;
		  storage.goToFirst();
		  while(storage.iterator().hasNext()){
			   if((storage.get()).compareTo(it)==0){
				    i= storage.get().count();
				    break;
			   }
		  }
		  return i;
	 }
	
	 /**
	  * Methode zum Erstellen einer Stringrepräsentation. 
	  */
	 public String toString(){
	  StringBuilder sb = new StringBuilder();
	  
	  for(Item<E> item: storage){
	   sb.append(item.toString() +" " + "\n");
	  }

	  return sb.toString();
	 }

}