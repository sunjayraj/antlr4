package org.sraj;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Translate {

	public static void main(String[] args) throws IOException {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in); 
		
		// create a lexer that feeds off of input CharStream
		ArrayInitLexer lexer = new ArrayInitLexer(input); 
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		
		// create a parser that feeds off the tokens buffer
		ArrayInitParser parser = new ArrayInitParser(tokens);
		// begin parsing at the 'init' rule
		ParseTree tree = parser.init(); 

		// create ParseTreeWalker to walk the tree that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();
		//walk the the tree during parse and trigger callbacks
		walker.walk(new ShortToUnicodeString(), tree);
		
		System.out.println();
	}

}
