
public class PriorityQueue<E extends Comparable<E>> extends Heap<E>{

	public PriorityQueue(int len) {
		super(len);
	}
	
	public PriorityQueue(E[]a){
		super(a);
	}
	
	public void insert(E e){
		insert(e);
	}
	
	public E extractMax(){
		return extractMax();
	}

}
