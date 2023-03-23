import java.util.*;

public class items {
	int no;
	String name;
	int cost;
	
	public void get() {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Item no: ");
		no = value.nextInt();
		System.out.print("Enter Item name: ");
		name = value.next();
		System.out.print("Enter Item cost: ");
		cost = value.nextInt();
	}
	
	public void out(){
		System.out.println("Item no is: " + no );
		System.out.println("Item name: " + name);
		System.out.println("Item cost: " + cost);
	}

	
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = value.nextInt();
		items array[] = new items[size];
		System.out.println("Enter the elements of Array");
		for (int i=0;i<size;i++)
		{
			array[i] = new items();
			array[i].get();
		}
		System.out.println("The Elements of Array are: ");
		for (int i=0;i<size;i++)
		{
			array[i].out();
		}
		System.out.println("Item with cost greater than 5000 are:");
		int flag=0;
		for (int i=0;i<size;i++)
		{
			if (array[i].cost > 5000)
			{
				array[i].out();
				flag++;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.println("No Items are with cost greater than 5000");
		}
	}
}