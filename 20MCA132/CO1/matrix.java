import java.util.*;
public class matrix {
	public static void main (String[] args) {
		Scanner value = new Scanner(System.in);
		int i,j;
		
		System.out.println("Enter number of rows:");
		int row = value.nextInt();
		System.out.println("Enter number of columns:");
		int col = value.nextInt();
		
		int arr1[][] = new int[row][col];
		
		System.out.println("Enter Matrix_1 Elements ");
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr1[i][j] = value.nextInt();
			}	
		}
		System.out.println("Matrix_1 Elements are: ");
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		
		int arr2[][] = new int[row][col];
		
		System.out.println("Enter Matrix_1 Elements ");
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr2[i][j] = value.nextInt();
			}	
		}
		System.out.println("Matrix_1 Elements are: ");
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		int arr3[][] = new int[row][col];
		
		System.out.println("Addition of Matrix_1 & Matrix_2 is: ");
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}	
		}
		for (i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}