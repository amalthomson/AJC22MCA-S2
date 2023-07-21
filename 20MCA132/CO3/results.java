import java.util.*;
interface student{
	public void get();
	public void disp();
}
interface sports{
	public void get1();
	public void disp1();
}
class results implements student,sports{
	float t,p;
	float m1,m2,m3;
	int rno;
	String name,sport,grade;
	public void get(){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter student rollno: ");
		rno=sc.nextInt();
		System.out.print("Enter student name: ");
        name=sc.next();
		System.out.print("Enter mark of Subject1 out of 100: ");
		m1=sc.nextFloat();
		System.out.print("Enter mark of subject2 out of 100: ");
		m2=sc.nextFloat();
		System.out.print("Enter mark of subject3 out of 100: ");
		m3=sc.nextFloat();
	}
	public void get1(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter sports item: ");
		sport=sc.next();
		System.out.print("enter grade: ");
		grade=sc.next();
	}
	void cal(){
	t=m1+m2+m2;
	p=(t/300)*100;
	}
	public void disp(){
		System.out.println("Student Name: "+name);
		System.out.println("Rollno: "+rno);
		System.out.println("Subject1 mark: "+m1);
		System.out.println("Subject2 mark: "+m2);
		System.out.println("Subject3 mark: "+m3);
		System.out.println("Total mark: "+t);
		System.out.println("Percentage: "+p);
	}
	public void disp1(){
	System.out.println("Sports item:"+sport);
	System.out.println("Grade:"+grade);
	}
	public static void main(String[] args){
        results s=new results();
        s.get();
        s.get1();
		s.cal();
        s.disp();
		s.disp1();
	}
}	