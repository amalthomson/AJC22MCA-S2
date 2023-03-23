import java.util.*;

public class employees {
	int id;
	String name;
	int salary;
	
	public void get() {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter Employee id: ");
		id = value.nextInt();
		System.out.print("Enter Employee name: ");
		name = value.next();
		System.out.print("Enter Employee salary: ");
		salary = value.nextInt();
	}
	
	public void out(){
		System.out.println("Employee no is: " + id );
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + salary);
	}

	
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = value.nextInt();
		employees array[] = new employees[size];
		System.out.println("Enter the elements of Array");
		for (int i=0;i<size;i++)
		{
			array[i] = new employees();
			array[i].get();
		}
		System.out.println("The Elements of Array are: ");
		for (int i=0;i<size;i++)
		{
			array[i].out();
		}
		System.out.println("Employees with salary between 1000 and 15000 are:");
		int flag=0;
		for (int i=0;i<size;i++)
		{
			if (array[i].salary >=1000 && array[i].salary <=15000)
			{
				array[i].out();
				flag++;
			}
		}
		if (flag == 0)
		{
			System.out.println("No Employees have salary between 1000 and 15000");
		}
	}
}