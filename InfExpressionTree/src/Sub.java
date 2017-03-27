import lexer.Token;


public class Sub extends Binary{

	public Sub(Expr e, Token t, Expr ex){
		super(e,t,ex);
	}
	
	public double eval(){
		double i = super.getLeft().eval();
		double j = super.getRight().eval();
		return i-j;
	}
	
	public void printInorder(){
		super.getLeft().printInorder();
		System.out.print(" - ");
		super.getRight().printInorder();
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public double accept(EvalVisitor v) {
		return v.eval(this);
	}
}
