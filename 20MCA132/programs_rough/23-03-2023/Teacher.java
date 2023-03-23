import java.util.Scanner;
class Employee{
	int empid;
	String Ename;
	int Esalary;
	String Eaddress;
	Employee(int id, String name, int salary , String Add){
		empid=id;
		Ename=name;
		Esalary=salary;
		Eaddress=Add;
	}
}
class Teacher extends Employee{
	String department;
	String sub_taught;
	Teacher(int id, String name, int salary , String Add,String dept, String sub)
	{
		super(id,name,salary,Add);
		department=dept;
		sub_taught=sub;
	}

	void show(){
		System.out.println("The Employee id: "+empid);
		System.out.println("The Employee name: "+Ename);
		System.out.println("The Employee salary: "+Esalary);
		System.out.println("The Employee address: "+Eaddress);
		System.out.println("The Employee department: "+department);
		System.out.println("The Subject taught: "+sub_taught);
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
			int empid=sc.nextInt();
			System.out.println("Enter the employee name:");
			String empname= sc.next();
			System.out.println("Enter the employee salary:");
			int empsal=sc.nextInt();
			System.out.println("Enter the employee address:");
			String empaddress=sc.next();
			System.out.println("Enter the employee department:");
			String empdept=sc.next();
			System.out.println("Enter the Subject taught:");
			String empsub=sc.next();
			t[i]= new Teacher(empid,empname,empsal,empaddress,empdept,empsub);
			
		}
		for(i=0;i<l;i++)
		{
			t[i].show();
		}
	}
}