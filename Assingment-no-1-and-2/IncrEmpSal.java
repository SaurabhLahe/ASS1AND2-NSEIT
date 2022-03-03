package Assingment;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


class Employee {
	 String name;
	 double salary;
	 Employee(String name, double salary) {
	  this.name = name;
	  this.salary = salary;
	 }
	 
	 @Override
	 public String toString() {
	  return "{name=" + name + ", salary=" + salary + "}";
	 }
	}
	public class IncrEmpSal {
	 public static void main(String... args) {
	  ArrayList<Employee> i = new ArrayList<Employee>();
	  populate(i);
	  
	  System.out.println("Before Increment :");
	  System.out.println(i);
	  
	  Predicate<Employee> p = e -> e.salary < 4000;
	  Function<Employee, Employee> f = e -> {
	   e.salary += 500;
	   return e;
	  };
	  
	  ArrayList<Employee> i2 = new ArrayList<Employee>();
	  for(Employee e : i) {
	   if(p.test(e)) {
	    i2.add(f.apply(e));
	   }
	  }
	  
	  System.out.println("After Increment :");
	  System.out.println(i);
	  
	  System.out.println("Employees with incremented salary :");
	  System.out.println(i2);
	 }
	 
	 public static void populate(ArrayList<Employee> i) {
	  i.add(new Employee("Narendra", 1000));
	  i.add(new Employee("Amit", 2000));
	  i.add(new Employee("Vijay", 3000));
	  i.add(new Employee("Nitin", 4000));
	  i.add(new Employee("Nahera", 5000));
	  i.add(new Employee("Yogi", 10000));
	 }
	}
