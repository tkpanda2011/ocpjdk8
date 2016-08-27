package advanced.java.locale;

import java.util.ListResourceBundle;

public class ResBundel_hi_IN extends ListResourceBundle {

	static final Object[][] content  = {
			{"MovieName","avtarIndia"},
			{"GrossRevenue",(Long) 2782275172L},
			{"year",(Integer)2009}
	};
	
	public ResBundel_hi_IN() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return content;
	}

}
