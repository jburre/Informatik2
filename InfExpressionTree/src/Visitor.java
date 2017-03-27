public interface Visitor {
	public void visit (Binary b);
	public void visit (Unary u);
	public void visit (Atomic a);
}