package abstractClasses;

public class PersonTest{
	public static void main(String args[]) {
//		ppp = new Person("sdfsdfsdf");
		//�����಻�ܱ�ʵ����
		//�����Զ����������������� �ǳ�������Ķ���������ʾ
		Person[] people = new Person[2];
		people[0] = new Employee("Cell",8000,1992,10,20);
		people[1] = new Student("Niel","computer science");
		for(Person p:people)
			System.out.println(p.getDescription());
	}
}