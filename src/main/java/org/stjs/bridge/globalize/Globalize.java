package org.stjs.bridge.globalize;

import org.stjs.bridge.cldr.Cldr;
import org.stjs.javascript.Array;
import org.stjs.javascript.Date;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Function1;

public class Globalize {

	public Globalize(String locale) {

	}

	public Cldr cldr;

	//https://github.com/jquery/globalize/blob/master/doc/api/currency/currency-formatter.md
	public native Function1<Double, String> currencyFormatter(String currency);

	public native Function1<Double, String> currencyFormatter(String currency, NumberFormatterOptions options);

	public native String formatCurrency(Double value, String currency);

	public native String formatCurrency(Double value, String currency, NumberFormatterOptions options);


	//https://github.com/jquery/globalize/blob/master/doc/api/date/date-formatter.md
	public native Function1<Date, String> dateFormatter();

	public native Function1<Date, String> dateFormatter(DateOptions options);

	public native String formatDate();

	public native String formatDate(DateOptions options);


	//https://github.com/jquery/globalize/blob/master/doc/api/date/date-parser.md
	public native Function1<String, Date> dateParser();

	public native Function1<String, Date> dateParser(DateOptions options);

	public native Date parseDate();

	public native Date parseDate(DateOptions options);


	//https://github.com/jquery/globalize/blob/master/doc/api/message/message-formatter.md
	public native Function1<Object, String> messageFormatter(String path);

	public native Function1<Object, String> messageFormatter(Array<String> path);

	public native String formatMessage(String path);

	public native String formatMessage(String path, Object... variables);

	public native String formatMessage(String path, Map<String, Object> variables);


	//https://github.com/jquery/globalize/blob/master/doc/api/number/number-formatter.md
	public native Function1<Double, String> numberFormatter();

	public native Function1<Double, String> numberFormatter(NumberFormatterOptions options);

	public native String formatNumber(Double number);

	public native String formatNumber(Double number, NumberFormatterOptions options);


	//https://github.com/jquery/globalize/blob/master/doc/api/number/number-parser.md
	public native Function1<String, Double> numberParser();

	public native Function1<String, Double> numberParser(NumberParserOptions options);

	public native Double parseNumber(String number);

	public native Double parseNumber(String number, NumberParserOptions options);


	//https://github.com/jquery/globalize/blob/master/doc/api/plural/plural-generator.md
	public native String plural(Integer value);

	public native String plural(Integer value, PluralGeneratorOptions options);

	public native Function1<Integer, String> pluralGenerator();

	public native Function1<Integer, String> pluralGenerator(PluralGeneratorOptions options);


	//https://github.com/jquery/globalize/blob/master/doc/api/relative-time/relative-time-formatter.md
	public native Function1<Double, String> relativeTimeFormatter(String unit);

	public native Function1<Double, String> relativeTimeFormatter(String unit, RelativeTimeFormatterOptions options);

	public native String formatRelativeTime(Double time, String unit);

	public native String formatRelativeTime(Double time, String unit, RelativeTimeFormatterOptions options);


	//https://github.com/jquery/globalize/blob/master/doc/api/unit/unit-formatter.md
	public native Function1<Double, String> unitFormatter(String unit, UnitFormatterOptions options);

	public native String formatUnit(Double value, String unit, UnitFormatterOptions options);
}
