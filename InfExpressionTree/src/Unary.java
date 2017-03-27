import lexer.Token;


public abstract class Unary extends Expr{
	private Expr child;
	
	public Unary(Expr e, Token t){
		super(t);
		this.child=e;
	}
	
	public Expr getChild(){
		return this.child;
	}
	protected void setChild(Expr e){
		this.child=e;
	}
	
	public void printInorder() {
		getChild().printInorder();
		System.out.print(super.getToken());
	}

}
