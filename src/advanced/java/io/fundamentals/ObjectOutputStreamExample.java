package advanced.java.io.fundamentals;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import advanced.java.util.Utility;

public class ObjectOutputStreamExample {

	public static void main(String[] args) {
		
		try(OutputStream stream = new FileOutputStream("Department.ser");
				ObjectOutputStream out = new ObjectOutputStream(stream );) {
			out.writeObject(Utility.getDepartments());
			// All the objects in the hirearcy must implement serializable
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
