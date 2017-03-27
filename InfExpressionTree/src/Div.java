import lexer.Token;


public class Div extends Binary{

	public Div(Expr e, Token t, Expr ex){
		super(e,t,ex);
	}
	public double eval(){
		double d1 = super.getLeft().eval();
		double d2 = super.getRight().eval();
		return d1/d2;
	}
	
	public void printInorder(){
		super.getLeft().printInorder();
		System.out.print(" / ");
		super.getRight().printInorder();
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public double accept(EvalVisitor v) {
		return v.eval(this);
	}
}
