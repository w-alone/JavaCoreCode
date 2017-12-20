package abstractClasses;

public class PersonTest{
	public static void main(String args[]) {
//		ppp = new Person("sdfsdfsdf");
		//抽象类不能被实例化
		//但可以定义抽象类对象，它引用 非抽象子类的对象，如下所示
		Person[] people = new Person[2];
		people[0] = new Employee("Cell",8000,1992,10,20);
		people[1] = new Student("Niel","computer science");
		for(Person p:people)
			System.out.println(p.getDescription());
	}
}