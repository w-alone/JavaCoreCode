package clone;

public class CloneTest{
	public static void main(String[] args) {
		try {
			Employee original = new Employee("Jhon Q. Public",12500);
			original.setHireDay(22220200, 1, 1);
			Employee copy = original.clone();
			copy.raiseSalary(20);
			copy.setName("Mell");
			copy.setHireDay(2002, 1, 1);
			System.out.println("original " + original);
			System.out.println("copy " + copy);
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
