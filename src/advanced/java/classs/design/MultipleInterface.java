package advanced.java.classs.design;

import java.io.FileNotFoundException;

public class MultipleInterface implements I2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() throws FileNotFoundException {
		// FileNotFoundException is subclass of IO Exception so its ok to through a subclass
		
	}

}

interface I1 { 
	void m1() throws java.io.IOException; 
	} 
interface I2 { 
	void m1() throws java.io.FileNotFoundException; 
	}