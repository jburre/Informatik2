import java.util.Stack;

import lexer.ExprLexer;
import lexer.Token;

public class TreeBuilder {

	private ExprLexer eLexer;

	public TreeBuilder(String s) {

		eLexer = new ExprLexer(s);
	}

	public Expr evalPostfix() {

		Stack<Expr> stack = new Stack<Expr>();

		int typ=0;

		Token token;
		token = eLexer.nextToken();
		typ = token.getType();

		while (typ != ExprLexer.NL) {

			switch (typ) {

			case ExprLexer.NL:
				break;
			case ExprLexer.OPERAND:
				stack.push(new Int(token));
				break;
			case ExprLexer.BINOP:
				stack.push(baum(stack, token));
				break;
			 case ExprLexer.UNAOP : 
				 stack.push(unary(stack, token)); 
				 break;
			}
			
			token = eLexer.nextToken();
			typ = token.getType();
		}
		return stack.pop();
	}

	public Expr unary(Stack<Expr> s, Token t){
		Expr zahl = s.pop();
		Uminus uminusTree = new Uminus(zahl,t);
		return uminusTree;
	}
	
	public Expr baum(Stack<Expr> s, Token t) {
		Expr r = s.pop();
		Expr l = s.pop();
		String operand = t.getText();
		
		switch (operand) {
		case "+":
			Add addTree = new Add(l, t, r);
			return addTree;
		case "-":
			Sub subTree = new Sub(l, t, r);
			return subTree;
		case "*":
			Multi mulTree = new Multi(l,t,r);
			return mulTree ;
		case "/" : 
			Div divTree = new Div(l,t,r);
			return divTree;
		default: throw new Error("invalid operand: "+ operand);
		}
		
	}
}