import java.util.*;
class Box{
	int length,width,height;
	Box(){
		 Scanner value = new Scanner(System.in);
		 System.out.print("Enter length: ");
		 length = value.nextInt(); 
		  System.out.print("Enter width: ");
		 width = value.nextInt(); 
		  System.out.print("Enter height: ");
		 height = value.nextInt(); 		 
	}
}
class Cupboard extends Box{
	int shelves;
	Cupboard(){
		 Scanner value = new Scanner(System.in);
		 System.out.print("Enter no of shelves: ");
		 shelves = value.nextInt();   	 
	}
	void display(){
		System.out.println();
		System.out.println("length: "+length);
		System.out.println("width: "+width);
		System.out.println("height: "+height);
		System.out.println("no of shelves: "+shelves);
	}
}
class cupboardx{
  public static void main(String args[])
	{
		Cupboard obj = new Cupboard();
        obj.display();		
	}
}