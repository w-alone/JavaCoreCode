package abstractClasses;

//����һ������abstract����������Ҫ����Ϊ abstract

public abstract class Person{
	public abstract String getDescription();
	//ʹ��abstract�ؼ��֣����Բ���ʵ�־��巽�������������б���ʵ��
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