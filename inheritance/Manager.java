package inheritance;

//子类的方法不能访问超类的私有域
//java中的继承都是公有继承
//final class表示不允许扩展的类
//final 修饰的方法不允许被子类覆盖，final类中方法默认被修饰为final，但不包括域

public class Manager extends Employee{
// key word "extend" means inherite
	private double bouns;

	public Manager(String n, double s, int year, int month, int day) {
		super(n,s,year,month,day);
		//不能访问私有变量，所以要通过super方法构造私有变量
		//使用super构造器必须是子类构造起的第一句,且会自动默认调用，所以超类中要含一个无参数的构造器
		bouns = 0;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		//子类不能直接访问超类private域，可以通过超类的方法访问，加上关键字super()表示超类
		return  baseSalary + bouns; 
	}
	
	public void setBouns(double b){
		bouns = b;
	}
}

