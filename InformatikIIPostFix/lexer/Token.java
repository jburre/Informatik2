package lexer;

public class Token {
	private int type;
	private String text;
    
	public Token(int type, String text) {
   	 	this.type=type;
   	 	this.text=text;
   	}
    
   public int getType()		{ return this.type; }
    
   public String getText()	{ return this.text; }
    
   public String toString() {
   		String tname = ExprLexer.tokenNames[type];
   		return "<'"+text+"',"+tname+">";
   }
}
