
public class main1 {

	public static void main(String[] args) {

		Integer[] a=new Integer[5];
		a[0]= 10;
		a[1]= 7;
		a[2]= 5;
		a[3]= 8;
		a[4]= 2;
		Heap <Integer>h = new Heap<Integer>(a);
		System.out.println(h.toString());
		
		
		Integer[] b=new Integer[5];
		b[0]=10;
		b[1]=7;
		b[2]=5;
		b[3]=8;
		b[4]=2;
		HeapSort<Integer> hs = new HeapSort<Integer>(b);
		System.out.print(hs);
	}

}
