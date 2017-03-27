
public class IndepPostorderPrintVisitor {

	public IndepPostorderPrintVisitor(){
		;
	}

	public void print(Expr n){
		if(n.getClass()==Add.class){
			print((Binary)n);
		}
		else if(n.getClass()==Sub.class){
			print((Binary)n);
		}
		else if(n.getClass()==Multi.class){
			print((Binary)n);
		}
		else if(n.getClass()==Div.class){
			print((Binary)n);
		}
		else if (n.getClass()==Int.class){
			print((Atomic)n);
		}
		else if (n.getClass()==Uminus.class){
			print((Unary)n);
		}
		else {
			throw new UnsupportedOperationException("Did not found that Expression.");
		}
	}
	
	public void print (Binary n){
		print(n.getLeft());
		print(n.getRight());
		System.out.print(n.getToken());
	}
	
	public void print (Atomic n){
		System.out.print(n.getToken());
	}
	
	public void print (Unary n){
		print(n.getChild());
		System.out.print(n.getToken());
	}
}
