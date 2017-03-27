import lexer.Token;


public abstract class Atomic extends Expr{
	public Atomic(Token t){
		super(t);
	}

	public void printInorder() {
		System.out.print(super.getToken());
	}
}
