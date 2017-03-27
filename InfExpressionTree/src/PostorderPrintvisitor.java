
public class PostorderPrintvisitor implements Visitor {

	public void visit(Binary b) {
		b.getLeft().accept(this);
		b.getRight().accept(this);
		System.out.print(b.getToken());
	}

	public void visit(Unary u) {
		u.getChild().accept(this);
		System.out.print(u.getToken());
	}

	public void visit(Atomic a) {
		System.out.print(a.getToken());
	}

}
