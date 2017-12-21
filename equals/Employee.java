package equals;


import java.time.*;
import java.util.*;

public class Employee{
  private String name;
  private double salary;
  private LocalDate hireDay;

  public Employee(String n, double s, int year, int month, int day){
    this.name = n;
    this.salary = s;
    this.hireDay = LocalDate.of(year,month,day);
  }

  public String getName(){
    return name;
  }

  public double getSalary() {
	  return salary;
  }
  
  public LocalDate getHireDay() {
	  return hireDay;
  }
  
  public String getDescription() {
	  return String.format("an employee with $ %.2f", salary);
  }
  
  public void raiseSalary(double byPercent) {
	  double raise = salary*byPercent/100;
	  salary += raise;
  }

  public boolean equals(Object otherObject){
    if(this == otherObject) return true;
    if(otherObject == null) return false;
    if(getClass() != otherObject.getClass()) return false;
    Employee other = (Employee) otherObject;
    return Objects.equals(name,other.name) && salary == other.salary && Objects.equals(hireDay,other.hireDay);
  }

  public int hashCode(){
    return Objects.hash(name,salary,hireDay);
  }

  public String toString(){
    return getClass().getName()+"[name= " + name + " salary=" + salary + " hireDay="+hireDay+"]";
  }
  
}