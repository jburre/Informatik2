package lexer;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class ExprLexer extends Lexer {
    public static final int OPERAND = 2;
    public static final int BINOP   = 3;
    public static final int UNAOP   = 4;
    public static final int NL      = 5;
    public static String[] tokenNames =
        { "n/a","<EOF>","OPERAND","BINOP","UNAOP","NL"};
    public String getTokenName(int x) { return tokenNames[x]; }

    public ExprLexer(String input) { super(input); }
    boolean isLETTER() { return c>='a'&&c<='z' || c>='A'&&c<='Z'; }
    boolean isDIGIT()  { return c>='0'&&c<='9'; }

    public Token nextToken() {
        while ( c!=EOF ) {
            switch ( c ) {
                case ' ': case '\t':  WS(); continue;
                case '\r': consume();
                case '\n': consume(); return new Token(NL,"<NL>");
                case '+' : consume(); return new Token(BINOP, "+");
                case '-' : consume(); return new Token(BINOP, "-");
                case '#' : consume(); return new Token(UNAOP, "#");
                case '*' : consume(); return new Token(BINOP, "*");
                case '/' : consume(); return new Token(BINOP, "/");
                case '^' : consume(); return new Token(BINOP, "^");
                default:
                    if ( isDIGIT()  ) return INT();
                    throw new Error("invalid character: "+c);
            }
        }
        return new Token(EOF_TYPE,"<EOF>");
    }
 
    /** INT : ('0'..'9')+; // NAME is sequence of >=1 letter */
    Token INT() {
        StringBuilder buf = new StringBuilder();
        do { buf.append(c); consume(); } while ( isDIGIT() );
        return new Token(OPERAND, buf.toString());
    }
    /** WS : (' '|'\t')* ; // ignore any whitespace */
    void WS() {
        while ( c==' ' || c=='\t' ) consume();
    }
}
