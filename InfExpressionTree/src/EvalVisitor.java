
/**
 * @author Lyz
 *
 */
public interface EvalVisitor {
	public double eval (Add a);
	public double eval (Sub s);
	public double eval (Uminus u);
	public double eval (Multi m);
	public double eval (Div d);
	public double eval (Int i);
	
}
