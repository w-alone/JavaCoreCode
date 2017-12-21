package equals;

public class EqualsTest{
	public static void main(String[] args) {
		Employee alice1 = new Employee("Alice Adams",7500,1987,12,15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Bob Brandson",5500,1989,12,15);
		Employee bb = new Employee("Bob Brandson",5500,1989,12,15);

		System.out.println("alice1 == alice2 is " + (alice1 == alice2));
		System.out.println("alice1 == alice3 is " + (alice1 == alice3));
		System.out.println("alice1.equals(alice3) is " + alice1.equals(alice3));
		System.out.println("alice3.equals(bb) is " + alice3.equals(bb));
		System.out.println("bb.toString(): " + bb.toString());

		Manager carl = new Manager("Carl Cracker",8000,1987,12,15);
		Manager boss = new Manager("Carl Cracker",8000,1987,12,15);
		//boss.setBouns(5000);

		System.out.println("boss.toString() " + boss);
		System.out.println("carl.equals(boss) " + carl.equals(boss));
		System.out.println("alice1.hashCode() is " + alice1.hashCode());
		System.out.println("alice3.hashCode() is " + alice3.hashCode());
		System.out.println("carl.hashCode() is " + carl.hashCode());
		System.out.println("bb.hashCode() is " + bb.hashCode());
	}

}