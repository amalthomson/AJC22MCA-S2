import java.util.*;
class Student{
	int rollno;
	String name;
	Student(){
		 Scanner value = new Scanner(System.in);
		 System.out.print("Enter rollno:");
		 rollno = value.nextInt();	 
		 System.out.print("Enter Name :");
		 name = value.next();	 
	}
}
class Marks extends Student{
	int m1,m2,m3,t,p;
	Marks(){
		 Scanner value = new Scanner(System.in);
		 System.out.print("Enter Mark1 :");
		 m1 = value.nextInt();
		  System.out.print("Enter Mark2 :");
		 m2 = value.nextInt();
		  System.out.print("Enter Mark3 :");
		 m3 = value.nextInt();	 
	}
	void result(){
		t = (m1+m2+m3);
		p = (t / 300) * 100;
		System.out.println("Rollno :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Total mark obtained :"+t);
		System.out.println("Total persentage obtained :"+p);
	}	
}
class studentmark{
  public static void main(String args[])
	{
		Marks obj = new Marks();
        obj.result();		
	}
}