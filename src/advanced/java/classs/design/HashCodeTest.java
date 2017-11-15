package advanced.java.classs.design;

import java.util.HashSet;
import java.util.Set;

public class HashCodeTest {

	public static void main(String[] args) {
		Set<Circle> circles = new HashSet<>();
		circles.add(new HashCodeTest.Circle(10,20,5));
		System.out.println(circles.contains( new HashCodeTest.Circle(10,20,5)));
		// above line will print false if hashCode is not implemented in Circle
	}
	
	private static class Circle {
		int x, y, radius;
		public Circle (int x, int y, int radius) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		}
		
		/*@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = x+y+radius;
			return result;
		}*/

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Circle other = (Circle) obj;
			/*if (!getOuterType().equals(other.getOuterType()))
				return false;*/
			if (radius != other.radius)
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}

		/*private HashCodeTest getOuterType() {
			return HashCodeTest.this;   // HashCodeTest.this valid only if circle is non static
		}*/
	}
}
