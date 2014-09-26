package org.sraj;

import org.sraj.ArrayInitParser.InitContext;
import org.sraj.ArrayInitParser.ValueContext;

public class ShortToUnicodeString extends ArrayInitBaseListener {
	@Override
	public void enterInit(InitContext ctx) {
		System.out.print('"');
	}
	@Override
	public void exitInit(InitContext ctx) {
		System.out.print('"');
	}
	@Override
	public void enterValue(ValueContext ctx) {
		int val = Integer.valueOf(ctx.INT().getText());
		System.out.printf("\\u%04x", val);
	}
}
