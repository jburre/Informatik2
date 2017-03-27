import lexer.ExprLexer;
import lexer.Token;


public class Uminus extends Unary{
	public Uminus(Expr e, Token t){
		super(e,t);
	}
	
	public double eval(){
		if (super.getChild().getToken().getType()==ExprLexer.BINOP){
			return super.getChild().eval();
		}
		else {
			double j = Double.parseDouble(super.getChild().getToken().getText());
			return j *(-1);
		}
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public double accept(EvalVisitor v) {
		return v.eval(this);
	}
}
