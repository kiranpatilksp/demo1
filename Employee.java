package Day1;
import java.util.*;

public class Employee {
	String name;
	int age;
	int salary;
	void record()
	{
		Scanner r= new Scanner(System.in);
		System.out.println("enter employee name");
		name=r.next();
		System.out.println("enter employee age");
		age=r.nextInt();
		System.out.println("enter employee salary");
		salary=r.nextInt();
		
	}
	void display()
	{
		System.out.println(" employee name="    + name);
		System.out.println(" employee age="    + age);
		System.out.println(" emoloyee salary="    + salary);
	}

	public static void main(String[] args) {
		Employee p1= new Employee();
		p1.record();
		p1.display();

	}

}
