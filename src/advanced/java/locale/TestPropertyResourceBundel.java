package advanced.java.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestPropertyResourceBundel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle bundel = ResourceBundle.getBundle("advanced.java.locale.MyProperty", Locale.getDefault());
		System.out.println(bundel.getString("age"));
		ResourceBundle bundelIT = ResourceBundle.getBundle("advanced.java.locale.MyProperty", 
				new Locale.Builder().setLanguage("it").setRegion("IT").build());
		System.out.println(bundelIT.getString("age"));
		ResourceBundle bundelITlang = ResourceBundle.getBundle("advanced.java.locale.MyProperty", 
				new Locale.Builder().setLanguage("it").build());
		System.out.println("Only lange "+bundelITlang.getString("age"));
	}

}
