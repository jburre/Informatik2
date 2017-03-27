/**
 * Interface zur Erstellung einer Queue.
 * @author Jan
 *
 * @param <E> frei waehlbarer Parameter.
 */
public interface Queue<E> {
	boolean istLeer();
	boolean istVoll();
	void enQueue(E e);
	E deQueue();
}