package interfaces;

import java.util.*;
public class EmployeeSortTest{
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry Hack",1200);
		staff[1] = new Employee("Jerry Hack",1400);
		staff[2] = new Employee("Funk Hack",1100);

		Arrays.sort(staff);

		for (Employee e:staff)
			System.out.println(e.getName());
	}
}