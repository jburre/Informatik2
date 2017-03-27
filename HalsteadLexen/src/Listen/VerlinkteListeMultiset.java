package Listen;
import java.util.Iterator;

public class VerlinkteListeMultiset<E extends Comparable<E>> implements Multiset<E> {
	
	 private Liste<Item<E>> storage;
	 private int total;
	 
	 public VerlinkteListeMultiset(){
		 storage = new VerlinkteListe<Item<E>>();
		 this.total=0;
	 }
	 
	 public int size() {
		 return storage.size();
	 }

	 public boolean isEmpty() {
		 return storage.isEmpty();
	 }
	
	 public void clear() {
		 storage.clear();
	  
	 }
	

	 public Iterator<E> iterator() {
		 return null;
	 }
	
	 public int distinct() {
		 return storage.size();
	 }
	
	 public boolean contains(E e) {
		 Item<E> it = new Item<E>(e);
		 return storage.contains(it);
	 }

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
	
	 public int getTotal(){
		 return this.total;
	 }
	
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
	
	 public String toString(){
	  StringBuilder sb = new StringBuilder();
	  
	  for(Item<E> item: storage){
	   sb.append(item.toString() +" " + "\n");
	  }

	  return sb.toString();
	 }

}