
public class Item <E extends Comparable<E>>implements Comparable<Item<E>>{

	private E content;
	private int anzahl;
	
	public Item(E e){
		this.content=e;
		this.anzahl=1;
	}
	
	public int count (){
		return this.anzahl;
	}
	
	public E getContent(){
		return this.content;
	}
	
	public void inc(){
		this.anzahl++;
	}
	
	public void dec(){
		this.anzahl--;
	}
	
	public String toString(){
		return content+" : "+anzahl;
	}
	
	public int compareTo(E neu) {
		return this.content.compareTo(neu);
	}

	public int compareTo(Item<E> it) {
		return this.content.compareTo(it.content);
	}

}
