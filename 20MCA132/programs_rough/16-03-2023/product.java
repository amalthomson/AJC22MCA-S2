import java.util.*;

public class product {
	int id;
	String name;
	int price;
	
	public void get() {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter product ID: ");
		id = value.nextInt();
		System.out.println("Enter product name: ");
		name = value.next();
		System.out.println("Enter product price: ");
		price = value.nextInt();
	}
	
	public void out(){
		System.out.println("Product id is: " + id );
		System.out.println("Product name: " + name);
		System.out.println("Product price: " + price);
	}
	
	public static void main(String[] args) {
		product p1 = new product();
		product p2 = new product();
		product p3 = new product();
		
		p1.get();
		p2.get();
		p3.get();
		
		p1.out();
		p2.out();
		p3.out();
		
		if(p1.price<p2.price && p1.price<p3.price)
		{
			System.out.println("P1 has the lowest price.");
		}
		else if(p2.price<p1.price && p2.price<p3.price)
		{
			System.out.println("P2 has the lowest price.");
		}
		else
		{
			System.out.println("P3 has the lowest price.");
		}
	}
}
