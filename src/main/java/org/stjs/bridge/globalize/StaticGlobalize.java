package org.stjs.bridge.globalize;

import org.stjs.bridge.cldr.Cldr;
import org.stjs.javascript.annotation.Template;

public class StaticGlobalize extends Globalize {

	//https://github.com/jquery/globalize/blob/master/doc/api/core/constructor.md
	public StaticGlobalize(String locale) {
		super(locale);
	}

	@Template("invoke")
	public native Globalize $invoke(String locale);

	//https://github.com/jquery/globalize/blob/master/doc/api/core/locale.md
	public native Cldr locale();

	public native Cldr locale(String locale);

	public native Cldr locale(Cldr locale);

	//https://github.com/jquery/globalize/blob/master/doc/api/core/load.md
	public native void load(Object data);

	//https://github.com/jquery/globalize/blob/master/doc/api/message/load-messages.md
	public native void loadMessages(Object json);
}
