package Listen;
class Knoten<E extends Comparable <E>>{
	Knoten<E> links, rechts, oben;
	E inhalt;
	
	Knoten(E el){
		inhalt = el;
	}
	
	Knoten(E el, Knoten<E> li, Knoten<E> re){
		inhalt = el;
		links = li;
		rechts = re;
	}

	public Knoten(E e, Knoten<E> o) {
		inhalt = e;
		oben = o;
	}
}