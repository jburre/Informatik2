import java.util.Stack;

import lexer.ExprLexer;
import lexer.Token;

/**
 * Klasse zur Erstellung eines Postfix-Interpreters
 * @author Jan
 *
 */
public class Postfix {
	private ExprLexer eLexer;
	
	/**
	 * Konstruktor zur Erstellung eines Postfix-Objektes
	 * @param s zu berechnende Stringdarstellung des Postfixes
	 */
	public Postfix(String s){
		this.eLexer = new ExprLexer(s);
	}
	
	/**
	 * Eine Methode, die aus dem Postfixobjekt einen Double-Wert berechnet und Auswertet.
	 * @return einen Double-Wert, der durch die Postfixeingabe dargestellt wurde
	 * und berechnet wurde.
	 * @throws PostfixFehler Wenn ein unbekannter Operator verwendet wurde.
	 */
	public double evalPostFix()throws PostfixFehler{
		String typ="";
		Token token;
		Stack<Double> storage = new Stack<Double>();
		
		while(!typ.equals("NL")){
			token=eLexer.nextToken();
			typ=eLexer.getTokenName(token.getType());
			
			switch (typ){
			case "NL": 
				typ="NL"; 
				break;
			case "OPERAND":
				hinzu(storage,token);
				break;
			case "BINOP":
				berechnung(storage,token);
				break;
			case "UNAOP":
				umkehr(storage,token);
				break;
			default:
				throw new PostfixFehler("Unknown operator");
			}
		}
		return storage.pop();
		
	}

	/**
	 * Eine Methode, die den Binaeren Operator auswertet.
	 * @param storage Der Stack auf dem der Wert abgelegt werden soll.
	 * @param token Der zu verarbeitende Token.
	 * @throws PostfixFehler Eine Fehlermeldung, wenn der Operator auf einem leeren Stack angewendet werden soll.
	 */
	private void umkehr(Stack<Double> storage, Token token) throws PostfixFehler{
		if (storage.isEmpty()){ 
			throw new PostfixFehler("Tried to use a binary operator, but there is nothing to use it with. We are sorry. :(");
		}
		double i=storage.pop();
		i=-i;
		storage.add(i);
		
	}

	/**
	 * Fuegt den Wert des tokens dem Stack hinzu.
	 * @param storage Der Stack, auf dem abgelegt werden soll.
	 * @param token Der abzulegende Token.
	 */
	private void hinzu(Stack<Double> storage, Token token) {
		double i = Double.valueOf(token.getText());
		storage.add(i);
		
	}
	
	/**
	 * Methode, die Werte berechnet und je nach Operator eine Rechenoperation ausfuehrt.
	 * @param storage Der Stack, auf dem verarbeitet wird.
	 * @param token Der zu verarbeitende Operator.
	 * @throws PostfixFehler Wirft einen Fehler, wenn der Stack leer ist oder nur einen Operanden enthaelt.
	 */
	private void berechnung(Stack<Double>storage, Token token)throws PostfixFehler{
		if (storage.isEmpty()||storage.size()==1){
			throw new PostfixFehler("Tried to use an operator on non existent operands, but failed. We hope to see this feature in the future.");
		}
		double i=storage.pop();
		double j=storage.pop();
		double ergebnis;
		
		String typ=token.getText();
		switch(typ){
			case"+":
				ergebnis=j+i;
				break;
			case"-":
				ergebnis=j-i;
				break;
			case"*":
				ergebnis=j*i;
				break;
			case"/":ergebnis=j/i;
				break;
			case"^":
				ergebnis=Math.pow(j, i);
				break;
			default:
				throw new PostfixFehler("How did you manage to get this done? o.O");
		}
		storage.add(ergebnis);
	}
}
