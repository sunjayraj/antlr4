package org.sraj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;

public class ExprJoyRide {

	public static void main(String[] args) throws IOException {
		String inputFile = null;
		if ( args.length>0 ) inputFile = args[0];
		InputStream is = System.in;
		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		
		ANTLRInputStream input = new ANTLRInputStream(is);
		
		
	}

}
