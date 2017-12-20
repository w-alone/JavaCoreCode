package abstractClasses;


import java.time.*;
import java.util.*;

public class Student extends Person{
	private String major;
	public Student(String n,String m) {
		super(n);
		this.major = m;
	}
	public String getDescription() {
		return "a student majoring in " + major;
	}
  
}