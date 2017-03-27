package Listen;
/**
 * Listeninterface
 * @author Jan-Henrik Burre
 *
 * @param <E> frei wählbarer Datentyp.
 */
public interface Liste<E> extends Collection2<E> {
	E get();

	void remove();

	void goToFirst();

	void goToNext();

	boolean atEnd();

	void goTo(E e);
}