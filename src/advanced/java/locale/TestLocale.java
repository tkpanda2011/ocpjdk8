package advanced.java.locale;

import java.util.Locale;

public class TestLocale {
	
	public static void main(String args[]) {
		Locale locale = new Locale.Builder().setLanguage("tn").setRegion("FR").build();
		System.out.println(locale);
		Locale locale2 = new Locale("fr","FR");
		Locale.setDefault(Locale.ITALIAN);
		System.out.println(locale2 +"  default is "+Locale.getDefault());
		Locale localeWithVarient = new Locale("en","IN","IN");
		System.out.println(localeWithVarient +" "+ localeWithVarient.getVariant());
		
		Locale onlylanguage = new Locale("tn");
		System.out.println(onlylanguage);
		
		
		Locale forlangTag = Locale.forLanguageTag("ja-IN");
		System.out.println("Locale.forLanguageTag(\"ja-IN\")  "+ forlangTag.getDisplayName());
		
		Locale locale1 = new Locale("en"); //#1
		 Locale locale21 = new Locale("en", "in"); //#2
		 Locale locale3 = new Locale("th", "TH", "TH"); //#3
		// Locale locale4 = new Locale(locale3); //#4
		 System.out.println(locale1 + " " + locale21 + " " + locale3 );
	}
}
