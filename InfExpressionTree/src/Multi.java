import lexer.Token;


public class Multi extends Binary{

	public Multi(Expr e, Token t, Expr ex){
		super(e,t,ex);
	}
	
	public double eval(){
		double o = super.getLeft().eval();
		double u = super.getRight().eval();
		return o*u;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public double accept(EvalVisitor v) {
		return v.eval(this);
	}
}
