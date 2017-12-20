package abstractClasses;


import java.time.*;
import java.util.*;

public class Employee extends Person{
  private double salary;
  private LocalDate hireDay;

  public Employee(String n, double s, int year, int month, int day){
    super(n);
    this.salary = s;
    this.hireDay = LocalDate.of(year,month,day);
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
  
}