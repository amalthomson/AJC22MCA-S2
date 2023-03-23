import java.util.*;
public class array {
	public static void main (String[] args) {
		Scanner value = new Scanner(System.in);
		int i;
		int arr[] = new int[5];
		
		System.out.println("Enter Array Elements ");
		for (i=0;i<arr.length;i++)
		{
			arr[i] = value.nextInt();
		}
		
		System.out.println("Array Elements are: ");
		for (i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter Element to be searched: ");
		int element = value.nextInt();
		for (i=0;i<arr.length;i++)
		{
			if(arr[i] == element)
			{
				System.out.println("Element Found !!!");
				System.out.println("Element Found at Position: "+ (i+1));
				break;
			}
		}
		System.out.println("Element not found");
	}
}