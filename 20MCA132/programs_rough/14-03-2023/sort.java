import java.util.*;

public class sort {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		int i,j;
		String temp;
		System.out.println("Enter the size of Array: ");
		int size = value.nextInt();
		
		String array[] = new String[size];
		
		System.out.println("Enter the elements of Array");
		for (i=0;i<size;i++)
		{
			array[i] = value.nextLine();
		}
		
		System.out.println("The Array is: ");
		for (i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
		
		for (i=0;i<size;i++)
		{
			for (j=i+1;j<size;j++)
				if (array[i].compareTo(array[j])>0)
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
		}
		
		System.out.println("The Sorted Array is: ");
		for (i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
	}
}