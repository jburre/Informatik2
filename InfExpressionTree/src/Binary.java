import lexer.Token;


public abstract class Binary extends Expr{
	private Expr left;
	private Expr right;

	public Binary(Expr e, Token t, Expr ex) {
		super(t);
		this.left=e;
		this.right=ex;
	}
	
	public Expr getLeft(){
		return this.left;
	}
	
	public Expr getRight(){
		return this.right;
	}
	
	protected void setRight(Expr e){
		this.right=e;
	}
	
	protected void setLeft(Expr e){
		this.left=e;
	}

	public void printInorder() {
		getLeft().printInorder();
		System.out.print(getToken());
		getRight().printInorder();
	}

	
	
}
