import lexer.Token;


public abstract class Node {

	private Token token;
	
	public Node(){
		;
	}
	
	public Node (Token t){
		this.setToken(t);
	}
	
	public Token getToken(){
		return this.token;
	}
	
	protected void setToken(Token t){
		this.token=t;
	}
	
	public String toString(){
		return getToken().toString();
	}
}
