import Listen.TreeMultiset;


public class Halstead {

	private TreeMultiset<String> operands;
	private TreeMultiset<String> operators;
	
	public Halstead(TreeMultiset<String> operands, TreeMultiset<String> operators){
		this.operands = operands;
		this.operators = operators;
	}
	
	public double N(){
		double N = operators.size()+operands.size();
		return N;
	}
	
	public double N1(){
		double N1 = operators.size();
		return N1;
	}
	
	public double N2(){
		double N2 = operands.size();
		return N2;
	}
	
	public double n(){
		double n = operators.distinct()+operands.distinct();
		return n; 
	}
	public double n1(){
		double n1 = operators.distinct();
		return n1;
	}
	public double n2(){
		double n2 = operands.distinct();
		return n2;
	}
	
	public double V(){
		double V = N()* (Math.log(n())/Math.log(2));
		return V;
	}
	
	public double D(){
		double D = ( n1()/2 )* ( N2()/n2() );
		return D;
	}
	
	public double E(){
		double E = V()*D();
		return E;
	}
}
