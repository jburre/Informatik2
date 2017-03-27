import lexer.Token;


public class Int extends Atomic{
	public Int(Token t){
		super(t);
	}
	
	public double eval(){
		double i = Double.parseDouble(super.getToken().getText());
		return i;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}


	public double accept(EvalVisitor v) {
		return v.eval(this);
	}
}
