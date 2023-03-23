import java.util.*;
class Employe{
	int eid;
	String ename,edesig;
	void get(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter employ id");
		eid=sc.nextInt();
		System.out.println("Enter employ name");
        ename=sc.next();
		System.out.println("Enter employ designation");
        edesig=sc.next();
	}
}
class salary extends Employe{
	float b,hra,da,g;
	void get1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		b=sc.nextFloat();
		System.out.println("Enter HRA");
		hra=sc.nextFloat();
		System.out.println("Enter DA");
		da=sc.nextFloat();
		g=b+hra+da;
	}
	void display(){
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee Designation: "+edesig);
		System.out.println("Basic salary: "+b);
		System.out.println("House rent allowance: "+hra);
		System.out.println("Daily allowance: "+da);
		System.out.println("Gross salary: "+g);
	}
	public static void main(String[] args){
        salary s=new salary();
        s.get();
        s.get1();
        s.display();
	}
}	