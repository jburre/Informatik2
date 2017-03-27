import lexer.Token;


public class Add extends Binary{

	public Add(Expr e, Token t, Expr ex){
		super(e,t,ex);
	}
	
	public double eval(){
		double l = super.getLeft().eval();
		double r = super.getRight().eval();
		return l+r;
	}
	
	public void printInorder(){
		super.getLeft().printInorder();
		System.out.print(" + ");
		super.getRight().printInorder();
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public double accept(EvalVisitor v) {
		return v.eval(this);
	}

}
