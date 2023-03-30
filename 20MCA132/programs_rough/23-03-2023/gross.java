
import java.util.*;
class Employee{
	int empid;
	String name;
	String des;
	Employee(){
		 Scanner value = new Scanner(System.in);
		 System.out.print("Enter Emp id :");
		 empid = value.nextInt(); 
		 System.out.print("Enter Name :");
		 name = value.next();
		 System.out.print("Enter designation :");
		 des = value.next(); 
	}
}
class Salary extends Employee{
	double b,hra,da,gross;
	Salary(){
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Basic :");
		b = value.nextDouble(); 
		da =b*35/100;
		hra = b*15/100;
		gross = b+da+hra;
	}
	void display(){
		System.out.println("Emp id: "+empid);
		System.out.println("Emp name: "+name);
		System.out.println("Emp designation: "+des);
		System.out.println("DA: "+da);
		System.out.println("hra: "+hra);
		System.out.println("Emp gross: "+gross);
}
}
class gross{
  public static void main(String args[]){
		Salary obj = new Salary();
        obj.display();		
	}
}