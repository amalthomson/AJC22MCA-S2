import java.util.*;
class Employee{
	int eid;
	String ename;
	int esal;
	String eadd;
	Employee(int id, String name, int salary , String add){
		eid=id;
		ename=name;
		esal=salary;
		eadd=add;
	}
}
class Teacher extends Employee{
	String dep;
	String sub;
	Teacher(int id, String name, int salary , String add,String dept, String subt){
		super(id,name,salary,add);
		dep=dept;
		sub=subt;
	}
	void show(){
		System.out.println();
		System.out.println("Employee Details");
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+ename);
		System.out.println("Employee salary: "+esal);
		System.out.println("Employee address: "+eadd);
		System.out.println("Employee department: "+dep);
		System.out.println("Subject taught: "+sub);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the no. of Employees:");
		int l =sc.nextInt();
		Teacher t[]=new Teacher[l];
		for(i=0;i<l;i++)
		{
			System.out.println("Enter the employee id:");
			int id=sc.nextInt();
			System.out.println("Enter the employee name:");
			String name= sc.next();
			System.out.println("Enter the employee salary:");
			int salary=sc.nextInt();
			System.out.println("Enter the employee address:");
			String add=sc.next();
			System.out.println("Enter the employee department:");
			String dept=sc.next();
			System.out.println("Enter the Subject taught:");
			String subt=sc.next();
			t[i]= new Teacher(id,name,salary,add,dept,subt);	
		}
		for(i=0;i<l;i++)
		{
			t[i].show();
		}
	}
}