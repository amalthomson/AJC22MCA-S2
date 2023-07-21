import java.util.*;
interface proto{
	public void area();
	public void perimeter();
	public void get();
}
class rect implements proto{
	int l,b;
	double r,peri;
	public void get(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the length of the rectangle: ");
	 l = sc.nextInt();
	 System.out.println("Enter the breadth of the rectangle: ");
	 b =sc.nextInt();
	}
	public void area(){
	 r=l*b;
	 System.out.println("Area of rectangle: "+r);
	}
	public void perimeter(){
		peri=(l+b)*2;
		System.out.println("Perimeter of rectangle: "+peri);
	}
}
 class circle implements proto{
	 double c,pe,r;
	 public void get(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the radius");
	 r=sc.nextInt();
	 }	 
	 public void area(){
	 c=3.14*(r*r);
	  System.out.println("Area of circle: "+c);
	 }
	 public void perimeter(){
		 pe=2*(3.14*(r*r));
		 System.out.println("Perimeter of circle: "+pe);
	 }
public static void main(String[] args){
	int c;
	Scanner sc=new Scanner(System.in);
	rect re=new rect();
    circle ci=new circle();
	do{
		System.out.println("1.Rectangle"+"\n"+"2.Circle"+"\n"+"3.Exit");
		System.out.println("Enter tour choice");
		c=sc.nextInt();
		switch(c){
			case 1:
				re.get();
			 	re.area();
			 	re.perimeter();
			 	break;
			case 2:
				 ci.get();
				 ci.area();
				 ci.perimeter();
			 	break;
		}
	}
	while(c!=2);
}
} 