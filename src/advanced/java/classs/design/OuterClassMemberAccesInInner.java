package advanced.java.classs.design;

public class OuterClassMemberAccesInInner {
	public int i= 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new InnerMember().printData();
	}
	public static class InnerMember{
		private int y = 300;
		public void printData() {
		//	System.out.println(this.i);
		System.out.println(new OuterClassMemberAccesInInner().new InnerMember().y);
		System.out.println(i);
		}
	}
}
