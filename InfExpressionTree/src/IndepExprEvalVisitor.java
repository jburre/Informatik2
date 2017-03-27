
public class IndepExprEvalVisitor implements EvalVisitor {
	
	public IndepExprEvalVisitor(){
		;
	}
	
	public double eval (Expr n){
		if(n.getClass()==Add.class){
			return eval((Add)n);
		}
		else if(n.getClass()==Sub.class){
			return eval((Sub)n);
		}
		else if(n.getClass()==Multi.class){
			return eval((Multi)n);
		}
		else if(n.getClass()==Div.class){
			return eval((Div)n);
		}
		else if (n.getClass()==Int.class){
			return eval((Int)n);
		}
		else if (n.getClass()==Uminus.class){
			return eval((Uminus)n);
		}
		else {
			throw new UnsupportedOperationException("Did not found that Expression.");
		}
		
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
