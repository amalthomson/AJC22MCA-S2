import java.util.*;
class Student{
	int rollno;
	String name;
	Student(){
		 Scanner value = new Scanner(System.in);
		 System.out.print("Enter Student id: ");
		 rollno = value.nextInt();
		 System.out.print("Enter Name: ");
		 name = value.next();	 
	}
}
class Test extends Student{
	int mark1;
    int mark2;
	Test(){
		 Scanner value = new Scanner(System.in);
		 System.out.print("Enter mark1: ");
		 mark1 = value.nextInt();
		 System.out.print("Enter mark2: ");
		 mark2 = value.nextInt();	 
	}	
}
class Result extends Test{
	int total,per;
	void total(){
		total = mark1+mark2;
		per = (total / 200)*100;
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Total mark obtained: "+total);
		System.out.println("Total mark obtained: "+per);
	}
}
class stumarks{
  public static void main(String args[])
	{
		Result obj = new Result();
        obj.total();		
	}
}