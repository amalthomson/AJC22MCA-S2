import java.util.*;
public class symmetric{
	public static void main(String[] args){
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the dimension of the matrix :");
		int dim = value.nextInt();
		int array1[][] = new int[dim][dim];
		int array2[][] = new int[dim][dim];
		System.out.println("Enter the elements in matrix :");
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				array1[i][j] = value.nextInt();
			}
		}
		System.out.println("The matrix is: ");
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				System.out.print(array1[i][j] + "	");
			}
			System.out.println(" ");
		}
		System.out.println("The Transpose of the matrix: ");
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				array2[i][j]=array1[j][i];
			}
		}
				for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				System.out.print(array2[i][j] + "	");
			}
			System.out.println(" ");
		}
		int flag=0;
		for(int i=0;i<dim;i++){
			for(int j=0;j<dim;j++){
				if(array1[i][j] != array2[i][j]){
					flag=1;
					break;
			}
			}
		}
		if(flag==1){
			System.out.println("The matrix is not symmetric");
		}
		else{
			System.out.println("The matrix is symmetric");
		}
	
}
}
