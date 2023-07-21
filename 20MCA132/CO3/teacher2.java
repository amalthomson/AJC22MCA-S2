
import java.util.*;
class person{
	int age;
	String name,gender,add;
	 person(){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter person's name: ");
		name=sc.next();
		System.out.print("Enter person's gender: ");
		gender=sc.next();
		System.out.print("Enter person's address: ");
		add=sc.next();
		System.out.print("Enter person's age: ");
        age=sc.nextInt();
	}
}
class employee extends person{
	int id,sal;
	String company,quali;
 	employee(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee id: ");
        id=sc.nextInt();
		System.out.print("Enter company name: ");
		company=sc.next();
		System.out.print("Enter qualification: ");
		quali=sc.next();
		System.out.print("Enter salary: ");
        sal=sc.nextInt();
		
	}
}
class teacher2 extends employee{
	int tid;
	String dep,sub;
	teacher2(){
      Scanner sc=new Scanner(System.in);
		System.out.print("Enter teachers id: ");
        tid=sc.nextInt();
		System.out.print("Enter department name: ");
		dep=sc.next();
		System.out.print("Enter subject: ");
		sub=sc.next();
	}
	void display(){
	     System.out.println();
		 System.out.println("--------Details-------");
		System.out.println("Person's Name: "+name);
		System.out.println("Person's gender: "+gender);
		System.out.println("Address: "+add);
		System.out.println("Age: "+age);
		System.out.println("Employee id: "+id);
		System.out.println("Company name: "+company);
		System.out.println("Qualification: "+quali);
		System.out.println("Salary: "+sal);
		System.out.println("Teachers id: "+tid);
		System.out.println("Department name: "+dep);
		System.out.println("Subject: "+sub);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of persons: ");
		int n=sc.nextInt();
        teacher2 t[]=new teacher2[n];
		for(int i=0;i<n;i++)
		{
			t[i]=new teacher2();
		}
		for(int i=0;i<n;i++)
		{
          t[i].display();
		}
	}
}	