package advanced.java.locale;

import java.util.Locale;

public class TestLocale {
	
	public static void main(String args[]) {
		Locale locale = new Locale.Builder().setLanguage("tn").setRegion("FR").build();
		System.out.println(locale);
		Locale locale2 = new Locale("fr","FR");
		System.out.println(locale2 +"default is "+Locale.getDefault());
		Locale localeWithVarient = new Locale("tn","FR","sSB");
		System.out.println(localeWithVarient +" "+ localeWithVarient.getVariant());
		
		Locale onlylanguage = new Locale("tn");
		System.out.println(onlylanguage);
		
		
		Locale forlangTag = Locale.forLanguageTag("ja-IN");
		System.out.println("LangTag  "+ forlangTag.getDisplayName());
	}
}
