import java.util.*;
public class SumN{
	void sum(int a,int b){
		System.out.println("Sum of two numbers: "+(a+b));
	}
	void sum(int c){
   int r=0;
   int sum=0;
   while(c>0){
   r=c%10;
   sum=sum+r;
   c=c/10;
   }
   System.out.println("Sum of digit is: "+sum);
   }

	void sum(String x,String y){
		System.out.println("Sum of two String: "+(x+y));
	}
	
public static void main(String[] args){
	SumN s=new SumN();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();
	System.out.println("Enter second number");
	int b=sc.nextInt();
	System.out.println("Enter the digit");
	int c=sc.nextInt();
	System.out.println("Enter first string");
	String x=sc.next();
	System.out.println("Enter second string");
	String y=sc.next();
	s.sum(a,b);
	s.sum(c);
	s.sum(x,y);
}
}
	