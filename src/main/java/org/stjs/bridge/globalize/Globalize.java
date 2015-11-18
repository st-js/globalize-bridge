package org.stjs.bridge.globalize;

import org.stjs.javascript.Array;
import org.stjs.javascript.Date;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.functions.Function1;

@STJSBridge
public class Globalize {

	//https://github.com/jquery/globalize/blob/master/doc/api/core/constructor.md
	public Globalize(String locale) {

	}
	
	@Template("invoke")
	public static native Globalize $invoke();
	
	@Template("invoke")
	public static native Globalize $invoke(String locale);

	//https://github.com/jquery/globalize/blob/master/doc/api/core/load.md
	public static void load(Object data){}

	//https://github.com/jquery/globalize/blob/master/doc/api/core/locale.md
	public static native Object locale();
	
	public static native Globalize locale(String locale);
	
	public static native Globalize locale(Cldr locale);
	
	//https://github.com/jquery/globalize/blob/master/doc/api/message/load-messages.md
	public static native void loadMessages(Object json);

	//https://github.com/jquery/globalize/blob/master/doc/api/currency/currency-formatter.md
	public native Function1<Double, String> currencyFormatter(String currency);

	public native Function1<Double, String> currencyFormatter(String currency, NumberFormatterOptions options);

	//https://github.com/jquery/globalize/blob/master/doc/api/date/date-formatter.md
	public native Function1<Date, String> dateFormatter();

	public native Function1<Date, String> dateFormatter(DateOptions options);

	//https://github.com/jquery/globalize/blob/master/doc/api/date/date-parser.md
	public native Function1<String, Date> dateParser();

	public native Function1<String, Date> dateParser(DateOptions options);

	//https://github.com/jquery/globalize/blob/master/doc/api/message/message-formatter.md
	public native Function1<Object, String> messageFormatter(String path);
	
	public native Function1<Object, String> messageFormatter(Array<String> path);

	//https://github.com/jquery/globalize/blob/master/doc/api/number/number-formatter.md
	public native Function1<Double, String> numberFormatter();
	
	public native Function1<Double, String> numberFormatter(NumberFormatterOptions options);
	//public native String formatNumber(Double number);
	//public native String formatNumber(Double number, NumberFormatterOptions options);

	//https://github.com/jquery/globalize/blob/master/doc/api/number/number-parser.md
	public native Function1<String, Double> numberParser();
	
	public native Function1<String, Double> numberParser(NumberParserOptions options);

	//https://github.com/jquery/globalize/blob/master/doc/api/plural/plural-generator.md
	public native Function1<String, String> pluralGenerator();
	
	public native Function1<String, String> pluralGenerator(PluralGeneratorOptions options);

	//https://github.com/jquery/globalize/blob/master/doc/api/relative-time/relative-time-formatter.md
	public native Function1<Double, String> relativeTimeFormatter(String unit);
	
	public native Function1<Double, String> relativeTimeFormatter(String unit, RelativeTimeFormatterOptions options);

	//https://github.com/jquery/globalize/blob/master/doc/api/unit/unit-formatter.md
	public native Function1<Double, String> unitFormatter(String unit, UnitFormatterOptions options);
}
