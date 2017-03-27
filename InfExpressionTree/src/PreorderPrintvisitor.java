
public class PreorderPrintvisitor implements Visitor {

	public void visit(Binary b) {
		System.out.print(b.getToken());
		b.getLeft().accept(this);
		b.getRight().accept(this);
	}

	public void visit(Unary u) {
		System.out.print(u.getToken());
		u.getChild().accept(this);
	}

	public void visit(Atomic a) {
		System.out.print(a.getToken());
	}

}
