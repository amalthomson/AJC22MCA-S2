import java.util.Scanner;
class CO4_9 {
	public void sort(int a[],int n ){
		int t;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
	}
}
public static void main (String args[]){
	int n;
	Scanner obj =new Scanner(System.in);
	System.out.print("Enter the size: ");
	n=obj.nextInt();
	int b[]=new int[n];
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++){
		b[i]=obj.nextInt();
	}
	System.out.println("Array before sort: ");
	for(int i=0;i<n;i++){
		System.out.print(b[i] + "\t");
	}
	CO4_9 rt =new CO4_9();
	rt.sort(b,n);
	System.out.println("\n" + "Array after sort: ");
	for(int i=0;i<n;i++){
		System.out.print(b[i] + "\t");
	}
}
}
