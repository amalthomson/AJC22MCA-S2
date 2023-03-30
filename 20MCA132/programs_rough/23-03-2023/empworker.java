import java.util.*;
class Employee{
	int empid;
	String name;
	Employee(){
		 Scanner value = new Scanner(System.in);
		 System.out.print("Enter Emp id: ");
		 empid = value.nextInt(); 
		 System.out.print("Enter Name: ");
		 name = value.next();
	}
}
class Worker extends Employee{
	int wage;
	Worker(){
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Daily Wage: ");
		wage = value.nextInt(); 
	}
	void display(){
		System.out.println();
		System.out.println("Emp id: "+empid);
		System.out.println("Emp name: "+name);
		System.out.println("Emp wage: "+wage);
	}
}
class empworker{
  public static void main(String args[]){
		Worker obj = new Worker();
        obj.display();		
	}
}