package inheritance;

public class ManagerTest{
	public static void main(String args[]) {
		//Manager boss = new Manager("Carl Cracker",8000,1987,12,15);
		//boss.setBouns(5000);
	
		Employee[] staff = new Employee[3];
		//staff[0] = boss;
		
		staff[0] = new Manager("Carl Cracker",8000,1987,12,15);
		staff[1] = new Employee("Harry Hacker",5000,1990,12,1);
		staff[2] = new Employee("Cell Bence",5000,1990,2,2);
		
		if(staff[0] instanceof Manager) {
			Manager boss = (Manager)staff[0];
			boss.setBouns(5000);
		}
		
		for(Employee e : staff) {
			System.out.println("name: " + e.getName() + " Salary : " + e.getSalary());
		}
	}
}