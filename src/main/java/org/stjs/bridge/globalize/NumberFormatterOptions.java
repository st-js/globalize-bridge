package org.stjs.bridge.globalize;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class NumberFormatterOptions {
	public Integer minimumIntegerDigits;
	public Integer minimumFractionDigits;
	public Integer maximumFractionDigits;
	public Integer minimumSignificantDigits;
	public Integer maximumSignificantDigits;
	public String round; //ceil
	public Boolean useGrouping;

	public String style; //decimal, percent (symbol, accounting, code, name for Currency)
}
