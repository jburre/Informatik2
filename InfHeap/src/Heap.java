
public class Heap <E extends Comparable<E>>{

	private E[] store;
	private int heapgroesse;
	private int length = -1;
	
	public Heap(int len){
		this.store = (E[]) new Comparable[len];
		this.heapgroesse=-1;
	}
	
	public Heap(E[] b){
		this.store = (E[]) new Comparable[b.length];
		for (E e : b){
			this.insert(e);
		}
		buildHeap();
	}
	
	public void insert(E e){
		length++;
		store[length]=e;
		upHeap(length);
		heapgroesse=length;
	}
	
	protected void buildHeap(){
		for (int i =getVater(length);i>=0;i--){
			heapify(i);
		}
	}
	
	public E extractMax(){
		E max = store[0];
		store[0]=store[heapgroesse];
		heapgroesse--;
		heapify(0);
		return max;
	}
	
	protected void upHeap(int i){
		while(i>0&&store[i].compareTo(store[getVater(i)])==1){
			tausche(i, (i/2));
			i = i/2;
		}
	}
	
	protected void heapify(int i){
		while (i!=-1){
			i=heapifyLocally(i);
		}
	}
	
	protected int heapifyLocally(int i){
		int j = maxKind(i);
		if (store[j].compareTo(store[i])==1){
			tausche(j,i);
			return j;
		}
		else{
			return -1;
		}
	}

	public void tausche(int j, int i) {
		E dummy = store[j];
		store[j]=store[i];
		store[i]=dummy;
	}

	private int maxKind(int i) {
		int maxLinks =getLinkesKind(i);
		int maxRechts = getRechtesKind(i);
		
		if (store[maxRechts].compareTo(store[maxLinks])>0){
			return maxRechts;
		}
		else {
			return maxLinks;
		}
	}
	
	private int getLinkesKind(int i){
		return ((i+1)*2)-1;
	}
	
	private int getRechtesKind(int i){
		return (i+1)*2;
	}
	
	private int getVater(int i){
		return (i-1)/2;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < store.length;i++){
			s.append(store[i]+"\n");
		}
		return s.toString();
	}
	
	public int getLength(){
		return this.length;
	}
	
	public E[] getHeap(){
		return this.store;
	}
	
	protected void decLength(){
		length--;
	}
	protected void setLength(int i){
		this.length = i;
	}
}
