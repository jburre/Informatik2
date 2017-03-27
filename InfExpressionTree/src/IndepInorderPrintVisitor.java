
public class IndepInorderPrintVisitor {
	
	public IndepInorderPrintVisitor(){
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
		System.out.print(n.getToken());
		print(n.getRight());
	}
	
	public void print (Atomic n){
		System.out.print(n.getToken());
	}
	
	public void print (Unary n){
		System.out.print(n.getToken());
		print(n.getChild());
	}
	
}
