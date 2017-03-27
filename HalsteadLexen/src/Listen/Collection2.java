package Listen;
/**
 * Ein Interface welches die Collection darstellt.
 * @author Jan-Henrik Burre
 *
 * @param <E> frei w�hlbarer Datentyp
 */
public interface Collection2 <E> extends Iterable<E>{
	int size(); 
	boolean isEmpty(); 
	boolean contains(E e); 
	void add(E e);
	void remove(E e); 
	void clear(); 
	
}
