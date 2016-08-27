package advanced.java.locale;

import java.util.ListResourceBundle;

public class ResBundelt extends ListResourceBundle {

	static final Object[][] content  = {
			{"MovieName","avtar"},
			{"GrossRevenue",(Long) 2782275172L},
			{"year",(Integer)2009}
	};
	
	public ResBundelt() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return content;
	}

}
