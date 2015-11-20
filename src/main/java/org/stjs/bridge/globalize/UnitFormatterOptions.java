package org.stjs.bridge.globalize;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function1;

@SyntheticType
public class UnitFormatterOptions {
	public String form; //long, short, narrow
	public Function1<Double, String> numberFormatter;
}
