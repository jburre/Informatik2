
public class PrintInorderVisitor implements Visitor {

	public void visit(Binary b) {
		b.getLeft().accept(this);
		System.out.print(b.getToken());
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
