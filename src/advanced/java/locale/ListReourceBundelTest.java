package advanced.java.locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class ListReourceBundelTest {

	public ListReourceBundelTest() {}
	public static void main (String args[]) {

		
		ResourceBundle bundel = ResourceBundle.getBundle("advanced.java.locale.ResBundel", new Locale.Builder().setLanguage("fr").setRegion("FR").build());
		
		System.out.println("Moviename : "+bundel.getObject("MovieName"));
		System.out.println("GrossRevenue : "+bundel.getObject("GrossRevenue"));
		System.out.println("year : "+bundel.getObject("year"));
		
ResourceBundle bundelItaly = ResourceBundle.getBundle("advanced.java.locale.ResBundel", new Locale("it","IT"));
		
		System.out.println("Moviename : "+bundelItaly.getObject("MovieName"));
		System.out.println("GrossRevenue : "+bundelItaly.getObject("GrossRevenue"));
		System.out.println("year : "+bundelItaly.getObject("year"));
	
		
		ResourceBundle bundelOdiya = ResourceBundle.getBundle("advanced.java.locale.ResBundel", new Locale("or"));
				
				System.out.println("Moviename : "+bundelOdiya.getObject("MovieName"));
				System.out.println("GrossRevenue : "+bundelOdiya.getObject("GrossRevenue"));
				System.out.println("year : "+bundelOdiya.getObject("year"));
			
				
	}
}
