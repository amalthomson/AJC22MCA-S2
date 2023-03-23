import java.util.*;
class student{
	int rno;
	String name;
	void get(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter student rollno");
		rno=sc.nextInt();
		System.out.println("Enter student name");
        name=sc.next();
	}
}
class mark extends student{
	float m1,m2,m3,t,p;
	void get1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark of Subject1 out of 100");
		m1=sc.nextFloat();
		System.out.println("Enter mark of subject2 out of 100");
		m2=sc.nextFloat();
		System.out.println("Enter mark of subject3 out of 100");
		m3=sc.nextFloat();
		t=m1+m2+m2;
		p=(t/300)*100;
	}
	void display(){
		System.out.println("Student Name: "+name);
		System.out.println("Rollno: "+rno);
		System.out.println("Subject1 mark: "+m1);
		System.out.println("Subject2 mark: "+m2);
		System.out.println("Subject3 mark: "+m3);
		System.out.println("Total mark: "+t);
		System.out.println("Percentage: "+p);
	}
	public static void main(String[] args){
        mark s=new mark();
        s.get();
        s.get1();
        s.display();
	}
}	