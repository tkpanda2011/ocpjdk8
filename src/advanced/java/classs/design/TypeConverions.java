package advanced.java.classs.design;
class Widget { 
	String data = "data"; 
	public void doWidgetStuff() 
	{ System.out.println(data); } 
	}  
class GoodWidget extends Widget{ 
	String data = "big data";  
	public void doWidgetStuff() {
		
		System.out.println(data);
	}
	
} 
public class TypeConverions{
	public static void main(String[] args) { 
		Widget w = new GoodWidget(); 
		((Widget)w).doWidgetStuff(); 
		} 
	}