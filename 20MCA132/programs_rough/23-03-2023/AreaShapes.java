import java.util.*;

class AreaShapes{
int r,h,a,p1,p2,t2,t3;
double b,l,w,t1;

public void area(double r){	
	double c=3.14*(r*r);
	System.out.println("Area of circle: "+c);
}

public void area(double b,int h){
	double t=(b*h)/2;
	System.out.println("Area of triangle: "+t);
}

public void area(int a){
	int s=a*a;
	System.out.println("Area of square: "+s);
}

public void area(double l,double w){
	double r=l*w;
	System.out.println("Area of rectangle: "+r);
}
public void area(int p1,int p2){
	int p=p1*p2;
	System.out.println("Area of parallelogram: "+p);
}
public void area(double t1,int t2,int t3){
	double tr=0.5*(t2+t3)*t1;
	System.out.println("Area of trapezium: "+tr);
}
public void area(float e1,float e2){	
	double c=3.14*(e1*e2);
	System.out.println("Area of ellipse: "+c);
}

public static void main(String[] args){
	int choice;
    Scanner value = new Scanner(System.in);
	AreaShapes ashape = new AreaShapes();
	System.out.println("Area of different shapes"+"\n"+" 1.Circle"+"\n"+" 2.Triangle"+"\n"+" 3.Square "+"\n"+" 4.Rectangle "+"\n"+" 5.Parallelogram "+"\n"+" 6.Trapezium"+"\n"+" 7.Ellipse");
	do{
	System.out.print("Enter choice: ");
	choice = value.nextInt();
	switch(choice){
	case 1:{
		System.out.print("Enter the radius: ");
		double r = value.nextDouble();
		ashape.area(r);
		}
		break;
	case 2:{
		System.out.print("Enter the breadth: ");
		double b = value.nextDouble();
		System.out.print("Enter the height: ");
		int h = value.nextInt();
		ashape.area(b,h);
		}
		break;
	case 3:{
		System.out.print("Enter the length: ");
		int a = value.nextInt();
		ashape.area(a);
		}
		break;
	case 4:{
		System.out.print("Enter the length: ");
		double l = value.nextDouble();
		System.out.print("Enter the breadth: ");
		double w = value.nextDouble();
		ashape.area(l,w);
		}
		break;
	case 5:{
		System.out.print("Enter the base: ");
		int p1 = value.nextInt();
		System.out.print("Enter the vertical height: ");
		int p2 = value.nextInt();
		ashape.area(p1,p2);
		}
		break;
	case 6:{
		System.out.print("Enter the height of trapezium: ");
		double t1 = value.nextDouble();
		System.out.print("Enter the length of parallel side: ");
		int t2 = value.nextInt();
		System.out.print("Enter the length of parallel side: ");
		int t3 = value.nextInt();
		ashape.area(t1,t2,t3);
		}
		break;
	case 7:{
		System.out.print("Enter minor axis: ");
		float e1 = value.nextFloat();
		System.out.print("Enter major axis: ");
		float e2 = value.nextFloat();
		ashape.area(e1,e2);
		}
		break;
	}
	}
	while(choice != 7);
}
}

	