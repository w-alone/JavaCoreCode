package clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable{
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
		hireDay = new Date();
	}
	
	public Employee clone() throws CloneNotSupportedException{
		//call Object.clone()
		Employee cloned = (Employee) super.clone();
		
		//clone mutable fields
		cloned.hireDay = (Date) hireDay.clone();
		
		return cloned;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHireDay(int year, int month, int day) {
		//Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
		hireDay.setTime(year*100000);
	}
	public void raiseSalary(double percent) {
		double raise = salary*percent/10;
		salary += raise;
	}
	public String toString() {
		return "name is " + name+" salary is " + salary + " hireDay is " + hireDay;
	}
	

}


