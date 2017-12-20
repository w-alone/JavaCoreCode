package abstractClasses;

//包含一个或多个abstract方法的类需要声明为 abstract

public abstract class Person{
	public abstract String getDescription();
	//使用abstract关键字，可以不用实现具体方法，但在子类中必须实现
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public Person() {
		;
	}
	public String getName() {
		return name;
	}
}