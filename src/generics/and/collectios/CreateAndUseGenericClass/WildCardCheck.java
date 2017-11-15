package generics.and.collectios.CreateAndUseGenericClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Animal { }
 class Dog extends Animal { }
 class Cat extends Animal { }

public class WildCardCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<? super Animal> anything = new ArrayList<>();
		anything.add(new Dog());
		anything.add(new Cat());
		List<? extends Animal> anything2 = WildCardCheck.getAnimals();
		
		List<? extends Animal> anyAnimal = WildCardCheck.getDogs();
		anyAnimal =  WildCardCheck.getCats();
 	}

	public static List<? extends Animal> getAnimals() {
		boolean flag = false;
		List<Dog> dogList = new ArrayList<>();
		List<Cat> catList = new ArrayList<>();
		if (flag) {
			return dogList;
		} else {
			return catList;
		}
		
	}
	
	public static List<Dog> getDogs() {
		boolean flag = false;
		List<Dog> dogList = new ArrayList<>();
		return dogList;
		
	}
	
	public static List<Cat> getCats() {
		boolean flag = false;
		
		List<Cat> catList = new ArrayList<>();
			return catList;
		
		}
	
}
