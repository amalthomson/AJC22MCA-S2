import java.util.*;

public class employee {
	int id;
	String name;
	int salary;
	
	public void get() {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		id = value.nextInt();
		System.out.print("Enter Employee name: ");
		name = value.next();
		System.out.print("Enter Employee salary: ");
		salary = value.nextInt();
	}
	
	public void out(){
		System.out.println("Employee id is: " + id );
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + salary);
	}

	
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = value.nextInt();
		employee array[] = new employee[size];
		System.out.println("Enter the elements of Array");
		for (int i=0;i<size;i++)
		{
			array[i] = new employee();
			array[i].get();
		}
		System.out.println("The Elements of Array are: ");
		for (int i=0;i<size;i++)
		{
			array[i].out();
		}
		int flag = 0;
		System.out.println("Enter element to be searched: ");
		int item = value.nextInt();
		
		for (int i=0;i<size;i++)
		{
			if(array[i].id == item)
			{
				array[i].out();
				flag = flag+1;
				break;
			}
			
		}
		
		if (flag==0)
		{
			System.out.println("Element Not Foound");
		}
		
}

}