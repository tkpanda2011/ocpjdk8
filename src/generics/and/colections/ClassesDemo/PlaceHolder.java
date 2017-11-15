package generics.and.colections.ClassesDemo;

public class PlaceHolder <K,V> {
	
	private K k;
	private V v;
	
	public PlaceHolder (K k,V v) {
		this.k = k;
		this.v = v;
	}
	
	public K getK () {return k; }
	
	public static <X> PlaceHolder<X,X> getDuplicateHolder (X x) {
		return new PlaceHolder<X, X>(x, x);
		}
	public static void main(String[] args) {
		PlaceHolder<String, String> placeHolder =  PlaceHolder.getDuplicateHolder("b");
		System.out.println(placeHolder.getK());
	/*	PlaceHolder<String, String> placeHolder2 =  PlaceHolder<String>.getDuplicateHolder("b");
		System.out.println(placeHolder2.getK());
		PlaceHolder<String, String> placeHolder3 =  PlaceHolder<>.getDuplicateHolder("b");
		System.out.println(placeHolder3.getK());*/
		
		PlaceHolder<> placeHolder4 = new PlaceHolder<String, String>("10", "20");
		PlaceHolder<?,?> placehHolder5 = new PlaceHolder(10,10);
	}

}
