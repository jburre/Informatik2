import java.util.ArrayList;
import java.util.List;


public class HeapSort <E extends Comparable<E>> extends Heap<E>{

	private List<E> out;
	
	public HeapSort(int len){
		super(len);
	}
	
	public HeapSort(E[] a){
		super(a);
	}
	
	public void heapsort(){
		out = new ArrayList<E>();
		int tmp = super.getLength();
		buildHeap();
		sort();
		setLength(tmp);
	}
	
	protected void sort(){
		for (int i = 0; i <=getLength();i++){
			moveMax();
		}
	}
	
	protected void moveMax(){
		super.tausche(0, getLength());
		out.add(0,super.getHeap()[super.getLength()]);
		decLength();
		super.heapify(0);
	}
	
	public String toString(){
		heapsort();
		return out.toString();
	}
}
