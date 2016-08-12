package advanced.java.classs.design;

public class CreateUseLambdaexpression1 {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i<5 ;i++) {
					System.out.println("OUT"+i);
				}
				
			}
		};
		runnable.run();
		
	//using lambda 
		
	new Thread(
			() -> {
				for (int i=0; i<5 ;i++) {
				System.out.println("hello");
				}
			}
			).start();
	
	//using interface
	
	Runnable r = ()-> {
		System.out.println("hello");
	};
	
	 new Thread(r).start();
	 // this implementaion can avoid creating multiple java classes , we can create different instance and pass to Thread instantly 
}
	
}
