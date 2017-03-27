import lexer.Token;


public abstract class Expr extends Node{

	public Expr(Token t){
		super(t);
	}
	
	public abstract void printInorder();
	
	public abstract double eval();
	
	public abstract void accept (Visitor v);
	public abstract double accept (EvalVisitor v);
}
