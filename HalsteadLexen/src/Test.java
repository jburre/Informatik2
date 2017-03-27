import java.io.FileInputStream;
import java.io.InputStream;

import halstead.lexer.HalsteadLexer;

import org.antlr.runtime.*;

import Listen.TreeMultiset;

/**
 * Mainklasse zum Auslesen eines C-Programms und der Analyse dieses
 * @author Lyz
 *
 */
public class Test {
	
	/**
	 * Liest ein C-Programm ein und analysiert es anhand der Parameter.
	 * @param args Leere Argumente
	 * @throws Exception Wirft eine Exception, wenn keine File gefunden wurde
	 */
	public static void main(String[] args) throws Exception {
		TreeMultiset<String> allOperands =  new TreeMultiset<String>();
		TreeMultiset<String> allOperators = new TreeMultiset<String>();
		
		
		CharStream input = null;
		
		String path ="C:/Users/Lyz/Desktop/Beispiel.c";
		InputStream is = new FileInputStream(path);
		// Pick an input stream (filename from commandline or stdin)
		if ( args.length>0 ) {
			input = new ANTLRFileStream(args[0]);
		}
		else {
			input = new ANTLRInputStream(is);
		}
		HalsteadLexer lex = new HalsteadLexer(input);
		Token t = lex.nextToken();
		while ( t==null || t.getType()!= HalsteadLexer.EOF ) {//Token.EOF works as well
			
			if (t.getType()==HalsteadLexer.OPERAND){
				allOperands.add(t.getText());
			}
			if (t.getType()==HalsteadLexer.OPERATOR){
				allOperators.add(t.getText());
			}
			
			/*
			System.out.printf("%2d:%2d Typ-Code: %2d Lexem: %s\n",
			t.getLine(),
			t.getCharPositionInLine() + 1,
			t.getType(),
			t.getText());
			*/
			t = lex.nextToken();
		}
		Halstead h = new Halstead(allOperands, allOperators);
		System.out.println("Operatoren:\n"+allOperators);
		System.out.println("Operanden:\n"+allOperands);
		//double N = allOperators.getTotal()+allOperands.getTotal();
		//System.out.println("N: "+N);
		System.out.println("N: "+h.N());
		//double N1 = allOperators.getTotal();
		System.out.println("N1: "+h.N1());
		//double N2 = allOperands.getTotal();
		System.out.println("N2: "+h.N2());
		//double n1 = allOperators.distinct();
		System.out.println("n1: "+h.n1());
		//double n2 = allOperands.distinct();
		System.out.println("n2: "+h.n2());
		//double n = (allOperands.size()+allOperators.size());
		System.out.println("n: "+ h.n());
		//double V = N * (Math.log(n)/Math.log(2));
		System.out.println("V: "+ h.V());
		//double D = ( n1/2 )* ( N2/n2 );
		System.out.println("D: "+ h.D());
		//double E = V*D;
		System.out.println("E: "+ h.E());
	}
}