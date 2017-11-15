package advanced.java.classs.design;

import java.util.function.Consumer;

public class EnumTest {
	public static void main ( String[] args) {
		System.out.println(EnumExample.Employees.HARI);
		System.out.println(EnumExample.Employees.valueOf("HARI"));
		System.out.println(EnumExample.Employees.valueOf(EnumExample.Employees.class, "HARI"));
		System.out.println(EnumExample.Employees.HARI.getEmployee());
		
		
		System.out.println(EnumExample.Employees.values());
		
		System.out.println(EnumExample.Colors.RED == EnumExample.Colors.GREEN);
		
		EnumExample.Colors.RED.printString();
		Consumer<EnumExample.Colors> consume = EnumExample.Colors::printString;
		consume.accept(EnumExample.Colors.RED);
	}
}
