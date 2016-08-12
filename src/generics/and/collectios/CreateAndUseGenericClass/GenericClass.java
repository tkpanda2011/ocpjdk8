package generics.and.collectios.CreateAndUseGenericClass;

public class GenericClass<T,M> {
	private T obj;
	private M obj2;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public M getObj2() {
		return obj2;
	}

	public void setObj2(M obj2) {
		this.obj2 = obj2;
	}

	public GenericClass(T obj, M obj2) {
		super();
		this.obj = obj;
		this.obj2 = obj2;
	}
	
	public GenericClass(T obj) {
		super();
		this.obj = obj;
		
	}
	
	public GenericClass() {
		super();
		
	}
	
	
	
}
