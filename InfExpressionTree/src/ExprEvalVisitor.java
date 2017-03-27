
public class ExprEvalVisitor implements EvalVisitor{
	
	public ExprEvalVisitor(){
		;
	}

	public double eval(Add a) {
		double i = a.getLeft().eval() + a.getRight().eval();
		return i;
	}

	public double eval(Sub s) {
		double i = s.getLeft().eval() - s.getRight().eval();
		return i;
	}

	public double eval(Uminus u) {
		double i =(-1)* u.getChild().eval();
		return i;
	}

	public double eval(Multi m) {
		double i = m.getLeft().eval() * m.getRight().eval();
		return i;
	}

	public double eval(Div d) {
		double i = d.getLeft().eval() / d.getRight().eval();
		return i;
	}

	public double eval(Int i) {
		return i.eval();
	}

}
