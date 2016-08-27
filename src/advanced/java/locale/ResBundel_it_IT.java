package advanced.java.locale;

import java.util.ListResourceBundle;

public class ResBundel_it_IT extends ListResourceBundle {

	static final Object[][] content  = {
			{"MovieName","avtarItaly"},
			{"GrossRevenue",(Long) 2782275172L},
			{"year",(Integer)2009}
	};
	
	public ResBundel_it_IT() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return content;
	}

}
