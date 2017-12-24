package interfaces;

public class Employee implements Comparable<Employee>{
	private String name;
	private double salary;
	
	public Employee(String n, double s){
		name = n;
		salary = s;
	}

	public String getName(){
		return this.name;
	}

	public double getSalary(){
		return this.salary;
	}

	public void raiseSalary(double percent){
		double raise = salary*percent/10;
		salary += raise;
	}

	public int compareTo(Employee other) {
		return Double.compare(salary,other.salary);
	}
}
