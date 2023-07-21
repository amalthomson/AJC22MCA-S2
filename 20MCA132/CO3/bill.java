import java.util.*;
interface calculate{
public void calc();
}
class bill implements calculate{
String date,name;
int qu,id;
float uprice,total;
Scanner sc= new Scanner(System.in);
public void get(){
		System.out.print("Enter product id: ");
		id=sc.nextInt();
		System.out.print("Enter product name: ");
		name=sc.next();
		System.out.print("Enter the quantity of the product: ");
		qu=sc.nextInt();
		System.out.print("Enter product unit price: ");
		uprice=sc.nextFloat();
}
public void calc(){
total=qu*uprice;
}
public void disp(){
System.out.println(id+"   	"+name+"  	 	"+qu+"  	 "+uprice+"  	 "+total);
}
public static void main(String[] args){
	int n,i,o;
	float net=0;
	String date;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter order number: ");
	o=sc.nextInt();
	System.out.print("Enter order date: ");
	date=sc.next();
	System.out.print("Enter no.of products: ");
    n=sc.nextInt();
	bill b[]=new bill[n];
	for(i=0;i<n;i++)
	{
		b[i]=new bill();
		b[i].get();
		b[i].calc();
	}
System.out.println("...........................BILL..........................");
System.out.println("_________________________________________________________");
System.out.println("Order no.:"+o);
System.out.println("Date:"+date);
System.out.println("_________________________________________________________");
System.out.println("ID     NAME     QUNTITY     PRICE");
System.out.println("_________________________________________________________");
for(i=0;i<n;i++)
	{
		b[i].disp();
		net=net+b[i].total;
	}
	System.out.println("_________________________________________________________");
	System.out.println("           			    Net Amount: "+net);
	System.out.println("_________________________________________________________");
}
}
