
public class Test {

	public static void main(String[] args) {
		String test = "1 2 + 3 # - \n";
		
		TreeBuilder tb = new TreeBuilder(test);
		Expr ex = tb.evalPostfix();
		
		PrintInorderVisitor v1 = new PrintInorderVisitor();
		IndepInorderPrintVisitor v2 = new IndepInorderPrintVisitor(); 
		PreorderPrintvisitor v3 = new PreorderPrintvisitor();
		IndepPreorderPrintVisitor v4 = new IndepPreorderPrintVisitor();
		PostorderPrintvisitor v5 = new PostorderPrintvisitor();
		IndepPostorderPrintVisitor v6 = new IndepPostorderPrintVisitor();
		
		ExprEvalVisitor v7 = new ExprEvalVisitor();
		IndepExprEvalVisitor v8= new IndepExprEvalVisitor();
		
		ex.accept(v1);
		System.out.println();
		v2.print(ex);
		System.out.println();
		ex.accept(v3);
		System.out.println();
		v4.print(ex);
		System.out.println();
		ex.accept(v5);
		System.out.println();
		v6.print(ex);
		System.out.println();
		System.out.println();
		
		System.out.print(ex.accept(v7));
		System.out.println();
		System.out.print(v8.eval(ex));
	}

}
