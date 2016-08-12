package advanced.java.classs.design;

public class AnnonymousInnerclass {

	public static void main(String[] args) {
		
		AnnonymousIntf intfImpl = new AnnonymousIntf() {

			@Override
			public void annonymousMethod() {
				// TODO Auto-generated method stub
				
			}
			
		
	};  // remember to put a ; at the end
	}
}

interface AnnonymousIntf {
	public void annonymousMethod ();
}
