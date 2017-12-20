package inheritance;

//����ķ������ܷ��ʳ����˽����
//java�еļ̳ж��ǹ��м̳�
//final class��ʾ��������չ����
//final ���εķ������������า�ǣ�final���з���Ĭ�ϱ�����Ϊfinal������������

public class Manager extends Employee{
// key word "extend" means inherite
	private double bouns;

	public Manager(String n, double s, int year, int month, int day) {
		super(n,s,year,month,day);
		//���ܷ���˽�б���������Ҫͨ��super��������˽�б���
		//ʹ��super���������������๹����ĵ�һ��,�һ��Զ�Ĭ�ϵ��ã����Գ�����Ҫ��һ���޲����Ĺ�����
		bouns = 0;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		//���಻��ֱ�ӷ��ʳ���private�򣬿���ͨ������ķ������ʣ����Ϲؼ���super()��ʾ����
		return  baseSalary + bouns; 
	}
	
	public void setBouns(double b){
		bouns = b;
	}
}

