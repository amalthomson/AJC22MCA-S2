import java.util.*;

public class complex {
	public static void main(String[] args){
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter first complex number: ");
		int r1 = value.nextInt();
		int i1 = value.nextInt();
		System.out.println(r1+"+"+i1+"i");
		
		
		System.out.println("Enter second complex number: ");
		int r2 = value.nextInt();
		int i2 = value.nextInt();
		System.out.println(r2+"+"+i2+"i");
		
		System.out.println("Sum of two complex numbers are: ");
		System.out.println(r1+r2 + "+" + (i1+i2) + "i");
		
		
	}
}