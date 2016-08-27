package advanced.java.locale;

import java.util.ListResourceBundle;

public class ResBundel_or extends ListResourceBundle {

	static final Object[][] content  = {
			{"MovieName","avtarORIndia"},
			{"GrossRevenue",(Long) 2782275172L},
			{"year",(Integer)2009}
	};
	
	public ResBundel_or() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return content;
	}

}
