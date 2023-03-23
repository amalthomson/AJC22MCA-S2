import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = value.nextLine(); 
		
		System.out.println("Enter the phone number: ");
		int phone = value.nextInt();
		
		System.out.println(name);
		System.out.println(phone);
	}
}